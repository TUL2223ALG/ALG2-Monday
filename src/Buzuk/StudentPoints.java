/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Buzuk;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ul
 */
public class StudentPoints {
    //JV tahle trida nedela nic jinyho nez bezny ArrayList - neni potreba
    private List<String> pointlist;
    public StudentPoints(){
        pointlist = new ArrayList();
    }

    @Override
    public String toString() {
        return "StudentPoints{" + "pointlist=" + pointlist + '}';
    }
    public void add(String p){
        pointlist.add(p);
    }
   
    
}
