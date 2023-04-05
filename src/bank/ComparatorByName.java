package bank;

import java.util.Comparator;

/**
 *
 * @author 
 */
public class ComparatorByName implements Comparator<Client>{

    @Override
    public int compare(Client o1, Client o2) {
        //ne podle ASCII, Collator, Locale
        return o1.compareTo(o2);
    }

}
