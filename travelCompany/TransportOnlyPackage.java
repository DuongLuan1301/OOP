package advance.travelCompany;

import java.util.ArrayList;

public class TransportOnlyPackage extends TravelPackage implements TransportationManagement, AdditionalServiceManagement{
    private ArrayList <String> transportationList;
    private AdditionalService additionalServiceList;

    TransportOnlyPackage(String name, String price) {
        super(name, price);
        transportationList = new ArrayList<>();
        additionalServiceList = new AdditionalService();
    }
    @Override
    public void addTransportation(String transportName) {
        transportationList.add(transportName);
    }
    @Override
    public void addAdditionalService(String serviceName) {
        additionalServiceList.addAdditionalService(serviceName);
    }
    @Override
    String getPackageDetail() {
        return "-----[TransportOnlyPackage]-----\n"+super.getPackageDetail()+"\nTransportations: "+transportationList+"\nAdditonal services: "+additionalServiceList.getAdditionalServices();
    }
}
