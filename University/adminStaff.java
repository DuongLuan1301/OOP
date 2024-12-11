package advance.University;

public class adminStaff extends Employee implements administrativeStaff {
    private String type, totalSalary;
    private int numOfEvents;
    adminStaff(String fullName, String dob, String address, String baseSalary, int numOfEvents) {
        super(fullName, dob, address, baseSalary);
        this.numOfEvents = numOfEvents;
    }
    @Override
    String getInfoEmployee() {
        return "[ADMINISTRATIVE_STAFF] "+super.getInfoEmployee()+", type: "+type+", salary: "+totalSalary;
    }
    @Override
    void calculateSalary() {
        int temp = 0;
        if(type.equals("organize-events"))
            temp += Integer.parseInt(baseSalary)*numOfEvents;
        totalSalary = String.valueOf(temp);
    }
    @Override
    public void organize() {
        this.type = "organize-events";
        System.out.println(fullName+" organizes event");
    }
}
