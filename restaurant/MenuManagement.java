package Interface.restaurant;

import java.util.ArrayList;

interface MenuManagement {
    //Service
    Boolean addMenuItem(ArrayList <MenuItem> Menu);
    void removeMenuItem(ArrayList <MenuItem> Menu);
    void updateMenuItem(ArrayList <MenuItem> Menu);
    //Chefs, Waiter Interface
    void Interface(ArrayList <MenuItem> Menu);
}
