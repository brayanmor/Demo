/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

/**
 *
 * @author brayam
 */
public class Controlador {
    @GetMapping("/")
    public String mensaje(){
            System.out.println("Mensaje con Exito");
            return "Hola esta es una prueba con Sprig Boot G35";
    }
    
}
