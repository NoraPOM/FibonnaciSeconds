package com.example.FibonnaciSeconds.Controller;

public class FibonacciSecondsDTO {
    String hour;
    Integer seconds;
    Integer semilla1;
    Integer semilla2;
    Integer result;
    
    public FibonacciSecondsDTO(String hour, Integer seconds, Integer semilla1, Integer semilla2, Integer result) {
        this.hour = hour;
        this.seconds = seconds;
        this.semilla1 = semilla1;
        this.semilla2 = semilla2;
        this.result = result;
    }
    public String getHour() {
        return hour;
    }
    public void setHour(String hour) {
        this.hour = hour;
    }
    public Integer getSeconds() {
        return seconds;
    }
    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }
    public Integer getSemilla1() {
        return semilla1;
    }
    public void setSemilla1(Integer semilla1) {
        this.semilla1 = semilla1;
    }
    public Integer getSemilla2() {
        return semilla2;
    }
    public void setSemilla2(Integer semilla2) {
        this.semilla2 = semilla2;
    }
    public Integer getResult() {
        return result;
    }
    public void setResult(Integer result) {
        this.result = result;
    }
    
   
    
}
