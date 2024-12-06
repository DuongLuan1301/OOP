package Interface.restaurant;

import java.util.ArrayList;

public class Restaurant {
    private String name, address, phone;
    private ArrayList <MenuItem> Menu = new ArrayList<>();
    private ArrayList <Chef> ChefList = new ArrayList<>();
    private ArrayList <Waiter> WaiterList = new ArrayList<>();
    private ArrayList <Customer> CustomerList = new ArrayList<>();

    Restaurant() {
    }

    Restaurant(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    void inputMenu(String name, String price, String description) {
        Menu.add(new MenuItem(name, price, description));
    }

    void inputChef(String name, String address, String phone) {
        ChefList.add(new Chef(name, address, phone));
    }

    void inputWaiter(String name, String address, String phone) {
        WaiterList.add(new Waiter(name, address, phone));
    }

    void inputCustomer(String name, String address, String phone) {
        CustomerList.add(new Customer(name, address, phone));
    }

    String getRestaurantDetail() {
        return "Name: "+name+", address: "+address+", phone: "+phone; 
    }

    ArrayList <Chef> getChefs() {
        return ChefList;
    }

    ArrayList <Waiter> getWaiters() {
        return WaiterList;
    }

    ArrayList <Customer> getCustomers() {
        return CustomerList;
    }

    ArrayList <MenuItem> getMenu() {
        return Menu;
    }
}
