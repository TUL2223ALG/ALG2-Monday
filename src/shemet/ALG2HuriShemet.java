/* \t
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shemet;

import java.awt.SystemColor;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectStreamConstants;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ul
 */
public class ALG2HuriShemet {

    public static void main(String[] args) {
        ArrayList<Hurricane> arr = new ArrayList<Hurricane>();
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        char choice = sc.nextLine().charAt(0);
        boolean work = true;
        while (true) {
            switch (choice) {
                case '1':
                    System.out.println("Write path of txt file with list of hurricanes.");
                    String path = sc.nextLine();
                    arr = HFileReader(path);
                    work = false;
                    break;
                case '2':
                    System.out.println("Enter starting year and press Enter:");
                    int from = sc.nextInt();
                    System.out.println("Enter closing year and press Enter:");
                    int to = sc.nextInt();
                    ArrayList<Hurricane> arrFromTo = new ArrayList<Hurricane>();
                    for (Hurricane hurr : arr) {
                        if (hurr.getYear() > from && hurr.getYear() < to) {
                            arrFromTo.add(hurr);
                        }
                    }
                    for (Hurricane hurrFromTo : arrFromTo) {
                        hurrFromTo.print();
                    }
                    work = false;
                    break;
                case '3':
                    String name = sc.nextLine();
                    for (Hurricane hurr : arr) {

                        if (name == hurr.getName()) {
                            int speed = hurr.getSpeed();
                            System.out.println("Category: " + scaleNum(SpeedToKmH(speed)) + ". " + "Speed in km/h: " + (SpeedToKmH(speed)) + ".");
                        }
                    }
                    break;
                case '4':

                    break;
                case '5':

                    break;
                case '6':

                    break;
                default:
                    throw new AssertionError();
            }
        }
    }

    public static double SpeedToKmH(int speed) {
        return speed * (1.852);
    }

    public static int scaleNum(double speedKmH) {
        int scaleNum = 0;
        if (speedKmH > 119 && speedKmH < 153) {
            scaleNum = 1;
        } else if (speedKmH > 154 && speedKmH < 177) {
            scaleNum = 2;
        } else if (speedKmH > 178 && speedKmH < 208) {
            scaleNum = 3;
        } else if (speedKmH > 209 && speedKmH < 251) {
            scaleNum = 4;
        } else if (speedKmH > 252) {
            scaleNum = 5;
        }
        return scaleNum;
    }

    public static ArrayList<Hurricane> HFileReader(String path) {
        ArrayList<Hurricane> arr = new ArrayList<Hurricane>();
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\t");
                int year = Integer.parseInt(parts[0]);
                String month = parts[1];
                int Mbars = Integer.parseInt(parts[2]);
                int speed = Integer.parseInt(parts[3]);
                String name = parts[4];

                Hurricane hurr = new Hurricane(year, month, Mbars, speed, name);
                arr.add(hurr);
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("!Wrong path!");
        }
        return arr;
    }
}
