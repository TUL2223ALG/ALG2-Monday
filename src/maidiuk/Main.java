/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maidiuk;
import java.io.*;
import java.nio.file.*;
import java.util.*;
public class Main {
    public static final Scanner sc = new Scanner(System.in);
    private static String filePath;

    public static void main(String[] args) throws IOException {
            
        List<Huricane> huricanes = MainUtils.loadData(filePath);
        pUser(huricanes);
    }
    
    
 
    
    
    
    
    private static void pUser(List<Huricane>  huricanes) throws IOException{
        while (true) {            
            System.out.println("1.List of hurricanes in specific year ");
            System.out.println("2.List the category and speed ");
            System.out.println("3.List all hurricanes sorted by speed ");
            System.out.println("4.Save new hurricane ");
            System.out.println("5.Save yearly hurricane count data ");
            System.out.println("6.Exite ");

            
            String choise = sc.nextLine();
            switch(choise){
                case "1":
                    System.out.println("Enter start year: ");
                    int start = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter end year: ");
                    int end = Integer.parseInt(sc.nextLine());
                    MainUtils.yearRange(huricanes, start, end);
            break;
                case "2":
                    System.out.println("Enter huricane name: ");
                    String name = sc.nextLine();
                    MainUtils.listCatAndSpeed(huricanes, name);
            break;
                case "3":
                    MainUtils.sortedBySpeed(huricanes);
            break;
                case "4":
                    System.out.println("Enter file name to save: ");
                    String name1 = sc.nextLine();
                    MainUtils.saveYearlyH(huricanes, name1);
            break;
            
            case "5":
            
            
            break;
            
            case "6":
                    System.out.println("Exiting ");
                    System.exit(0);
            default:
             System.out.println("Invalid input ");

            
        }
            
            
        }
    }
    
}
