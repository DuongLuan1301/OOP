package advance.travelCompany;

import java.util.ArrayList;

public class FullPackage extends TravelPackage implements TransportationManagement, AccommodationManagement, AdditionalServiceManagement{
    private ArrayList <String> accommodationList;
    private ArrayList <String> transportationList;
    private AdditionalService additionalServiceList;

    FullPackage(String name, String price) {
        super(name, price);
        accommodationList = new ArrayList<>();
        transportationList = new ArrayList<>();
        additionalServiceList = new AdditionalService();
    }
    @Override
    public void addTransportation(String transportName) {
        transportationList.add(transportName);
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
        return "-----[FullPackage]-----\n"+super.getPackageDetail()+"\nTransportations: "+transportationList+"\nAccommodations: "+accommodationList+"\nAdditonal services: "+additionalServiceList.getAdditionalServices();
    }
}
