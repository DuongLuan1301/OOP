package advance.travelCompany;

public class Main {
    //Function for TransportationManagement
    static void add_Transportation(TravelPackage packageItem, String transportName) {
        // casting type
        if (packageItem instanceof TransportationManagement) {
            TransportationManagement transport = (TransportationManagement) packageItem;
            transport.addTransportation(transportName);
        }
    }
    //Function for AccommodationManagement
    static void add_Accommodation(TravelPackage packageItem, String accommoName) {
        // casting type
        if (packageItem instanceof AccommodationManagement) {
            AccommodationManagement accommo = (AccommodationManagement) packageItem;
            accommo.addAccommodation(accommoName);
        }
    }
    // Function for AddtionalServiceManagement
    static void requestAddiontalService(TravelPackage packageItem, String serviceName) {
        //casting type
        if(packageItem instanceof AdditionalServiceManagement) {
            AdditionalServiceManagement bonusService = (AdditionalServiceManagement) packageItem;
            for(String item : menu_1.getAdditionalServices()) {
                if(serviceName.equals(item)) {
                    bonusService.addAdditionalService(serviceName);
                    break;
                }
            }
        }
    }

    //Static variable
    static AdditionalService menu_1 = new AdditionalService();

    public static void main(String[] args) {
        menu_1.addAdditionalService("Tham quan");
        menu_1.addAdditionalService("Huong dan vien");
        menu_1.addAdditionalService("Phien dich vien");

        System.out.println("Additional services: "+menu_1.getAdditionalServices()+'\n');

        //create 2 TransportOnlyPackages objects
        TravelPackage package_1 = new TransportOnlyPackage("Package 1", "4000000");
        TravelPackage package_2 = new TransportOnlyPackage("Package 2", "4000000");

        add_Transportation(package_1, "Bus");
        add_Transportation(package_1, "Train");
        requestAddiontalService(package_1, "Tham quan");
        requestAddiontalService(package_1, "Huong dan vien");
        System.out.println(package_1.getPackageDetail()+'\n');

        add_Transportation(package_2, "Plane");
        add_Transportation(package_2, "Bus");
        requestAddiontalService(package_2, "Phien dich vien");
        System.out.println(package_2.getPackageDetail()+'\n');

        //create 2 AccommodationOnlyPackage objects
        TravelPackage package_3 = new AccommodationOnlyPackage("Package 3", "2500000");
        TravelPackage package_4 = new AccommodationOnlyPackage("Package 4", "2500000");

        add_Accommodation(package_3, "Nha Trang Resort");
        requestAddiontalService(package_3, "Huong dan vien");
        System.out.println(package_3.getPackageDetail()+'\n');

        add_Accommodation(package_4, "Mui Ne Resort");
        requestAddiontalService(package_4, "Tham quan");
        System.out.println(package_4.getPackageDetail()+'\n');

        //create 2 FullPackage objects
        TravelPackage package_5 = new FullPackage("Package 5", "6500000");
        TravelPackage package_6 = new FullPackage("Package 6", "6500000");

        add_Transportation(package_5, "Train");
        add_Accommodation(package_5, "Vung Tau Resort");
        requestAddiontalService(package_5, "Tham quan");
        System.out.println(package_5.getPackageDetail()+'\n');

        add_Transportation(package_6, "Plane");
        add_Accommodation(package_6, "Nha Trang Resort");
        requestAddiontalService(package_6, "Phien dich vien");
        System.out.println(package_6.getPackageDetail()+'\n');

        //create 2 NoTransportNoAccommodationPackage objects
        TravelPackage package_7 = new NoTransportNoAccommodationPackage("Package 7", "1000000");
        TravelPackage package_8 = new NoTransportNoAccommodationPackage("Package 8", "1000000");

        requestAddiontalService(package_7, "Tham quan");
        System.out.println(package_7.getPackageDetail()+'\n');

        requestAddiontalService(package_8, "Huong dan vien");
        System.out.println(package_8.getPackageDetail()+'\n');
    }
}
