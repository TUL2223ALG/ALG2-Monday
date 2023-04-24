package week09_competitionwithfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Competition {

    private List<Runner> runners;
    
    public Competition() {
        this.runners = new ArrayList<Runner>();
    }
    
    public void add(Runner r) {
        runners.add(r);
    }
    
    public void add(String name, int number) {
        Runner r = new Runner(number, name);
        add(r);
    }
    
    public void loadRegistration(File registrationFile) throws FileNotFoundException, IOException {
        try ( BufferedReader br = new BufferedReader(new FileReader(registrationFile))) {
            String line, name;
            String[] parts;
            int number;
            while ((line = br.readLine()) != null) { //uz konec souboru?
//                parts = line.split(" +");
//                number = Integer.parseInt(parts[0]);
//                name = parts[1];
//                add(name, number);
                Runner r = Runner.getInstance(line);
                add(r);
            }
        }
    }
    
    public String toText(){
        StringBuilder sb = new StringBuilder();
        for (Runner runner : runners) {
            sb.append(runner).append("\n");
        }
        return sb.toString();
    }
    
}
