package mitarbeiter;

public class Employee {
    private String lastname;
    private String firstname;
    private String department;
    private double salary;

    public Employee(String lastname, String firstname, String department, double salary) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.department = department;
        this.salary = salary;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public double getFullSalary(){
        return salary;
    }


}
