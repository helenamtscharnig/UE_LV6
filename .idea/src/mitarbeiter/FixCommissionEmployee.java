package mitarbeiter;

public class FixCommissionEmployee extends Employee {

    private double commission;

    public FixCommissionEmployee(String lastname, String firstname, String department, double salary, double commission) {
        super(lastname, firstname, department, salary);
        this.commission = commission;
    }

    @Override
    public double getFullSalary() {
        return super.getFullSalary() + commission;
    }
}
