package Interface.restaurant;

import java.util.ArrayList;

public class Order {
    private String time, orderDate, totalAmount;
    private ArrayList<MenuItem> OrderList;

    Order() {
        OrderList = new ArrayList<>();
    }

    void setTime(String time) {
        this.time = time;
    }

    void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    void setTotalAmount() {
        int sum = 0;
        for (MenuItem item : OrderList)
            sum += Integer.parseInt(item.getPriceItem());
        totalAmount = String.valueOf(sum);
    }

    ArrayList<MenuItem> getOrderList() {
        return OrderList;
    }

    void displayOrderList() {
        System.out.println("Time: " + time + ", Date: " + orderDate);
        for (MenuItem item : OrderList)
            System.out.println(item.getMenuItem());
        System.out.println("Total amount: " + totalAmount);
    }
}
