package ru.digitalnovember.app.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.digitalnovember.app.dao.CompanyDAO;
import ru.digitalnovember.app.dao.VehicleDAO;
import ru.digitalnovember.app.model.Vehicle;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class VehicleService {

    private final VehicleDAO vehicleDAO;
    private final CompanyDAO companyDAO;

    public void initVehicles() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String str = FileUtils.readFileToString(new File("vehicles.json"), StandardCharsets.UTF_8);
        List<Vehicle> vehicles = mapper.readValue(str, new TypeReference<List<Vehicle>>() {
        });
        vehicles = vehicles.stream()
                .peek(v -> v.setCompanies(v.getCompanies().stream().map(company -> companyDAO.findByName(company.getName())).collect(Collectors.toSet())))
                .collect(Collectors.toList());
        vehicleDAO.saveAll(vehicles);
    }

    public List<Vehicle> getAll() {
        return vehicleDAO.findAll();
    }
}
