package week06_iheritance.bank;

public class Company extends Client {

    public Company(String name) {
        super(name);
    }

    @Override
    public String getInfo() {
        return String.format("firma %s", name);
    }
}
