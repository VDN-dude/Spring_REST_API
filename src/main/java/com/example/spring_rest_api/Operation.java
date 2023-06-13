package com.example.spring_rest_api;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@RequiredArgsConstructor
@Getter
@Setter
public class Operation {
    private Double num1;
    private Double num2;
    private String type;
    private Double result;
}
