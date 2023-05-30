
package nazarov;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

   //JV nedavat vsechno do main, delat metody
    public static void main(String[] args) throws FileNotFoundException, IOException {
      List<Hurricane> hurricanes = new ArrayList<>();
      String line;
      String name;
      Hurricane huri;
      int i = 0;
      int rok1,rok2,rok;
       try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ul\\Documents\\NetBeansProjects\\ALG2HuriNazarov\\Data\\HurricaneData.txt"))){ //JV cestu dát jako konstantu nahoru
           while((line=br.readLine())!=null){
               Hurricane hurricane = new Hurricane();
               hurricanes.add(hurricane);
               String[]values=line.split("\t");
               //JV atributy maji byt private - nesmi se mimo tridy nastavovat primo - princip OOP encapsulation
               hurricanes.get(i).rok = Integer.parseInt(values[0]);
               hurricanes.get(i).mesic = values[1];
               hurricanes.get(i).tlak = Integer.parseInt(values[2]);
               hurricanes.get(i).rychlostUzli = Integer.parseInt(values[3]);
               hurricanes.get(i).name = values[4];
               hurricanes.get(i).speedToKm();
               hurricanes.get(i).findCategory();
               i++;
           }
       } catch (IOException e){
           e.printStackTrace(); //JV pokud bude chyba, vypisete hlasku, ale pokracujete v aplikaci, jako by se nacteni povedlo
       }
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter first year");
       rok1=sc.nextInt();
       System.out.println("Enter second year");
       rok2=sc.nextInt();
       for(Hurricane hurricane: hurricanes){
            rok = hurricane.rok;
            if(rok>=rok1 && rok <= rok2){
                System.out.println(hurricane);
            }
       }
       while (true){
           System.out.println("Enter hurricane name");
           
           name = sc.next();
           huri = findHurricane(name,hurricanes);
           if (huri==null){
               System.out.println("This name do not exist");
           }
           else{
               System.out.println(huri.rychlostKm+" "+huri.category);
               break;
           }
       }       
       Collections.sort(hurricanes, new Comparator<Hurricane>(){
           public int compare (Hurricane a1, Hurricane a2){
               return a1.rychlostUzli-a2.rychlostUzli;
               
           }
       });
       for (Hurricane hurricane:hurricanes){
           System.out.println(hurricane);
       }
       //JV v prvej verzii ste nemal pouzivat internet, nemyslim si, ze toto ste napisal sam
       Collections.sort(hurricanes, Comparator.comparing(Hurricane::getName));
       try(BufferedWriter writer = new BufferedWriter(new FileWriter("sorted_by_names.txt"))){
           for (Hurricane hurricane: hurricanes){
               writer.write(hurricane.toString());
               writer.newLine();
           }   
       }
       catch(IOException e){
       }
    //JV chyba zapis do binarneho suboru
    //JV v prvej verzii ste nemal pouzivat internet, nemyslim si, ze toto ste napisal sam
    HashMap<Integer,Integer> hurricaneCountByYear = new HashMap<>();
    for(Hurricane hurricane : hurricanes){
        rok = hurricane.rok;
        hurricaneCountByYear.put(rok,hurricaneCountByYear.getOrDefault(rok, 0) +1);
    }
    
    }    
    public static Hurricane findHurricane(String name, List<Hurricane> hurricanes){
    for(Hurricane hurricane:hurricanes){
        if(hurricane.name.equals(name)){
            return hurricane;
        }
    }
    return null;
 }
    
}
