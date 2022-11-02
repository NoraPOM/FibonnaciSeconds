package com.example.FibonnaciSeconds.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FibonnaciSeconds.Service.FibonacciSecondsService;

@RestController
@RequestMapping( "/fibonacciseconds")
public class FibonacciSecondsController {

    private final FibonacciSecondsService fibonacciSeconds;

    public FibonacciSecondsController( @Autowired FibonacciSecondsService suma )
    {
        this.fibonacciSeconds = suma;
    }
    @GetMapping
    public ResponseEntity<FibonacciSecondsDTO> sumaCalculada(){
        return ResponseEntity.ok(fibonacciSeconds.entregarSumaSegundos());
    }
}


