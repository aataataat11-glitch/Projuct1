package myfirstproject;

import java.util.ArrayList;
import java.util.List;

public class Supplier extends Person {
    private Manager manager;//يتبع مدير
    private List<Product> products; //لديه قائمة منتجات

    public Supplier(int id, String name, String phoneNumber, Manager manager) {
        super(id, name, phoneNumber);
        this.manager = manager;
        products = new ArrayList<>(); //إنشاء قائمة المنتجات.
    }

    public void addProduct(Product p) {
        products.add(p); //إضافة منتج.
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Managed by: " +
                (manager != null ? manager.getName() : "None"));
        System.out.println("Products:"); //استعراض كل المنتجات.
        for (Product p : products) {
            System.out.println("Product ID: " + p.getProductId()
                    + ", Qty: " + p.getQuantity()
                    + ", Price: " + p.getPrice());
        }
    }
}

