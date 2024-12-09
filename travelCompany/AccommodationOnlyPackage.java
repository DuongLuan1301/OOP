package advance.travelCompany;

import java.util.ArrayList;

public class AccommodationOnlyPackage extends TravelPackage implements AccommodationManagement, AdditionalServiceManagement{
    private ArrayList <String> accommodationList;
    private AdditionalService additionalServiceList;

    AccommodationOnlyPackage(String name, String price) {
        super(name, price);
        accommodationList = new ArrayList<>();
        additionalServiceList = new AdditionalService();
    }
    @Override
    public void addAccommodation(String accommoName) {
        accommodationList.add(accommoName);
    }
    @Override
    public void addAdditionalService(String serviceName) {
        additionalServiceList.addAdditionalService(serviceName);
    }
    @Override
    String getPackageDetail() {
        return "-----[AccommodationOnlyPackage]-----\n"+super.getPackageDetail()+"\nAccommodations: "+accommodationList+"\nAdditonal services: "+additionalServiceList.getAdditionalServices();
    }

}
