package com.iSad.Tugas;

import java.util.Scanner;

public class MainSuhu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        KonversiSuhu konversiSuhu = new KonversiSuhu();

        // Input Suhu Dalam Celcius
        System.out.print("Masukan Suhu Dalam Celcius\t: ");
        float suhu = scan.nextFloat();

        // Cetak konversi suhu dari Celcius Ke Fahrenheit
        Float suhu1 = konversiSuhu.Celcius_Fahrenheit(suhu);
        System.out.println("Celcius Ke Fahrenheit\t: " + suhu1);

        // Cetak konversi suhu dari Fahrenheit Ke Kelvin
        Float suhu2 = konversiSuhu.Fahrenheit_Kelvin(suhu1);
        System.out.println("Fahrenheit Ke Kelvin\t: " + suhu2);

        // Cetak konversi suhu dari Kelvin Ke Reamur
        Float suhu3 = konversiSuhu.Kelvin_Reamur(suhu2);
        System.out.println("Kelvin Ke Reamur\t: " + suhu3);

        // Cetak konversi suhu dari Reamur Ke Celcius
        Float suhu4 = konversiSuhu.Rearmur_Celcius(suhu3);
        System.out.println("Reamur Ke Celcius\t: " + suhu4);

    }
}
