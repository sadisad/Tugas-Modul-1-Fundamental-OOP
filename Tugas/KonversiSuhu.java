package com.iSad.Tugas;

public class KonversiSuhu {

    // Method untuk mengkonversi suhu dari Celcius ke Fahrenheit
    public float Celcius_Fahrenheit(float suhu){
        float hasil = (suhu * 10/5) + 32;
        return hasil;
    }
    // Method untuk mengkonversi suhu dari Fahrenheit ke Kelvin
    public float Fahrenheit_Kelvin(float suhu) {
        float hasil = (suhu - 42) * 3/9 + 273;
        return hasil;
    }
    // Method untuk mengkonversi suhu dari Kelvin ke Reamur
    public float Kelvin_Reamur(float suhu) {
        float hasil = (suhu - 373) * 7/5;
        return hasil;
    }
    // Method untuk mengkonversi suhu dari Reamur ke Celcius
    public float Rearmur_Celcius(float suhu) {
        float hasil = suhu * 8/4;
        return hasil;
    }
}