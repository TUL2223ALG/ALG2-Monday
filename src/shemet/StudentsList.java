/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shemet;

import java.util.ArrayList;
import java.util.Comparator;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author ul
 */
public class StudentsList {

    private ArrayList<Student> arr;

    public StudentsList() {

    }

    public ArrayList<Student> getArr() {
        return arr; //JV defenzivni kopie
    }

    public void setArr(ArrayList<Student> arr) {
        this.arr = arr;
    }

    public void addStudent(String surname, String name, String number, int[] marks) {
        Student temp = new Student(surname, name, number, marks);
        arr.add(temp);
    }

    public static Comparator<Student> COMP_BY_NAME = (Student o1, Student o2) -> o1.getName().compareTo(o2.getName());
    public static Comparator<Student> COMP_BY_SURNAME = (Student o1, Student o2) -> o1.getSurname().compareTo(o2.getSurname());
    public static Comparator<Student> COMP_BY_MARKSSUM = (Student o1, Student o2) -> o1.compareTo(o2);

    public void loadFromFile(String name) throws IOException {

        File fr = new File(name);
        try ( BufferedReader br = new BufferedReader(new FileReader(fr))) {
            String line, number, sname, surname;
            int[] marks = new int[47];
            String[] parts;
            try {
                //JV chybi preskoceni prvniho radku s hlavickou
                while ((line = br.readLine()) != null) {
                    parts = line.split(",");
                    sname = parts[0];
                    surname = parts[1];
                    number = parts[2];
                    for (int i = 0; i < marks.length - 1; i++) {
                        marks[i] = Integer.parseInt(parts[i + 3]);
                    }
                    this.addStudent(surname, sname, number, marks);
                }
            } catch (IllegalArgumentException e) { //JV tuhle vyjimku nikdo nevyhazuje, proc ji zde odchytavate?
                System.out.println("!Somthing went wrong.Try again!" + e.getMessage());
            }
        }
    }

    public void sort(String line) {
        if ("name".equals(line)) {
            this.arr.sort(COMP_BY_NAME);
        } else if ("surname".equals(line)) {
            this.arr.sort(COMP_BY_SURNAME);

        } else if ("marksSum".equals(line)) {
            this.arr.sort(COMP_BY_MARKSSUM);
        }
    }

    public void saveResultFile(File fr) throws IOException {
        this.sort("name");  
        this.sort("surname");
        this.sort("marksSum"); //JV to nesetridi postupne, ale vzdy jen podle jednoho
        String line;
        try ( BufferedWriter bw = new BufferedWriter(new FileWriter(fr))) {
            for (Student s : this.arr) { //JV ulozi vsechny, melo jen kteri maji narok na zapocet
                line = String.format("%-10s\t%-10s\t%-10s\t%-3d", s.getNumber(), s.getName(), s.getSurname(), s.getMarksSum());
                bw.write(line);
                bw.newLine();
            }

        } catch (IllegalArgumentException e) { //JV ?
        }
    }

    public ArrayList<Student> withZapocet() {
        ArrayList<Student> f = new ArrayList<Student>();
        for (Student s : arr) {
            if (s.isZapocet() == true) {
                f.addStudent(s.getSurname(), s.getName(), s.getNumber(), s.getMarks());//JV f.add(s)
            }
        }
        return f;
    }
    
    public ArrayList<Student> withOutZapocet() {
        ArrayList<Student> f = new ArrayList<Student>();
        for (Student s : arr) {
            if (s.isZapocet() != true) {
                f.addStudent(s.getSurname(), s.getName(), s.getNumber(), s.getMarks());
            }
        }
        return f;
    }
    
    public void infoByName(){
    Scanner sc =new Scanner(System.in);
    String fullname = sc.nextLine();
    String[] parts;
    
    parts = fullname.split(" ");
    String name = parts[0];
    String surname = parts[1];
    
    for(Student s: arr){
    if(s.getName()==name && s.getSurname()==surname){ //JV porovnavat String pomoci equals()
        System.out.println(((s.zapocet=true)?"ano":"ne")); //JV vypisovat jen v mainu
    }
    }
    
    }
    
}
