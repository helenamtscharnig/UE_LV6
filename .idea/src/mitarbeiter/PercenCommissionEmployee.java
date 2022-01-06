package mitarbeiter;

public class PercenCommissionEmployee extends Employee {
    private int percent;

    public PercenCommissionEmployee(String lastname, String firstname, String department, double salary, int percent) {
        super(lastname, firstname, department, salary);
        this.percent = percent;
    }

    @Override
    public double getFullSalary() {
        return super.getFullSalary() + (super.getFullSalary()*percent/100);
    }
}
