package week09_competitionwithfiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CompetitionApp {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)  {
        try{
        while (true) {
            System.out.println("Zadej soubor registrace");
            String registration = sc.next();

            Competition comp = new Competition();
            File registrationFile = new File(registration);
            try {
                comp.loadRegistration(registrationFile);
                System.out.println(comp.toText());
                break;
            } catch (FileNotFoundException e) {
                System.out.println("Neexistujici soubor");
                System.out.println(e.getMessage());
            }
            //zapis do souboru
        }
        }catch(IOException e){
            System.out.println("Problem se souborem");
        }
    }

}
