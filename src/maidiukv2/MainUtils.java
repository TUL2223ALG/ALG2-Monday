package maidiukv2;

import Maidiukv2.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;

public class MainUtils implements IHuricane {
    public List<Huricane> hurricanes = new ArrayList<>();
    public final Scanner sc = new Scanner(System.in);
    String separator = File.separator;
    String filePath = ".." + separator + "Data" + separator + "HurricaneData.txt";

    @Override
    public List<Huricane> loadData(String filePath) throws IOException {
        List<Huricane> hurricanes = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (String line : lines) {
                String[] data = line.split("\\t");
                int year = Integer.parseInt(data[0]);
                String month = data[1];
                int pressure = Integer.parseInt(data[2]);
                double speed = Double.parseDouble(data[3]);
                String name = data[4];
                Huricane hurricane = new Huricane(year, month, pressure, speed, name);
                hurricanes.add(hurricane);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage()); //JV vypise chybu, ale bude pokracovat v aplikaci
        }
        return hurricanes;
    }

    @Override
    public void yearRange(List<Huricane> hurricanes, int start, int end) throws IOException {
        for (Huricane h : hurricanes) {
            if (h.getYear() >= start && h.getYear() <= end) {
                System.out.println(h);
            }
        }
    }

    @Override
public void sortedBySpeed(List<Huricane> hurricanes) throws IOException {
    Comparator<Huricane> speedComparator = Comparator.comparing(Huricane::getSpeed);
    hurricanes.sort(speedComparator);
    for (Huricane h : hurricanes) {
        System.out.println(h);
    }
}


    @Override
    public void listCatAndSpeed(List<Huricane> hurricanes, String name) throws IOException {
        for (Huricane h : hurricanes) {
            if (h.getName().equalsIgnoreCase(name)) {
                System.out.println("Category: " + h.getCategori());
                System.out.println("Speed in KmH: " + h.getSpeedInKmH());
                return;
            }
        }
        System.out.println("Hurricane not found");
    }

    @Override
    public void saveYearlyH(List<Huricane> hurricanes, String filePath) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath)); //JV pouzivat try with resources
        for (Huricane h : hurricanes) {
            writer.write(h.getName() + "\t" + h.getYear() + "\t" + h.getCategori());
            writer.newLine();
        }
        writer.close();
        System.out.println("Saved");
    }

    @Override
    public void saveYearlyHurricaneCountData(List<Huricane> hurricanes, String filename) throws IOException {
        //JV vyuziti neprobiranych konceptu, je potreba jim rozumet
        Map<Integer, Integer> hurricaneCountPerYear = new HashMap<>();
        for (Huricane h : hurricanes) {
            hurricaneCountPerYear.put(h.getYear(), hurricaneCountPerYear.getOrDefault(h.getYear(), 0) + 1);
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
        PrintWriter pw = new PrintWriter(bw);

        for (Map.Entry<Integer, Integer> entry : hurricaneCountPerYear.entrySet()) {
            pw.println(entry.getKey() + "\t" + entry.getValue());
        }

        pw.close();
        bw.close();

        System.out.println("Data saved successfully");
    }
}
