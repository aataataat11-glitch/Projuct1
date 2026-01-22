package myfirstproject;

public class Customer extends Person {
    private String address;
    private Employee employee; //الموظف مسؤول عنه

    public Customer(int id, String name, String phoneNumber,
                    String address, Employee employee) {
        super(id, name, phoneNumber);
        this.address = address;
        this.employee = employee;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Address: " + address);
        if (employee != null) {
            System.out.println("Handled by Employee: " + employee.getName()); //طباعة الموظف المسؤول عن العميل.
        }
    }
}

