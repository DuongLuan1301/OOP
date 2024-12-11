package advance.University;

public class Professor extends Employee implements FullTimeFaculty{
    private String type, totalSalary;
    private final float rate_fullTime = 2.25f;
    Professor(String fullName, String dob, String address, String baseSalary) {
        super(fullName, dob, address, baseSalary);
    }
    @Override
    String getInfoEmployee() {
        return "[PROFESSOR] "+super.getInfoEmployee()+", type: "+type+", salary: "+totalSalary;
    }
    @Override
    void calculateSalary() {
        int temp = 0;
        temp += Integer.parseInt(baseSalary)*rate_fullTime;
        totalSalary = String.valueOf(temp);
    }
    @Override
    public void teachFullTime() {
        this.type = "full-time";
        System.out.println(fullName+" is teaching full-time");
    }
}
