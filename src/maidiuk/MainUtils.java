/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maidiuk;

import java.io.*;
import java.nio.file.*;
import java.util.*;
public class MainUtils {
    public static List <Huricane> huricanes = new ArrayList<>();
    public static final Scanner sc = new Scanner(System.in);
   String separator = File.separator;
    private String filePath = "C:" + separator + "Users" + separator + "ul" + separator + "Documents" + separator + "NetBeansProjects" + separator + "ALG2HuriMaidiuk" + separator +"Data" + separator + "HurricaneData.txt";
    
    public static List<Huricane> loadData(String filePath) throws IOException{
        List <Huricane> huricanes = new ArrayList<>();

        try{
        
    List<String> linee = Files.readAllLines(Path.get(filePath));

    for(String line : linee){
    String[] data = line.split("\\t");
    int year = Integer.parseInt(data[0]);
    String mouth = data[1];
    int pressure = Integer.parseInt(data[2]);
    double speed = Double.parseDouble(data[3]);
    String name = data[4];
    Huricane huricane = new Huricane(year, mouth, pressure, speed, name);
    huricanes.add(huricane);
    
    
    }
    
    
    }catch(IOException e){
        System.out.println("Error reading File " + e.getMessage());
    }
    return huricanes;
    }
    
    
    public static void yearRange(List<Huricane> huricanes,int start, int end) throws IOException{
    for(Huricane h : huricanes){
        
        if(h.getYear() >= start && h.getYear() <= end){
            System.out.println(h);
        }
    }
    
    }
    public static void sortedBySpeed(List<Huricane> huricanes) throws IOException{
         huricanes.sort(Comparator.comparing(Huricane :: getSpeed));
         for(Huricane h : huricanes){
         
         }
   
   
    }
    
    
    
    public static void listCatAndSpeed(List<Huricane> huricanes,String name) throws IOException{
    for(Huricane h : huricanes){
    if(h.getName().equalsIgnoreCase(name)){
        System.out.println("Category " + h.getCategori());
        System.out.println("Speed in KmH " + h.getSpeedInKmH());
        return;
    }
    
    }
        System.out.println("Hurrican not found");
    }
    
    
    public static void saveYearlyH(List<Huricane> huricanes, String  filePath) throws IOException{
    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
    for(Huricane h : huricanes){
    writer.write(h.getName() + "\t" + h.getYear() + "\t" + h.getCategori());
    }
    writer.close();
        System.out.println("Saved");
    }
    
    
    
    
    public static void huricanePerYBinary(List<Huricane> huricanes, String  filePath) throws IOException{
    Map<Integer,Integer> numOfHur = new HashMap<>();
    for(Huricane h : huricanes){
        numOfHur.put(h.getYear(),numOfHur.getOrDefault(h.getYear(), 0) + 1);
    }
   // DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(filePath));
    }
    
    
    
    
    
    
    
}
