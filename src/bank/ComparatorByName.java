package bank;

import java.util.Comparator;

/**
 *
 * @author 
 */
public class ComparatorByName implements Comparator<Client>{

    @Override
    public int compare(Client o1, Client o2) {
        int fLetterAsciio1 = (int) o1.name.charAt(0);
        int fLetterAsciio2 = (int) o2.name.charAt(0);
        return fLetterAsciio1 - fLetterAsciio2;
    }

}
