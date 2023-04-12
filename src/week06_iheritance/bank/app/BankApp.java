package week06_iheritance.bank.app;

import week06_iheritance.bank.Client;
import week06_iheritance.bank.Company;
import week06_iheritance.bank.Person;
import java.util.Arrays;
import week06_iheritance.bank.ComparatorByName;

public class BankApp {
    public static void main(String[] args) {
        Client[] clients = {new Person("Pekar"), new Person("Svecova"), new Company("Skoda")};
        clients[0].addAccount(1000);
        clients[0].addAccount(500);
        clients[1].addAccount(1200);
        clients[2].addAccount(120);
        for (Client client : clients) {
            System.out.println(client);
        }
        System.out.println("==================");
        
        Arrays.sort(clients);
        for (Client client : clients) {
            System.out.println(client);
        }
        System.out.println("==================");
        
        Arrays.sort(clients, new ComparatorByName());
        for (Client client : clients) {
            System.out.println(client);
        }
    }
}
