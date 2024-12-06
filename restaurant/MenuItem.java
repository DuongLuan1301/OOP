package Interface.restaurant;

public class MenuItem {
    private String name, price, description;

    MenuItem() {}

    MenuItem(String name, String price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    void setName(String name) {
        this.name = name;
    }

    void setPrice(String price) {
        this.price = price;
    }

    String getNameItem() {
        return name;
    }

    String getPriceItem() {
        return price;
    }

    String getMenuItemDetail() {
        return "Name: "+name+", price: "+price+", description: "+description;
    }

    String getMenuItem() {
        return "Name: "+name+", price: "+price;
    }
}
