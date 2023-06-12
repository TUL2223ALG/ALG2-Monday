/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Buzuk;

/**
 *
 * @author ul
 */
public class Student implements Comparable<Student>{
    private String name;
    private String surname;
    private String personalNumber;
    private StudentPoints points; 
    private int pointssum;
    private boolean zapocet;
    private int left; //JV co to je
    
    public Student(String name, String surname, String personalNumber, int left){
        this.name = name;
        this.surname = surname;
        this.personalNumber = personalNumber;
        this.left = left;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", surname=" + surname + ", personalNumber=" + personalNumber + ", points=" + points + ", pointssum=" + pointssum + ", zapocet=" + zapocet + ", left=" + left + '}';
    }


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the personalNumber
     */
    public String getPersonalNumber() {
        return personalNumber;
    }

    /**
     * @param personalNumber the personalNumber to set
     */
    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    /**
     * @return the points
     */
    public int getSumPoints() {
        return pointssum;
    }
    
    /**
   
     */
    public void setPoints(StudentPoints s) {
        points = s;
    }

    /**
     * @return the zapocet
     */
    public boolean isZapocet() {
        return zapocet;
    }

    /**
     * @param zapocet the zapocet to set
     */
    public void setZapocet(boolean zapocet) { //JV asi nechcete, aby mohl kdokoliv nastavovat zapocet bez kontroly bodu
        this.zapocet = zapocet;
    }

    @Override
    public int compareTo(Student o) { //JV trideni by melo byt podle surname
        return this.name.compareTo(o.name);
    }
    
}
