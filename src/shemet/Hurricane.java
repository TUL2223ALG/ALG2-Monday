/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shemet;

public class Hurricane {

    private int year;
    private String month;
    private int Mbars;
    private int speed;
    private String name;

    public Hurricane(int year, String month, int Mbars, int speed, String name) {
        this.year = year;
        this.month = month;
        this.Mbars = Mbars;
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setMbars(int Mbars) {
        this.Mbars = Mbars;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public int getMbars() {
        return Mbars;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println(year + "\t" + month + "\t" + Mbars + "\t" + speed + "\t" + name); //JV vracet String, sout pouzivat jenom v uzivatelskem rozhrani, navyse by to mela byt prekryta metoda toString 
    }
}
