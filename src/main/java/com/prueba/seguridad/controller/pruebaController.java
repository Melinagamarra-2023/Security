package com.prueba.seguridad.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class pruebaController {

    @PostMapping(value = "prueba")
    public String login(){
        return "Hola bienvenido a esta prueba";
    }
}
