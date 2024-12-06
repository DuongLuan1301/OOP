package Interface.restaurant;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        //create restaurant
        Restaurant restaurant1 = new Restaurant("Nha Hang Niga", "12A Huynh Van Nghe", "0901010212");

        //create customer
        restaurant1.inputCustomer("Nguyen Van A", "12A Huynh Van Nghe", "0912345678");
        restaurant1.inputCustomer("Nguyen Thi B", "12A Huynh Van Nghe", "0914828842");

        //create chef
        restaurant1.inputChef("Duong Luan", "12A Huynh Van Nghe", "0913173020");
        restaurant1.inputChef("Pham Minh Anh", "12A Huynh Van Nghe", "0949700550");

        //create waiter
        restaurant1.inputWaiter("Ho Thi Ly", "12A Huynh Van Nghe", "0947288130");
        restaurant1.inputWaiter("Thuy Diem", "12A Huynh Van Nghe", "0879463862");

        //create Menu with Items
        restaurant1.inputMenu("Beef Steak", "80000", "Yummy Cow");
        restaurant1.inputMenu("Spaghetti", "85000", "Best Choice");
        restaurant1.inputMenu("Chicken Fried", "75000", "Nice chicken");
        restaurant1.inputMenu("Burito", "55000", "Must Try");
        restaurant1.inputMenu("Cappuccino", "39000", "Traditrional Coffee");
        restaurant1.inputMenu("Coca", "29000", "Coke");
        restaurant1.inputMenu("Orange Juice", "39000", "Sweet fruit");

        // chef interface
        for(Chef thisChef : restaurant1.getChefs())
            thisChef.Interface(restaurant1.getMenu());

        // waiter interface
        for(Waiter thisWaiter : restaurant1.getWaiters())
            thisWaiter.Interface(restaurant1.getMenu());

        // customer interface
        for(Customer thisCustomer : restaurant1.getCustomers()) {
            thisCustomer.customerInterface(restaurant1.getMenu());
        }

        scan.close();
    }   
}
