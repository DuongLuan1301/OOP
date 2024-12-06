package Interface.restaurant;

import java.util.ArrayList;

public class Customer implements Payment {
    protected String name, address, phone;
    private ArrayList <Order> OrderList= new ArrayList<>();
    java.util.Scanner scan = new java.util.Scanner(System.in);

    Customer() {}

    Customer(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    String getCustomerDetail() {
        return "Name: " + name + ", address: " + address + ", phone: " + phone;
    }

    @Override
    public void payCash(Order newOrder) {
        newOrder.setTotalAmount();
    }

    @Override
    public void payCreditCard() {
        System.out.println("dang bao tri");
    }

    @Override
    public void customerInterface(ArrayList<MenuItem> Menu) {
        Boolean isActive = true;
        Boolean isOrder = false;
        Boolean isRunning;
        String nameItem;
        byte choice;
        // creat an Order
        Order newOrder = new Order();
        while (isActive) {
            System.out.println("Customer " + name);
            System.out.println("1. Order");
            System.out.println("2. Watch bill");
            System.out.println("3. Pay money");
            System.out.println("4. Log out");
            System.out.print("Input your option (number): ");
            choice = Byte.valueOf(scan.nextLine());
            switch (choice) {
                case 1:
                    isRunning = true;
                    System.out.println("Current menu");
                    for (MenuItem item : Menu)
                        System.out.println(item.getMenuItemDetail());
                    while (isRunning) {
                        System.out.print("Input the name Item to order (press 0 to end): ");
                        nameItem = scan.nextLine();
                        if (nameItem.equals("0"))
                            isRunning = false;
                        for (MenuItem item : Menu) {
                            if (nameItem.equals(item.getNameItem()))
                                newOrder.getOrderList().add(item);
                        }
                    }
                    isOrder = true;
                    break;
                case 2:
                    newOrder.setTotalAmount();
                    newOrder.displayOrderList();
                    break;
                case 3:
                    if (isOrder) {
                        System.out.print("Time: ");
                        newOrder.setTime(scan.nextLine());
                        System.out.print("Order Date: ");
                        newOrder.setOrderDate(scan.nextLine());
                        isRunning = true;
                        while (isRunning) {
                            System.out.println("1. Pay cash");
                            System.out.println("2. Pay credit card");
                            System.out.print("Input your option (number): ");
                            choice = Byte.valueOf(scan.next());
                            switch (choice) {
                                case 1:
                                    payCash(newOrder);
                                    isRunning = false;
                                    break;
                                case 2:
                                    this.payCreditCard();
                                    // isRunning = false;
                                    break;
                                default:
                                    System.out.println("Invalid Option! Please try again");
                                    break;
                            }
                        }
                        System.out.println("Paid successfully!");
                        System.out.println("Bill detail:");
                        System.out.println("Customer " + name);
                        newOrder.displayOrderList();
                        OrderList.add(newOrder);
                    } 
                    else {
                        System.out.println("There is no any item in bill to pay money");
                    }
                    isActive = false;
                    break;
                case 4:
                    System.out.println("Customer " + name + " has just logged out");
                    isActive = false;
                    break;
                default:
                    System.out.println("Invalid Option! Please try again");
                    break;
            }
        }
    }
}
