package advance.University;

public class IT_Employee extends Employee implements FullTimeFaculty, PartTimeFaculty{
    private String type, totalSalary;
    private final float rate_fullTime = 2.25f;
    private final float rate_partTime = 1.25f;
    IT_Employee(String fullName, String dob, String address, String baseSalary) {
        super(fullName, dob, address, baseSalary);
    }
    @Override
    String getInfoEmployee() {
        return "[IT_EMPLOYEE] "+super.getInfoEmployee()+", type: "+type+", salary: "+totalSalary;
    }
    @Override
    void calculateSalary() {
        int temp = 0;
        if(type.equals("full-time"))
            temp += Integer.parseInt(baseSalary)*rate_fullTime;
        else
            temp += Integer.parseInt(baseSalary)*rate_partTime;
        totalSalary = String.valueOf(temp);
    }
    @Override
    public void teachFullTime() {
        this.type = "full-time";
        System.out.println(fullName+" is working full-time");
    }
    @Override
    public void teachPartTime() {
        this.type = "part-time";
        System.out.println(fullName+" is working part-time");
    }

}
