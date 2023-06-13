package com.example.spring_rest_api;

import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CalculatorService {

    public Optional<Operation> calculate(Operation operation){
        switch (operation.getType()){
            case "sum":
                operation.setResult(operation.getNum1() + operation.getNum2());
                return Optional.of(operation);
            case "sub":
                operation.setResult(operation.getNum1() - operation.getNum2());
                return Optional.of(operation);
            case "mul":
                operation.setResult(operation.getNum1() * operation.getNum2());
                return Optional.of(operation);
            case "div":
                operation.setResult(operation.getNum1() / operation.getNum2());
                return Optional.of(operation);
        }
        return Optional.empty();
    }
}
