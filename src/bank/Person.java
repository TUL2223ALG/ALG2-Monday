/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package bank;

/**
 *
 * @author 
 */
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
