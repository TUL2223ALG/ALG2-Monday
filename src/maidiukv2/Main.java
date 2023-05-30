package maidiukv2;

import Maidiukv2.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        MainUtils mainUtils = new MainUtils();
        List<Huricane> huricanes = mainUtils.loadData(mainUtils.filePath);
        processUserInput(huricanes, mainUtils);
    }

    private static void processUserInput(List<Huricane> hurricanes, MainUtils mainUtils) throws IOException {
    Scanner sc = new Scanner(System.in);
    while (true) {
        System.out.println("1. List hurricanes in a specific year range");
        System.out.println("2. Get category and speed of a hurricane");
        System.out.println("3. List all hurricanes sorted by speed");
        System.out.println("4. Save new hurricane");
        System.out.println("5. Save yearly hurricane count data");
        System.out.println("6. Exit");

        System.out.print("Enter your choice: ");
        String choice = sc.nextLine();
        switch (choice) {
            case "1":
                System.out.print("Enter start year: ");
                int start = Integer.parseInt(sc.nextLine());
                System.out.print("Enter end year: ");
                int end = Integer.parseInt(sc.nextLine());
                mainUtils.yearRange(hurricanes, start, end);
                break;
            case "2":
                System.out.print("Enter hurricane name: ");
                String name = sc.nextLine();
                mainUtils.listCatAndSpeed(hurricanes, name);
                break;
            case "3":
                mainUtils.sortedBySpeed(hurricanes);
                break;
            case "4":
                System.out.print("Enter new hurricane year: ");
                int year = Integer.parseInt(sc.nextLine());
                System.out.print("Enter new hurricane month: ");
                String month = sc.nextLine();
                System.out.print("Enter new hurricane pressure: ");
                int pressure = Integer.parseInt(sc.nextLine());
                System.out.print("Enter new hurricane speed: ");
                int speed = Integer.parseInt(sc.nextLine());
                System.out.print("Enter new hurricane name: ");
                String newName = sc.nextLine();
                Huricane newHurricane = new Huricane(year, month, pressure, speed, newName);
                hurricanes.add(newHurricane);
                System.out.println("New hurricane added successfully.");
                break;
            case "5":
                System.out.print("Enter file name to save yearly hurricane count data: ");
                String countFileName = sc.nextLine();
                mainUtils.saveYearlyHurricaneCountData(hurricanes, countFileName);
                break;
            case "6":
                System.out.println("Exiting...");
                System.exit(0);
            default:
                System.out.println("Invalid input!");
        }
    }
}

    }

