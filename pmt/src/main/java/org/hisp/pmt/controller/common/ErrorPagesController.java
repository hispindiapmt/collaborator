package org.hisp.pmt.controller.common;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
public class ErrorPagesController {

    @ExceptionHandler(IOException.class)
    public String handleIOException(IOException ex) 
    {
        return "users";
    }

}