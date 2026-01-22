package myfirstproject;

public class Main {
    public static void main(String[] args) {


        // 1) إنشاء المدراء (5)

        Manager m1 = new Manager(1, "Ahmed", "77077001");
        Manager m2 = new Manager(2, "Saleh", "777002");
        Manager m3 = new Manager(3, "Omar", "777003");
        Manager m4 = new Manager(4, "Yousef", "777004");
        Manager m5 = new Manager(5, "Hassan", "777005");


        // 2) إنشاء الموظفين (10)
        // كل موظف مرتبط بمدير

        Employee e1 = new Employee(10, "Ali", "786612001", "Sales", 900, m1);
        Employee e2 = new Employee(11, "Sara", "71002002", "Sales", 950, m1);

        Employee e3 = new Employee(12, "Khaled", "71342003", "IT", 1200, m2);
        Employee e4 = new Employee(13, "Noor", "710982004", "IT", 1100, m2);

        Employee e5 = new Employee(14, "Mona", "71992005", "HR", 800, m3);
        Employee e6 = new Employee(15, "Adel", "712006", "HR", 850, m3);

        Employee e7 = new Employee(16, "Fahd", "73412007", "Support", 700, m4);
        Employee e8 = new Employee(17, "Lina", "78912008", "Support", 720, m4);

        Employee e9 = new Employee(18, "Sami", "712009", "Sales", 1000, m5);
        Employee e10 = new Employee(19, "Rania", "712010", "Sales", 1050, m5);

        // 3) إضافة الموظفين إلى المدراء
        // (Aggregation)
        m1.addEmployee(e1); m1.addEmployee(e2);
        m2.addEmployee(e3); m2.addEmployee(e4);
        m3.addEmployee(e5); m3.addEmployee(e6);
        m4.addEmployee(e7); m4.addEmployee(e8);
        m5.addEmployee(e9); m5.addEmployee(e10);


        // 4) Stack (سجل العمليات)
        // LIFO: آخر عملية تدخل أول عملية تخرج

        ActionStack actionStack = new ActionStack();
        actionStack.pushAction("Add Managers");
        actionStack.pushAction("Add Employees");
        actionStack.pushAction("Add Customers");
        actionStack.popAction(); // يحذف آخر عملية (Add Customers)

        // 5) Queue (طابور الطلبات)
        // FIFO: أول طلب يدخل أول طلب يخرج
        OrderQueue orderQueue = new OrderQueue();

        Customer c1 = new Customer(100, "Customer1", "701001", "Sana'a", e1);
        Customer c2 = new Customer(101, "Customer2", "701002", "Aden", e2);
        Customer c3 = new Customer(102, "Customer3", "701003", "Taiz", e3);
        Customer c4 = new Customer(103, "Customer4", "701004", "Ibb", e4);

        orderQueue.addOrder(c1);
        orderQueue.addOrder(c2);
        orderQueue.addOrder(c3);
        orderQueue.addOrder(c4);

        // معالجة أول طلبين
        orderQueue.processOrder();
        orderQueue.processOrder();

        // 6) Doubly Linked List
        // قائمة الموظفين (تنقل للأمام والخلف)
        DoublyLinkedList employeeList = new DoublyLinkedList();

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);
        employeeList.add(e7);
        employeeList.add(e8);
        employeeList.add(e9);
        employeeList.add(e10);

        System.out.println("Employees Forward:");
        employeeList.displayForward();

        System.out.println("Employees Backward:");
        employeeList.displayBackward();

        // 7) عرض معلومات المدراء
        m1.displayInfo();
        m2.displayInfo();
        m3.displayInfo();
        m4.displayInfo();
        m5.displayInfo();
    }
}

