package advance.travelCompany;

import java.util.ArrayList;

public class AdditionalService {
    private ArrayList <String> additionalServices;
    
    AdditionalService() {
        additionalServices = new ArrayList<>();
    }

    void addAdditionalService(String nameService) {
        additionalServices.add(nameService);
    }

    ArrayList <String> getAdditionalServices() {
        return additionalServices;
    }
}
