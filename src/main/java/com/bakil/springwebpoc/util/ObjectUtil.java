package com.bakil.springwebpoc.util;

import com.bakil.springwebpoc.controller.dto.ResponseModel;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;

import java.util.Objects;

public class ObjectUtil {
    public static String getErrorsMessage(BindingResult bindingResult){
        StringBuffer res = new StringBuffer();
        bindingResult.getAllErrors().forEach(e -> res.append(e.getDefaultMessage()).append("; "));
        return res.toString();
    }
    public static ResponseModel getHttpErrorResponse(HttpClientErrorException ex){
        ResponseModel res = new ResponseModel();
        res.getMetadata().setStatus(ex.getStatusCode().value());
        res.getMetadata().setMessage(Objects.requireNonNull(ex.getMessage()).substring(4));
        return res;
    }
    public static ResponseModel getServerErrorResponse(Exception ex, HttpStatus status){
        ResponseModel res = new ResponseModel();
        res.getMetadata().setStatus(status.value());
        res.getMetadata().setMessage(Objects.requireNonNull(ex.getMessage()));
        return res;
    }
    public static void logErrorInfos(Logger logger, Exception ex, WebRequest request){
        logger.error("Request Description ==> " + request.getDescription(true));
        logger.error("Error Message ==> "+ex.getMessage());
    }
}
