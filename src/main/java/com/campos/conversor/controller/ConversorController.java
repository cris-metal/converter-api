package com.campos.conversor.controller;

import com.campos.conversor.service.ConversorService;
import net.minidev.json.JSONObject;
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
@RequestMapping("/api")
public class ConversorController {

    @Autowired
    private ConversorService conversorService;

    @RequestMapping(value = "/conversor-numeral/{numero}", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
        public ResponseEntity<Object>  numeralExtenso(@PathVariable(value = "numero") int numero) {
        JSONObject json = new JSONObject();
        json.put("extenso", conversorService.converteNumeralParaExtenso(numero));
        return new ResponseEntity<Object>(json, HttpStatus.OK);
    }}
