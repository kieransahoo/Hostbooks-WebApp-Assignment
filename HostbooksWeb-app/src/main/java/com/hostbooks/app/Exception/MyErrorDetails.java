package com.hostbooks.app.Exception;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MyErrorDetails {
    private LocalDateTime timeStamp;
    private String message;
    private String details;
}
