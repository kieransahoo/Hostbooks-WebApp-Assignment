package com.hostbooks.app.Exception;

import com.hostbooks.app.Model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<MyErrorDetails> CommonExceptionHandler(Exception ie, WebRequest req){
        MyErrorDetails me=new MyErrorDetails();
        me.setTimeStamp(LocalDateTime.now());
        me.setDetails(req.getDescription(false));
        me.setMessage(ie.getMessage());
        return new ResponseEntity<>(me, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<MyErrorDetails> NoHandlerFoundException(NoHandlerFoundException ie,WebRequest req){
        MyErrorDetails me=new MyErrorDetails();
        me.setTimeStamp(LocalDateTime.now());
        me.setDetails(req.getDescription(false));
        me.setMessage(ie.getMessage());
        return new ResponseEntity<>(me,HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<MyErrorDetails> NoHandlerFoundException(MethodArgumentNotValidException ie,WebRequest req){
        MyErrorDetails me=new MyErrorDetails();
        me.setTimeStamp(LocalDateTime.now());
        me.setDetails(req.getDescription(false));
        me.setMessage(ie.getMessage());
        return new ResponseEntity<>(me,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(EmployeeException.class)
    public ResponseEntity<MyErrorDetails> NoHandlerFoundException(EmployeeException ie,WebRequest req){
        MyErrorDetails me=new MyErrorDetails();
        me.setTimeStamp(LocalDateTime.now());
        me.setDetails(req.getDescription(false));
        me.setMessage(ie.getMessage());
        return new ResponseEntity<>(me,HttpStatus.BAD_REQUEST);
    }
}
