package ru.digitalnovember.app.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.digitalnovember.app.dao.OperationDAO;
import ru.digitalnovember.app.dao.VehicleDAO;
import ru.digitalnovember.app.model.Operation;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class OperationService {

    private final OperationDAO operationDAO;
    private final VehicleDAO vehicleDAO;

    public void initOperations() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String str = FileUtils.readFileToString(new File("operations.json"), StandardCharsets.UTF_8);
        List<Operation> operations = mapper.readValue(str, new TypeReference<List<Operation>>() {});
        operations = operations.stream()
                .peek(op -> op.setVehicles(op.getVehicles().stream().map(vehicle -> vehicleDAO.findByShortName(vehicle.getShortName())).collect(Collectors.toSet())))
                .collect(Collectors.toList());
        operationDAO.saveAll(operations);
    }

    public List<Operation> getAll() {
        return operationDAO.findAll();
    }
}
