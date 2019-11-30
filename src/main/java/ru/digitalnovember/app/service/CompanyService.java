package ru.digitalnovember.app.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.digitalnovember.app.dao.CompanyDAO;
import ru.digitalnovember.app.model.Company;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyDAO dao;

    public void initCompanies() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String str = FileUtils.readFileToString(new File("companies.json"), StandardCharsets.UTF_8);
        List<Company> companies = mapper.readValue(str, new TypeReference<List<Company>>(){});
        dao.saveAll(companies);
    }

    public List<Company> getAll(){
        return dao.findAll();
    }
}
