package advance.University;

public class TeachingAssistant extends Employee implements FullTimeFaculty, PartTimeFaculty {
    private String type, totalSalary;
    private final float rate_fullTime = 2.25f;
    private final float rate_partTime = 1.25f;
    TeachingAssistant(String fullName, String dob, String address, String baseSalary) {
        super(fullName, dob, address, baseSalary);
    }
    @Override
    String getInfoEmployee() {
        return "[TEACHING_ASSISTANT] "+super.getInfoEmployee()+", type: "+type+", salary: "+totalSalary;
    }
    @Override
    void calculateSalary() {
        int temp = 0;
        if(type.equals("full-time"))
            temp += Integer.parseInt(baseSalary)*rate_fullTime;
        else if(type.equals("part-time"))
            temp += Integer.parseInt(baseSalary)*rate_partTime;
        totalSalary = String.valueOf(temp);
    }
    @Override
    public void teachFullTime() {
        type = "full-time";
        System.out.println(fullName+" is teaching full-time");
    }
    @Override
    public void teachPartTime() {
        type = "part-time";
        System.out.println(fullName+" is preparing teaching materials");
    }
}
