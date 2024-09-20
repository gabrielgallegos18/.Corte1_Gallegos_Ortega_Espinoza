public class OfficeWorker extends Employee {
    private String position; // Cargo del empleado

    public OfficeWorker(String id, String firstName, String lastName, int age, double baseSalary, String position) {
        super(id, firstName, lastName, age, baseSalary);
        this.position = position;
    }

    @Override
    public double calculateNetSalary() {
        double salary = getBaseSalary();
        if (position.equalsIgnoreCase("Manager")) {
            salary += INCENTIVE * 0.20;  // Gerente recibe 20% del incentivo
        } else {
            salary += INCENTIVE * 0.80;  // Otros cargos reciben 80% del incentivo
        }
        // Deducción del 7% de Seguro Social
        salary -= salary * 0.07;
        return salary;
    }
}
