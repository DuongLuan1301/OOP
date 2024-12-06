package Interface.restaurant;

import java.util.ArrayList;

public class Waiter extends Customer implements MenuManagement{
    final String Type = "W";

    Waiter() {}

    Waiter(String name, String address, String phone) {
        super(name, address, phone);
    }

    @Override
    public Boolean addMenuItem(ArrayList <MenuItem> Menu) {
        System.out.println("addMenuItem() called");
        return true;
    }
    @Override
    public void removeMenuItem(ArrayList <MenuItem> Menu) {
        System.out.println("removeMenuItem() called");
    }
    @Override
    public void updateMenuItem(ArrayList <MenuItem> Menu) {
        System.out.println("updateMenuItem() called");
    }
    @Override
    String getCustomerDetail() {
        return "WAITER: "+super.getCustomerDetail();
    }
    @Override
    public void Interface(ArrayList <MenuItem> Menu) {

    }
}
