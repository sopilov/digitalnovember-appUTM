package ru.digitalnovember.app.controller.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.digitalnovember.app.model.Vehicle;
import ru.digitalnovember.app.service.VehicleService;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
@RequiredArgsConstructor
public class VehicleRestController {

    private final VehicleService vehicleService;

    @GetMapping("/")
    public List<Vehicle> getAll(){
        return vehicleService.getAll();
    }
}
