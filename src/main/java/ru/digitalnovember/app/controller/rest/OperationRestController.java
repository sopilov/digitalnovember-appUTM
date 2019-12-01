package ru.digitalnovember.app.controller.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.digitalnovember.app.model.Operation;
import ru.digitalnovember.app.service.OperationService;

import java.util.List;

@RestController
@RequestMapping("/api/operations")
@RequiredArgsConstructor
public class OperationRestController {

    private final OperationService operationService;

    @GetMapping("/")
    public List<Operation> getAll(){
        return operationService.getAll();
    }
}
