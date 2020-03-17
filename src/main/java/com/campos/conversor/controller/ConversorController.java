package com.campos.conversor.controller;

import com.campos.conversor.service.ConversorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cris on 14/03/2020.
 */

@RestController
public class ConversorController {

    @Autowired
    private ConversorService conversorService;

    @RequestMapping(value = "/numeral/{numero}", method = RequestMethod.GET)
    public ResponseEntity<String> numeralExtenso(@PathVariable(value = "numero") int numero) {
        return  new ResponseEntity<String>(conversorService.converteNumeralParaExtenso(numero), HttpStatus.OK);
    }}
