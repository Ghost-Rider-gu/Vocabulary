/*
 * Copyright (c) 2021. SienDev, Inc. and Golubnichenko Iurii.  All Rights Reserved.
 */

package corp.siendev.com.verbarium.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ResponseErrorDetails {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private Date timeStamp;
    private String status;
    private String errorDescription;
    private String classInfo;
    private String stackTrace;

    public ResponseErrorDetails() {
        this.timeStamp = new Date();
    }

    public ResponseErrorDetails(RuntimeException ex,
                                String status,
                                String stackTrace) {
        this();

        this.status = status;
        this.errorDescription = ex.getMessage();
        this.classInfo = ex.getClass().getSimpleName();
        this.stackTrace = stackTrace;
    }
}
