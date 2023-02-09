package com.bakil.springwebpoc.controller;

import com.bakil.springwebpoc.controller.dto.ArithmeticCalculation;
import com.bakil.springwebpoc.util.ObjectUtil;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import javax.validation.Valid;
import java.util.Collections;

@RestController
@RequestMapping("/api/v1/basic-arithmetic-ops")
public class BasicArithmeticOpsController {
    @PostMapping("")
    public ArithmeticCalculation calculate(@Valid @RequestBody ArithmeticCalculation body, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
                    ObjectUtil.getErrorsMessage(bindingResult));
        }
        switch (body.getOperation()){
            case "+": return body.setResult(Double.parseDouble(body.getValue1()) + Double.parseDouble(body.getValue2()));
            case "/": return body.setResult(Double.parseDouble(body.getValue1()) / Double.parseDouble(body.getValue2()));
            case "*": return body.setResult(Double.parseDouble(body.getValue1()) * Double.parseDouble(body.getValue2()));
            case "-": return body.setResult(Double.parseDouble(body.getValue1()) - Double.parseDouble(body.getValue2()));
            default: return body.setResult(0.0);
        }
    }
}
