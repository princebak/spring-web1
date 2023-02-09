package com.bakil.springwebpoc.controller;

import com.bakil.springwebpoc.util.ObjectUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.validation.BindException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.async.AsyncRequestTimeoutException;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    private Logger logger;

    // Overridden Errors
    @Override
    protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
                                                                         HttpHeaders headers, HttpStatus status,
                                                                         WebRequest request) {
        logger = LoggerFactory.getLogger(RestResponseEntityExceptionHandler.class);
        ObjectUtil.logErrorInfos(logger, ex, request);
        return handleExceptionInternal(ex, ObjectUtil.getServerErrorResponse(ex, HttpStatus.METHOD_NOT_ALLOWED), new HttpHeaders(),
                HttpStatus.METHOD_NOT_ALLOWED, request);
    }

    @Override
    protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex, HttpHeaders headers,
                                                                     HttpStatus status, WebRequest request) {
        logger = LoggerFactory.getLogger(RestResponseEntityExceptionHandler.class);
        ObjectUtil.logErrorInfos(logger, ex, request);
        return handleExceptionInternal(ex, ObjectUtil.getServerErrorResponse(ex, HttpStatus.UNSUPPORTED_MEDIA_TYPE), new HttpHeaders(),
                HttpStatus.UNSUPPORTED_MEDIA_TYPE, request);
    }

    @Override
    protected ResponseEntity<Object> handleHttpMediaTypeNotAcceptable(HttpMediaTypeNotAcceptableException ex, HttpHeaders headers,
                                                                      HttpStatus status, WebRequest request) {
        logger = LoggerFactory.getLogger(RestResponseEntityExceptionHandler.class);
        ObjectUtil.logErrorInfos(logger, ex, request);
        return handleExceptionInternal(ex, ObjectUtil.getServerErrorResponse(ex, HttpStatus.NOT_ACCEPTABLE), new HttpHeaders(),
                HttpStatus.NOT_ACCEPTABLE, request);
    }

    @Override
    protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers,
                                                               HttpStatus status, WebRequest request) {
        logger = LoggerFactory.getLogger(RestResponseEntityExceptionHandler.class);
        ObjectUtil.logErrorInfos(logger, ex, request);
        return handleExceptionInternal(ex, ObjectUtil.getServerErrorResponse(ex, HttpStatus.BAD_REQUEST), new HttpHeaders(),
                HttpStatus.BAD_REQUEST, request);
    }

    @Override
    protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex,
                                                                          HttpHeaders headers, HttpStatus status, WebRequest request) {
        logger = LoggerFactory.getLogger(RestResponseEntityExceptionHandler.class);
        ObjectUtil.logErrorInfos(logger, ex, request);
        return handleExceptionInternal(ex, ObjectUtil.getServerErrorResponse(ex, HttpStatus.BAD_REQUEST), new HttpHeaders(),
                HttpStatus.BAD_REQUEST, request);
    }

    @Override
    protected ResponseEntity<Object> handleServletRequestBindingException(ServletRequestBindingException ex, HttpHeaders headers,
                                                                          HttpStatus status, WebRequest request) {
        logger = LoggerFactory.getLogger(RestResponseEntityExceptionHandler.class);
        ObjectUtil.logErrorInfos(logger, ex, request);
        return handleExceptionInternal(ex, ObjectUtil.getServerErrorResponse(ex, HttpStatus.BAD_REQUEST), new HttpHeaders(),
                HttpStatus.BAD_REQUEST, request);
    }

    @Override
    protected ResponseEntity<Object> handleConversionNotSupported(ConversionNotSupportedException ex, HttpHeaders headers,
                                                                  HttpStatus status, WebRequest request) {
        logger = LoggerFactory.getLogger(RestResponseEntityExceptionHandler.class);
        ObjectUtil.logErrorInfos(logger, ex, request);
        return handleExceptionInternal(ex, ObjectUtil.getServerErrorResponse(ex, HttpStatus.BAD_REQUEST), new HttpHeaders(),
                HttpStatus.BAD_REQUEST, request);
    }

    @Override
    protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers,
                                                        HttpStatus status, WebRequest request) {
        logger = LoggerFactory.getLogger(RestResponseEntityExceptionHandler.class);
        ObjectUtil.logErrorInfos(logger, ex, request);
        return handleExceptionInternal(ex, ObjectUtil.getServerErrorResponse(ex, HttpStatus.BAD_REQUEST), new HttpHeaders(),
                HttpStatus.BAD_REQUEST, request);
    }

    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, HttpHeaders headers,
                                                                  HttpStatus status, WebRequest request) {
        logger = LoggerFactory.getLogger(RestResponseEntityExceptionHandler.class);
        ObjectUtil.logErrorInfos(logger, ex, request);
        return handleExceptionInternal(ex, ObjectUtil.getServerErrorResponse(ex, HttpStatus.BAD_REQUEST), new HttpHeaders(),
                HttpStatus.BAD_REQUEST, request);
    }

    @Override
    protected ResponseEntity<Object> handleHttpMessageNotWritable(HttpMessageNotWritableException ex, HttpHeaders headers,
                                                                  HttpStatus status, WebRequest request) {
        logger = LoggerFactory.getLogger(RestResponseEntityExceptionHandler.class);
        ObjectUtil.logErrorInfos(logger, ex, request);
        return handleExceptionInternal(ex, ObjectUtil.getServerErrorResponse(ex, HttpStatus.BAD_REQUEST), new HttpHeaders(),
                HttpStatus.BAD_REQUEST, request);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers,
                                                                  HttpStatus status, WebRequest request) {
        logger = LoggerFactory.getLogger(RestResponseEntityExceptionHandler.class);
        ObjectUtil.logErrorInfos(logger, ex, request);
        return handleExceptionInternal(ex, ObjectUtil.getServerErrorResponse(ex, HttpStatus.BAD_REQUEST), new HttpHeaders(),
                HttpStatus.BAD_REQUEST, request);
    }

    @Override
    protected ResponseEntity<Object> handleMissingServletRequestPart(MissingServletRequestPartException ex, HttpHeaders headers,
                                                                     HttpStatus status, WebRequest request) {
        logger = LoggerFactory.getLogger(RestResponseEntityExceptionHandler.class);
        ObjectUtil.logErrorInfos(logger, ex, request);
        return handleExceptionInternal(ex, ObjectUtil.getServerErrorResponse(ex, HttpStatus.BAD_REQUEST), new HttpHeaders(),
                HttpStatus.BAD_REQUEST, request);
    }

    @Override
    protected ResponseEntity<Object> handleBindException(BindException ex, HttpHeaders headers,
                                                         HttpStatus status, WebRequest request) {
        logger = LoggerFactory.getLogger(RestResponseEntityExceptionHandler.class);
        ObjectUtil.logErrorInfos(logger, ex, request);
        return handleExceptionInternal(ex, ObjectUtil.getServerErrorResponse(ex, HttpStatus.BAD_REQUEST), new HttpHeaders(),
                HttpStatus.BAD_REQUEST, request);
    }

    @Override
    protected ResponseEntity<Object> handleNoHandlerFoundException(NoHandlerFoundException ex, HttpHeaders headers,
                                                                   HttpStatus status, WebRequest request) {
        logger = LoggerFactory.getLogger(RestResponseEntityExceptionHandler.class);
        ObjectUtil.logErrorInfos(logger, ex, request);
        return handleExceptionInternal(ex, ObjectUtil.getServerErrorResponse(ex, HttpStatus.BAD_REQUEST), new HttpHeaders(),
                HttpStatus.BAD_REQUEST, request);
    }

    @Override
    protected ResponseEntity<Object> handleAsyncRequestTimeoutException(AsyncRequestTimeoutException ex, HttpHeaders headers,
                                                                        HttpStatus status, WebRequest request) {
        logger = LoggerFactory.getLogger(RestResponseEntityExceptionHandler.class);
        ObjectUtil.logErrorInfos(logger, ex, request);
        return handleExceptionInternal(ex, ObjectUtil.getServerErrorResponse(ex, HttpStatus.REQUEST_TIMEOUT), new HttpHeaders(),
                HttpStatus.REQUEST_TIMEOUT, request);
    }

    @Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers,
                                                             HttpStatus status, WebRequest request) {
        logger = LoggerFactory.getLogger(RestResponseEntityExceptionHandler.class);
        ObjectUtil.logErrorInfos(logger, ex, request);
        return handleExceptionInternal(ex, ObjectUtil.getServerErrorResponse(ex, HttpStatus.INTERNAL_SERVER_ERROR), new HttpHeaders(),
                HttpStatus.INTERNAL_SERVER_ERROR, request);
    }

    // CUSTOM Error Handling
    @ExceptionHandler(value = { NullPointerException.class })
    protected ResponseEntity<Object> handleNullPointerException(NullPointerException ex, WebRequest request, HandlerMethod handlerMethod) {
        logger = LoggerFactory.getLogger(handlerMethod.getMethod().getDeclaringClass());
        ObjectUtil.logErrorInfos(logger, ex, request);
        return handleExceptionInternal(ex, ObjectUtil.getServerErrorResponse(ex, HttpStatus.INTERNAL_SERVER_ERROR), new HttpHeaders(),
                HttpStatus.INTERNAL_SERVER_ERROR, request);
    }

   /* @ExceptionHandler(value = { NumberFormatException.class })
    protected ResponseEntity<Object> handleNumberFormatException(NumberFormatException ex, WebRequest request, HandlerMethod handlerMethod) {
        logger = LoggerFactory.getLogger(handlerMethod.getMethod().getDeclaringClass());
        ObjectUtil.logErrorInfos(logger, ex, request);
        return handleExceptionInternal(ex, ObjectUtil.getServerErrorResponse(ex, HttpStatus.INTERNAL_SERVER_ERROR), new HttpHeaders(),
                HttpStatus.INTERNAL_SERVER_ERROR, request);
    }*/

   /* @ExceptionHandler(value = { Exception.class })
    protected ResponseEntity<Object> handleGenericException(Exception ex, WebRequest request, HandlerMethod handlerMethod) {

        logger = LoggerFactory.getLogger(handlerMethod.getMethod().getDeclaringClass());
        ObjectUtil.logErrorInfos(logger, ex, request);

        return handleExceptionInternal(ex, ObjectUtil.getServerErrorResponse(ex, HttpStatus.INTERNAL_SERVER_ERROR), new HttpHeaders(),
                HttpStatus.INTERNAL_SERVER_ERROR, request);
    }*/

    // HttpClientErrorException Errors
    @ExceptionHandler(value = { HttpClientErrorException.class })
    protected ResponseEntity<Object> handleBadRequestException(HttpClientErrorException ex, WebRequest request, HandlerMethod handlerMethod) {

        logger = LoggerFactory.getLogger(handlerMethod.getMethod().getDeclaringClass());
        ObjectUtil.logErrorInfos(logger, ex, request);

        return handleExceptionInternal(ex, ObjectUtil.getHttpErrorResponse(ex), new HttpHeaders(),
                HttpStatus.BAD_REQUEST, request);
    }
}