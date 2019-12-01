package ru.digitalnovember.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.digitalnovember.app.service.CompanyService;
import ru.digitalnovember.app.service.OperationService;
import ru.digitalnovember.app.service.VehicleService;

import java.io.IOException;

@Component
public class InitData {

    @Autowired
    private CompanyService companyService;

    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private OperationService operationService;

    void init(){
        try {
            companyService.initCompanies();
            vehicleService.initVehicles();
            operationService.initOperations();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
