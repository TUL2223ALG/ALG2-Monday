/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maidiuk;

import java.util.Comparator;

/**
 *
 * @author ul
 */
public class Huricane {

    private int year;
    private String mouth;
    private int pressure;
    private double speed;
    private String name;

    public Huricane(int year, String mouth, int pressure, double speed, String name) {
        this.year = year;
        this.mouth = mouth;
        this.pressure = pressure;
        this.speed = speed;
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public String getMouth() {
        return mouth;
    }

    public int getPressure() {
        return pressure;
    }

    public double getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMouth(String mouth) {
        this.mouth = mouth;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Huricane{" + "year=" + year + ", mouth=" + mouth + ", pressure=" + pressure + ", speed=" + speed + ", name=" + name + '}';
    }

    public int getCategori() {

        double speedKmH = getSpeed();
        if (speedKmH < 154) { //JV pokud mensi nez 119, 0
            return 1;
        } else if (speedKmH < 178) {
            return 2;
        } else if (speedKmH < 209) {
            return 3;
        } else if (speedKmH < 252) {
            return 4;
        }
        return 5;
    }

    public double getSpeedInKmH() {
        return speed * 1.852;
    }

    public static Comparator<Huricane> speedComparator = new Comparator<Huricane>() {
        @Override
        public int compare(Huricane o1, Huricane o2) {
            double hur1 = o1.getSpeedInKmH();
            double hur2 = o2.getSpeedInKmH();
            return Double.compare(hur1, hur2);
        }
    };

    public static Comparator<Huricane> nameComparator = new Comparator<Huricane>() {
        @Override
        public int compare(Huricane o1, Huricane o2) {
            String hur1 = o1.getName().toUpperCase();
            String hur2 = o2.getName().toUpperCase();
            return hur1.compareTo(hur2);
        }
    };

}
