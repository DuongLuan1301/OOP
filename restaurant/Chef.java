package Interface.restaurant;

import java.util.ArrayList;

public class Chef extends Customer implements MenuManagement {
    final String Type = "C";
    java.util.Scanner scan = new java.util.Scanner(System.in);

    Chef() {
    }

    Chef(String name, String address, String phone) {
        super(name, address, phone);
    }

    @Override
    public Boolean addMenuItem(ArrayList<MenuItem> Menu) {
        String nameItem, priceItem, descriptionItem;
        System.out.print("Name: ");
        nameItem = scan.nextLine();
        for (MenuItem checkItem : Menu) {
            if (nameItem.equals(checkItem.getNameItem())) {
                System.out.println("There was the same name in menu");
                return false;
            }
        }
        System.out.print("Price: ");
        priceItem = scan.nextLine();
        System.out.print("Description: ");
        descriptionItem = scan.nextLine();
        Menu.add(new MenuItem(nameItem, priceItem, descriptionItem));
        return true;

    }
    //chefs are not allowed to use this function
    @Override
    public void removeMenuItem(ArrayList<MenuItem> Menu) {
        System.out.println("removeMenuItem() called");
    }

    @Override
    public void updateMenuItem(ArrayList<MenuItem> Menu) {
        String nameItem;
        byte choice;
        Boolean isActive = true, isDifferName;
        System.out.println("Current Menu");
        for (MenuItem item : Menu)
            System.out.println(item.getMenuItemDetail());
        System.out.print("Input name item you want to update: ");
        nameItem = scan.nextLine();
        for (MenuItem checkItem : Menu) {
            if (nameItem.equals(checkItem.getNameItem())) {
                while (isActive) {
                    System.out.println("1. Name");
                    System.out.println("2. Price");
                    System.out.println("3. Description");
                    System.out.print("Input option (number) you want to change: ");
                    choice = Byte.parseByte(scan.nextLine());
                    switch (choice) {
                        case 1:
                            isDifferName = true;
                            System.out.print("Input new name: ");
                            nameItem = scan.nextLine();
                            for (MenuItem check : Menu) {
                                if (nameItem.equals(check.getNameItem())) {
                                    System.out.println("There was the same name in menu! Please try again");
                                    isDifferName = false;
                                    break;
                                }
                            }
                            if(isDifferName) {
                                checkItem.setName(nameItem);
                                System.out.println("Update new name successfully!");
                                System.out.println(checkItem.getMenuItemDetail());
                                isActive = false;
                            }
                            break;
                        case 2:
                            isDifferName = true;
                            System.out.print("Input new price: ");
                            nameItem = scan.nextLine();
                            for(int i = 0; i < nameItem.length(); i++) {
                                if(!Character.isDigit(nameItem.charAt(i))) {
                                    System.out.println("Error! The value must be integer");
                                    isDifferName = false;
                                    break;
                                }
                            }
                            if(isDifferName) {
                                checkItem.setPrice(nameItem);
                                System.out.println("Update new price successfully!");
                                System.out.println(checkItem.getMenuItemDetail());
                                isActive = false;
                            }
                            break;
                        case 3:
                            System.out.println("Dang bao tri hehehe");
                            break;
                        default:
                            System.out.println("Error option! try again");
                            break;
                    }
                }
            }
        }
    }

    @Override
    String getCustomerDetail() {
        return "CHEF: " + super.getCustomerDetail();
    }

    @Override
    public void Interface(ArrayList<MenuItem> Menu) {
        Boolean isActive = true;
        Byte choice;
        System.out.println("Hello " + name + "!");
        while (isActive) {
            System.out.println("1. Add New Menu Item");
            System.out.println("2. Update Menu Item");
            System.out.println("3. Log out");
            System.out.print("Input option (number): ");
            choice = Byte.valueOf(scan.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Current Menu");
                    for (MenuItem item : Menu)
                        System.out.println(item.getMenuItemDetail());
                    if (this.addMenuItem(Menu))
                        System.out.println("Added new menu item successfully!");
                    for (MenuItem item : Menu)
                        System.out.println(item.getMenuItemDetail());
                    break;
                case 2:
                    this.updateMenuItem(Menu);
                    break;
                case 3:
                    isActive = false;
                    System.out.println(name + " has just logged out");
                    break;
                default:
                    System.out.println("Invalid Option! Please try again");
                    break;
            }
        }
    }
}
