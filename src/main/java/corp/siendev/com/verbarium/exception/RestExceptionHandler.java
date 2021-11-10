/*
 * Copyright (c) 2021. SienDev, Inc. and Golubnichenko Iurii.  All Rights Reserved.
 */

package corp.siendev.com.verbarium.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.io.StringWriter;

@ControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ResponseErrorDetails> handleResourceNotFoundException(ResourceNotFoundException resourceNotFoundEx,
                                                             HttpServletRequest httpServletRequest) {
        String stackTrace = getStackTrace(resourceNotFoundEx);
        ResponseErrorDetails responseErrorDetail = new ResponseErrorDetails(resourceNotFoundEx,
                HttpStatus.NOT_FOUND.getReasonPhrase(),
                stackTrace);

        return new ResponseEntity<>(responseErrorDetail, null, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ResourceAlreadyExistsException.class)
    public ResponseEntity<ResponseErrorDetails> handleResourceAlreadyExistsException(ResourceAlreadyExistsException resourceAlreadyExistsEx,
                                                             HttpServletRequest httpServletRequest) {
        String stackTrace = getStackTrace(resourceAlreadyExistsEx);
        ResponseErrorDetails responseErrorDetail = new ResponseErrorDetails(resourceAlreadyExistsEx,
                HttpStatus.UNPROCESSABLE_ENTITY.getReasonPhrase(),
                stackTrace);

        return new ResponseEntity<>(responseErrorDetail, null, HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ResponseErrorDetails> handleBadRequestException(BadRequestException badRequestEx,
                                                                          HttpServletRequest httpServletRequest) {
        String stackTrace = getStackTrace(badRequestEx);
        ResponseErrorDetails responseErrorDetail = new ResponseErrorDetails(badRequestEx,
                HttpStatus.BAD_REQUEST.getReasonPhrase(),
                stackTrace);

        return new ResponseEntity<>(responseErrorDetail, null, HttpStatus.BAD_REQUEST);
    }

    private String getStackTrace(RuntimeException ex) {
        StringWriter stackTrace = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stackTrace);
        ex.printStackTrace(printWriter);

        return stackTrace.toString();
    }
}
