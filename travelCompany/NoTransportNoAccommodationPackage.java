package advance.travelCompany;

public class NoTransportNoAccommodationPackage extends TravelPackage implements AdditionalServiceManagement{
    private AdditionalService additionalServiceList;

    NoTransportNoAccommodationPackage(String name, String price) {
        super(name, price);
        additionalServiceList = new AdditionalService();
    }
    @Override
    public void addAdditionalService(String serviceName) {
        additionalServiceList.addAdditionalService(serviceName);
    }
    @Override
    String getPackageDetail() {
        return "-----[NoTransportNoAccommodationPackage]-----\n"+super.getPackageDetail()+"\nAdditonal services: "+additionalServiceList.getAdditionalServices();
    }
}
