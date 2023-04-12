package week06_iheritance.bank;

public class Person extends Client {

    public Person(String name) {
        super(name);
    }

    @Override
    public String getInfo() {
        String gender;
        if (name.endsWith("ova"))
            gender = "paní";
        else
            gender = "pan";
        return String.format("%s %s", gender, name);
    }

}
