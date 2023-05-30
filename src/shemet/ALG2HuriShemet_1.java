/* \t
 D:\\ALG2HuriShemet\\data\\HurricaneData.txt
 */
package shemet;

import java.util.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * path: D:\\ALG2HuriShemet\\data\\HurricaneData.txt
 */
public class ALG2HuriShemet {

    public static void main(String[] args) {
        ArrayList<Hurricane> arr = new ArrayList<Hurricane>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Write path of txt file with list of hurricanes.");
        String path = sc.nextLine();
        arr = HFileReader(path);
        for (Hurricane k : arr) {
            k.print();
        }

        boolean work0 = true;
        while (work0) {
            System.out.println("Seclect.\n2.\n3.\n4.\n5.\n6.\n0 - end");
            char choice = sc.nextLine().charAt(0);
            boolean work = true;
            while (work) {
                switch (choice) {

                    case '2':
                        System.out.println("Enter starting year and press Enter:");
                        int from = sc.nextInt();
                        System.out.println("Enter closing year and press Enter:");
                        int to = sc.nextInt();
                        ArrayList<Hurricane> arrFromTo = new ArrayList<Hurricane>();
                        for (Hurricane hurr : arr) {
                            if (hurr.getYear() >= from && hurr.getYear() <= to) {
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
                        for (Hurricane hu : arr) {
                            if (name == hu.getName()) { //JV porovnani String pres metodu equals
                                int speed = hu.getSpeed();
                                System.out.println("Category: " + scaleNum(SpeedToKmH(speed)) + ". " + "Speed in km/h: " + (SpeedToKmH(speed)) + ".");
                            }
                        }

                        break;
                    case '4':
                        ArrayList<Hurricane> arr2 = arr;
                        Collections.sort(arr2);
                        for (Hurricane h : arr2) {
                            h.print();
                        }
                        work = false;
                        break;
                    case '5':
                        work = false;
                        break;
                    case '6':
                        work = false;
                        break;
                    case '0':
                        work0 = false;
                        break;
                    default:
                        System.out.println("!Wrong choice!");
                        work = false;
                        break;
                }
            }
        }
    }

    public static double SpeedToKmH(int speed) {
        return (speed * (1.852));
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
