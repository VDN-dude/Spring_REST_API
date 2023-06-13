package com.example.spring_rest_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/calc")
public class CalculatorController {
    private final List<Operation> operationList = new ArrayList<>();
    @Autowired
    private CalculatorService calculatorService;

    @GetMapping
    public List<Operation> findAll(){
        return operationList;
    }

    @PostMapping
    public ResponseEntity<Operation> calculate(@RequestBody Operation operation){
        Optional<Operation> calculate = calculatorService.calculate(operation);
        if (calculate.isPresent()){
            Operation calculatedOperation = calculate.get();
            operationList.add(calculatedOperation);
            return new ResponseEntity<>(calculatedOperation, HttpStatus.ACCEPTED);
        }
        return ResponseEntity.badRequest().build();
    }
}
