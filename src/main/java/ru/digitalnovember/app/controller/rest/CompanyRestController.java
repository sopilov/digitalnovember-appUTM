package ru.digitalnovember.app.controller.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.digitalnovember.app.model.Company;
import ru.digitalnovember.app.service.CompanyService;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
@RequiredArgsConstructor
public class CompanyRestController {

    private final CompanyService companyService;

    @GetMapping("/")
    public List<Company> playgrounds(){
        return companyService.getAll();
    }
}
