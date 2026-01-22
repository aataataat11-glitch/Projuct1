package myfirstproject;

public class Employee extends Person {
    private String jobTitle;
    private double salary;
    private Manager manager;

    public Employee(int id, String name, String phoneNumber,
                    String jobTitle, double salary, Manager manager) {
        super(id, name, phoneNumber);//يستدعي Constructor الأب (Person)
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.manager = manager;
    }

    @Override      //هذا اسمه Polymorphism.
    public void displayInfo() {
        super.displayInfo(); //يطبع معلومات Person أولًا.
        System.out.println("Job: " + jobTitle + ", Salary: " + salary);
        if (manager != null) { //إذا للموظف مدير، نطبع اسمه.
            System.out.println("Manager: " + manager.getName());
        }
    }
}
