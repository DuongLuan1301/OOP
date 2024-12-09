package advance.travelCompany;

abstract class TravelPackage {
    protected String name, price;

    TravelPackage(String name, String price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return name;
    }
    String getPrice() {
        return price;
    }
    String getPackageDetail() {
        return "Package name: "+name+", price: "+price;
    }
}
