
package Nazarov;


public class Student {
    private String name;
    private String secondName;
    private String stagName;
    private int body;
    private String zapocet; //JV lepsi je boolean
    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setStagName(String stagName) {
        this.stagName = stagName;
    }

    public void setZapocet(String zapocet) {
        this.zapocet = zapocet;
    }

    public Student(String name, String secondName, String stagNames) {
        this.name = name;
        this.secondName = secondName;
        this.stagName = stagNames;
    }

    public void setBody(int body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", secondName=" + secondName + ", stagNames=" + stagName + ", body=" + body + ", zapocet=" + zapocet + '}';
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getStagName() {
        return stagName;
    }

    public int getBody() {
        return body;
    }

    public String getZapocet() {
        return zapocet;
    } 
    public void maZapocet(){ //JV user musi zavolat maZapocet() a pak ještě getZapocet() - zbytecne
        if (body>=50) {
            this.zapocet="ano";
        }
        else {
            this.zapocet="ne";
        }
    }
    public void addBody(int body){
        this.body+=body;
    }
}
