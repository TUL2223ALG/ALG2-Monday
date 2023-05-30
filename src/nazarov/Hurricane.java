
package nazarov;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Hurricane {
   //JV atributy maji byt private - nesmi se mimo tridy nastavovat primo
    int rok;
   String mesic;
   int tlak;
   int rychlostUzli;
   String name;
   double rychlostKm;
   String category;
    @Override
    public String toString() {
        return "hurricane{" + "rok=" + rok + ", mesic=" + mesic + ", tlak=" + tlak + ", rychlost=" + rychlostUzli + ", name=" + name + '}';
    }

    public Hurricane(int rok, String mesic, int tlak, int rychlost, String name) {
        this.rok = rok;
        this.mesic = mesic;
        this.tlak = tlak;
        this.rychlostUzli = rychlost;
        this.name = name;
        speedToKm();
        findCategory();
    }

    public String getName() {
        return name;
    }
    public void speedToKm(){
        this.rychlostKm=1.852*(double)this.rychlostUzli;
    }
   public void findCategory() {
       if (rychlostKm<=153){
           this.category = "Category 1";
       }
       else if (rychlostKm<=177){
           this.category = "Category 2";
       }
        else if (rychlostKm<=208){
           this.category = "Category 3";
       }
        else if (rychlostKm<=251){
           this.category = "Category 4";
       }
        else if (rychlostKm>252){
           this.category = "Category 5";
       }
   }
 
    public Hurricane() {
    }
}
