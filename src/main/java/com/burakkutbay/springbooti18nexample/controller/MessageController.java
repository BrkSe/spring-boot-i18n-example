package com.burakkutbay.springbooti18nexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

/**
 * Created by Hasan Burak KUTBAY on 12/19/20.
 */
@RestController
public class MessageController {
    @Autowired
    MessageSource messageSource;

    @GetMapping("/")
    public String index(Locale locale) {
        return messageSource.getMessage("hello.message", null, locale);
    }
}
