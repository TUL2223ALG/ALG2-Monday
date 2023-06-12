/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Buzuk;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ul
 */



public class StudentList {
     private List<Student> studlist;
    /**
     * @param args the command line arguments
     */
   public StudentList(){
       studlist = new ArrayList();
   }
   public void add(Student s){
       studlist.add(s);
       
   } 
   public void comparebyname(){
       Collections.sort(studlist);
       
   }
   public void comparebypoints(){ //JV chybi trideni s Comparatorem
       Collections.sort(studlist, new Comparator(){
       
   });
   }
   public void toText(){
        
   }
   public boolean loadData(File data) throws IOException{
       StringBuilder sb = new StringBuilder();
       boolean err = false;
       String name,surname,personalNumber;
       int left;
       try{ BufferedReader br = new BufferedReader(new FileReader(data)); //JV try with resources
       String line;
       while((line = br.readLine()) != null){
           String[] stolbs = line.split("//s+");
           name = stolbs[0];
           surname = stolbs[1];
           personalNumber = stolbs[2];
           int i = 3;
           int sum = 0;
           String[] points = null;
           while(stolbs[i].length() == 1){ //JV divna podminka
              
               points[i-3] = stolbs[i];
               
               try{ //JV proc try catch?
                   sum= sum + (int)points[i-3];
               }
               catch{
                   
               }
               i++;
           }
           left = (int)stolbs[i-1];
           Student s = new Student(name,surname,personalNumber,left);
           StudentPoints b = new StudentPoints();
           for (int j = 0; j < points.length; j++) {
                b.add(points[j]);
           }
           s.setPoints(b);
           
           //JV odladit
           
           
       }
       
      
       }
      return err; 
   }
}
