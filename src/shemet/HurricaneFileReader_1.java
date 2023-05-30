/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shemet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectStreamConstants;

import java.util.ArrayList;
import java.util.List;

public class HurricaneFileReader {

    public ArrayList<Hurricane> HFileReader(String path) {
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
