public class Salesperson extends Employee {
    private double commission;  // Comisión obtenida

    public Salesperson(String id, String firstName, String lastName, int age, double baseSalary, double commission) {
        super(id, firstName, lastName, age, baseSalary);
        this.commission = commission;
    }

    @Override
    public double calculateNetSalary() {
        double salary = getBaseSalary();
        if (getAge() > 30 && commission < 500) {
            salary += INCENTIVE * 0.50;  // Si cumple las condiciones, recibe el 50% del incentivo
        }
        // Deducción del 7% para Seguro Social
        salary -= salary * 0.07;
        return salary;
    }
}

