package mitarbeiter;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new FixCommissionEmployee("Tscharnig", "Helena", "BPS", 3000.0, 300.0);
        Employee e2 = new PercenCommissionEmployee("Tscharnig", "Johannes", "Tischler", 2500.0, 10);


        System.out.println(e1.getFullSalary());
        System.out.println(e2.getFullSalary());

    }
}
