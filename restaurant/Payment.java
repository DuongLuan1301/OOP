package Interface.restaurant;

import java.util.ArrayList;

interface Payment {
    //service
    void payCash(Order newOrder);
    void payCreditCard();

    //customer interface
    void customerInterface(ArrayList <MenuItem> Menu);
}
