package com.bakil.springwebpoc.controller;

import com.bakil.springwebpoc.controller.dto.ArithmeticCalculation;
import com.bakil.springwebpoc.util.ObjectUtil;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/advanced-arithmetic-ops")
public class AdvancedArithmeticOpsController {
    @PostMapping("")
    public ArithmeticCalculation calculate(@Valid @RequestBody ArithmeticCalculation body, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                    ObjectUtil.getErrorsMessage(bindingResult));
        }
        switch (body.getOperation()){
            case "^": return body.setResult(Math.pow(Double.parseDouble(body.getValue1()), Double.parseDouble(body.getValue2()))); // Exponentiation
            case "%": return body.setResult(Double.parseDouble(body.getValue1()) % Double.parseDouble(body.getValue2())); // Modulo
            default: return body.setResult(0.0);
        }
    }
}
