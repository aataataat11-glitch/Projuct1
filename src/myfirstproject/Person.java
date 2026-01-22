package myfirstproject;

public class Person {
    protected int id;                        //protected → الأبناء (Employee, Manager…) يقدروا يستخدموها
    protected String name;
    protected String phoneNumber;

    public Person(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", Phone: " + phoneNumber);
    }
}

