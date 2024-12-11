package advance.University;

public abstract class Employee {
    protected String fullName, dob, address, baseSalary;

    Employee(String fullName, String dob, String address, String baseSalary) {
        this.fullName = fullName;
        this.dob = dob;
        this.address = address;
        this.baseSalary = baseSalary;
    }

    String getInfoEmployee() {
        return "Fullname: "+fullName+", date-of-birth: "+dob+", address: "+address+", baseSalary: "+baseSalary;
    }

    abstract void calculateSalary();
}
