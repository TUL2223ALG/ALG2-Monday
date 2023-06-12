
package Nazarov;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ZapocetApp {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       char volba;
       boolean cont = true;
       final String dataPath = "C:\\Users\\ul\\Documents\\NetBeansProjects\\2223ALG2ElearningNazarov\\data\\ALG1-ulohy.csv"; //JV idealne, aby nebylo napevno
       List<Student> students = new ArrayList<>();
       File studentsData = new File(dataPath);
       while (cont) {
           System.out.println("Zvolte akce:");
           System.out.println("1.Nacitani souboru");
           System.out.println("2.Prehled zapoctu");
           System.out.println("3.Narok na zapocet u studenta");
           System.out.println("4.Ulozeni dat");
           System.out.println("5.Ukonceni programu");
           volba = sc.nextLine().charAt(0);
           switch (volba){
               case '1':
                   readFile(studentsData,students);
                   break;
               case '2':
                   prehledZapoctu(students);
                   break;    
               case '3':
                   maZapocet(students);
                   break;
               case '4':
                   saveData();
                   break;
               case '5':
                   cont=false;
                   break; 
               default:
                   System.out.println("Not valid action");
           }
       }
    }

    private static void readFile(File studentsData,List<Student> students) {
       String line;
       int j=0;
       try { 
           Scanner sc = new Scanner(studentsData);
           for (int i = 0; i < 3; i++) { //JV proc preskakujete 3 radky
                if (sc.hasNextLine()){
                sc.nextLine();
                }
          }
           while (sc.hasNextLine()){
               line = sc.nextLine();
               String[] values= line.split(",");
               Student student = new Student(); //JV vhodnejsi nejdriv studentovi vsechno nastavit a pak jej pridat do students
               students.add(student);
               
               students.get(j).setName(values[0]);
               students.get(j).setSecondName(values[1]);
               students.get(j).setStagName(values[2]);
               students.get(j).setBody(0);
               for (int k=3; k<values.length-1;k++) {
                   if(!values[k].equals("-")){
                       students.get(j).addBody(Integer.parseInt(values[k]));
                   }
               } 
               students.get(j).maZapocet();
               j++;
           }
       }    
       catch(IOException e) {
          e.printStackTrace(); //JV toto vypise cervenym, kde vsude se chyba propagovala - to zajima programatora, ale ne uzivatele 
       }
    }
    private static void prehledZapoctu(List<Student> students) {
        System.out.println("Zvolte akci");
        System.out.println("1.Vypsat abecedne podle prijmeni studenty, ktery maji zapocet ");
        System.out.println("2.Vypsat abecedne podle prijmeni studenty, ktery nemaji zapocet ");
        System.out.println("3.Vypsat vsech studenty setrideny podle bodu");
        Scanner sc = new Scanner(System.in);
        char volba;
        volba = sc.nextLine().charAt(0);
        switch(volba){
            case '1':
                Collections.sort(students, Comparator.comparing(Student::getSecondName));
                for(Student student:students){
                    if(student.getZapocet().equals("ano")){
                        System.out.println(student);
                    }
                }
                break;
            case '2':
                Collections.sort(students, Comparator.comparing(Student::getSecondName));
                break;  
            case '3': //JV chybi
                break;
            default:
               System.out.println("Not valid action"); 
        }
    }

    private static void maZapocet(List<Student> students) {
        Scanner sc = new Scanner(System.in);
        String studentName = sc.next();
        boolean equals1;
        boolean equals2;
        for (Student student:students){
           equals1 = student.getStagName().equals(studentName); 
           equals2 = student.getName().equals(studentName); //JV melo byt zadane cele jmeno, vy kontrolujete jen jmeno ne prijmeni
            if ((equals1) || (equals2)){
                if(student.getZapocet()=="ano"){
                    System.out.println("ma narok");    
                }
                else {
                    System.out.println("nema narok");
                }
                break;
            }
        }
    }

    private static void saveData() { //JV chybi ulozeni dat
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
