package advance.University;

public class UniversityManagement {
    //Functions for FullTimeFaculty
    static void teach_fullTime(Employee employee) {
        //casting type
        if(employee instanceof FullTimeFaculty) {
            FullTimeFaculty fullTimeEmployee = (FullTimeFaculty) employee;
            fullTimeEmployee.teachFullTime();
        }
    }
    //Functions for PartTimeFaculty
    static void teach_partTime(Employee employee) {
        //casting type
        if(employee instanceof PartTimeFaculty) {
            PartTimeFaculty partTimeEmployee = (PartTimeFaculty) employee;
            partTimeEmployee.teachPartTime();
        }
    }
    //Functions for Organization
    static void organize(Employee employee) {
        //casting type
        if(employee instanceof administrativeStaff) {
            administrativeStaff organizer = (administrativeStaff) employee;
            organizer.organize();
        }
    }


    public static void main(String[] args) {
        // create 2 professors
        Employee professor_1 = new Professor("Nguyen Van A", "15/12/2000", "ABC", "7000000");
        Employee professor_2 = new Professor("Nguyen Van B", "13/02/2002", "ABC", "7000000");

        teach_fullTime(professor_1);
        professor_1.calculateSalary();
        System.out.println(professor_1.getInfoEmployee());

        teach_fullTime(professor_2);
        professor_2.calculateSalary();
        System.out.println(professor_2.getInfoEmployee());

        // create full-time assistant
        Employee assistant_1 = new TeachingAssistant("Le Thi A", "25/10/2004", "HKF", "2000000");
        // create part-time assistant
        Employee assistant_2 = new TeachingAssistant("Le Thi B", "25/10/2004", "HKF", "2000000");

        teach_fullTime(assistant_1);
        assistant_1.calculateSalary();
        System.out.println(assistant_1.getInfoEmployee());

        teach_partTime(assistant_2);
        assistant_2.calculateSalary();
        System.out.println(assistant_2.getInfoEmployee());

        // create administrative staff
        Employee administrativeStaff_1 = new adminStaff("Pham Minh A", "10/10/2005", "HIK", "200000", 10);

        organize(administrativeStaff_1);
        administrativeStaff_1.calculateSalary();
        System.out.println(administrativeStaff_1.getInfoEmployee());

        // create IT Employee part-time
        Employee itEmployee_1 = new IT_Employee("IT1", "09/09/1998", "ZZZ", "9000000");
        // create IT Employee full-time
        Employee itEmployee_2 = new IT_Employee("IT2", "22/04/1998", "ZZZ", "9000000");

        teach_fullTime(itEmployee_1);
        itEmployee_1.calculateSalary();
        System.out.println(itEmployee_1.getInfoEmployee());

        teach_partTime(itEmployee_2);
        itEmployee_2.calculateSalary();
        System.out.println(itEmployee_2.getInfoEmployee());
    }
}
