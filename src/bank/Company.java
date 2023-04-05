/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package bank;

/**
 *
 * @author 
 */
public class Company extends Client {

    public Company(String name) {
        super(name);
    }

    @Override
    public String getInfo() {
        return String.format("firma %s", name);
    }

}
