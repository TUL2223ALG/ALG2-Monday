/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week12_experiments;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author jana.vitvarova
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate dob = LocalDate.of(2020, Month.AUGUST, 3);
        System.out.println(dob.format(DateTimeFormatter.ISO_DATE));
        LocalDate dob2 = LocalDate.parse("2021-01-05", DateTimeFormatter.ISO_DATE);
        System.out.println(today.toEpochDay());
        LocalDate tomorrow = LocalDate.ofEpochDay(19493);
        System.out.println(tomorrow.format(DateTimeFormatter.ISO_DATE));
        
    }
    
}
