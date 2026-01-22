package myfirstproject;

import java.util.ArrayList; //استيراد مكاتب هياكل بيانات
import java.util.List;

public class Manager extends Person {
    private List<Employee> employees;  //قائمة موظفين هذا هيكل بيانات

    public Manager(int id, String name, String phoneNumber) {
        super(id, name, phoneNumber);
        employees = new ArrayList<>();//إنشاء القائمة.
    }

    public void addEmployee(Employee e) { //إضافة موظف للقائمة.
        employees.add(e);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employees under this manager:");
        for (Employee e : employees) {//حلقة تمر على كل الموظفين وتعرض بياناتهم.
            e.displayInfo();
        }
    }
}

