package com.example.FibonnaciSeconds.Service.Impl;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.example.FibonnaciSeconds.Controller.FibonacciSecondsDTO;
import com.example.FibonnaciSeconds.Service.FibonacciSecondsService;

@Service
public class FibonacciSecondsServiceImpl implements FibonacciSecondsService {
    @Override
    public FibonacciSecondsDTO entregarSumaSegundos() {
        
        LocalDateTime locaDate = LocalDateTime.now();
        int hours  = locaDate.getHour();
        int minutes  = locaDate.getHour();
        int seconds = locaDate.getSecond();

        String hour = hours  + ":"+ minutes +":"+seconds;
        int semilla1 = seconds / 10;      
        int semilla2 = seconds % 10;
        int result = semilla1 + semilla2;

        FibonacciSecondsDTO sumaSemillas = new FibonacciSecondsDTO(hour, seconds, semilla1, semilla2, result);
        return sumaSemillas;
    }

}
