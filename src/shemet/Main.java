/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shemet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ul
 */
public class Main {

    public static void main(String[] args) throws IOException {
        StudentsList arr = new StudentsList();
        ArrayList<Student> array = new ArrayList<Student>();
        array = arr.getArr();
        Scanner sc = new Scanner(System.in);

        boolean work = true;
        while (work) {
            System.out.println("Select:\n1 - Nacitani souboru\n2 - Prehled zapoctu\n3 - Narok na zapocet u studenta\n4 - Ulozeni dat\n5 - Ukonceni programu.");
            switch (sc.nextLine()) {
                case "1":
                    System.out.println("Write file path:");
                    String path = sc.nextLine();
                    arr.loadFromFile(path);
                    break;
                case "2":
                    System.out.println("Select:\n1 - Students with zapocet\n2 - Students without zapocet\n3 - All srudents.");
                    switch (sc.nextLine()) {
                        //JV hodne opakujiciho se kodu
                        case "1":
                            ArrayList<Student> arr11 = new ArrayList<Student>();
                            StudentsList ar11 = new StudentsList(); //JV bude prazdny, bylo potreba vyuzit naplneny arr
                            ar11.sort("surname");
                            arr11 = ar11.withZapocet();
                            
                            
                            for (Student s : ar11.getArr()) {
                                s.print();
                            }
                            

                            
                           
                            
                            break;
                        case "2":
                            ArrayList<Student> arr12 = new ArrayList<Student>();
                            StudentsList ar12 = new StudentsList();
                            ar12.sort("surname");
                            arr12 = ar12.withOutZapocet();
                            
                            
                            for (Student s : ar12.getArr()) {
                                s.print();
                            }
                            
                            break;
                        case "3":
                            ArrayList<Student> arr131 = new ArrayList<Student>();
                            StudentsList ar13 = new StudentsList();
                            ar13.sort("marksSum");
                            arr131 = ar13.withZapocet();
                            
                            
                            for (Student s : ar13.getArr()) {
                                s.print();
                            }

                            ArrayList<Student> arr132 = new ArrayList<Student>();
                            StudentsList ar14 = new StudentsList();
                            ar14.sort("marksSum");
                            arr132 = ar14.withOutZapocet();
                            
                            
                            for (Student s : ar14.getArr()) {
                                s.print();
                            }
                            
                            break;
                        default:
                            System.out.println("!Something went wrong!");
                            
                            break;
                    }

                    break;
                case "3":
                    arr.infoByName();
                    break;
                case "4":
                    System.out.println("Select:\n1 - Write to file list students with zapocet\n2 - ...");
                    switch (sc.nextLine()) {
                        case "1":
                             ArrayList<Student> ar = new ArrayList<Student>();
                            StudentsList ar11 = new StudentsList();
                            ar11.sort("surname");
                            arr11 = ar11.withZapocet();
                            
                            
                            break;
                        case "2":
                            
                            break;
                    }

                    break;

                case "0":
                    work = false;
                    break;
                default:
                    break;
            }
        }
    }
    
    //JV nedokonceno
    //JV neosetrene vyjimky

}
