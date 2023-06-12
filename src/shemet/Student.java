/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shemet;

public class Student implements Comparable<Student> {

    private String surname;
    private String name;
    private String number;
    private int[] marks = new int[47]; //JV nedelejte priste napevno, program jde pak jen omezene vyuzit
    private int marksSum;

    private boolean zapocet;

    public Student() {
    }

    public Student(String surname, String name, String number, int[] marks) {
        this.surname = surname;
        this.name = name;
        this.number = number;
        this.marks = marks; //JV ulozit si defenzivni kopii

        int marksSum = 0;//JV mohlo byt v samostatni metode
        for (int i = 0; i < this.marks.length - 1; i++) {
            marksSum = marksSum + marks[i];
        }
        this.marksSum = marksSum;

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public boolean isZapocet() {
        return zapocet;
    }

    public void setZapocet(boolean zapocet) { //JV asi nechcetu tuto metodu, ktokoliv by mohol prepsat zapocet na true, i kdyz pocet bodu nebude sedet
        this.zapocet = zapocet;
    }

    public boolean zapocet() {

        return marksSum > 49;
    }

    public int getMarksSum() {
        return marksSum;
    }

    public void print() {
        String.format("%-10s\t%-10s\t%-10s\t%-3d\t%-3s", number, name, surname, marksSum ,((zapocet=true)?"ano":"ne"));
    }
    

    @Override
    public int compareTo(Student s) {
        return this.marksSum - s.marksSum;
    }
}
