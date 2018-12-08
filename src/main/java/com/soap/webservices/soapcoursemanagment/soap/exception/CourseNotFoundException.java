package com.soap.webservices.soapcoursemanagment.soap.exception;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

@SoapFault(faultCode = FaultCode.CLIENT, customFaultCode = "{http://sample.com/courses}001_COURSE_NOT_FOUND")
public class CourseNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 6138527181400020318L;

    public CourseNotFoundException(String s) {
        super(s);
    }

}
