package com.demo.part15_exceptionhandler_restcontrolleradvice_controlleradvice_responsestatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMessage {
    private int statusCode;
    private String message;
}
