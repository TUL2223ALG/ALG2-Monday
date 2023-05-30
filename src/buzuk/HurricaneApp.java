/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package buzuk;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ul
 */
public class HurricaneApp {
public static void main(String[] args) throws FileNotFoundException, IOException{
    File file = new File("ALG2GUIBuzuk\\data\\HurricaneData.txt");
    BufferedReader r = new BufferedReader(new FileReader(file)); //JV pouzit try with resources
    String ot;
    while ((ot = r.readLine()) != null){
        System.out.println(ot);
    }
}



private static double hurricanespeed(double u){
   double kmh;
        kmh = u*1.852;
   return kmh;
}
private static int scale(double kms){
    int kmh = (int)kms;
    if(kmh>119 && kmh<153){
        return 1;
    }
    else if(kmh>154 && kmh<177){
        return 2;
    }
    else if(kmh>178 && kmh<208){
        return 3;
    }
    else if(kmh>209 && kmh<251){
        return 4;
    }
    else if(kmh>252){
        return 5;
    }
    else{
    return 0;
    }
}

    

   

    
}








