package ru.digitalnovember.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.digitalnovember.app.service.CompanyService;

import java.io.IOException;

@Component
public class InitData {

    @Autowired
    private CompanyService companyService;

    void init(){
        try {
            companyService.initCompany();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
