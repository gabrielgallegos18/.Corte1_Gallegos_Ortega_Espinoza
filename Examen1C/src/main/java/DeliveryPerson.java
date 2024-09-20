public class DeliveryPerson extends Employee {
    private String zone;  // Zona de reparto

    public DeliveryPerson(String id, String firstName, String lastName, int age, double baseSalary, String zone) {
        super(id, firstName, lastName, age, baseSalary);
        this.zone = zone;
    }

    @Override
    public double calculateNetSalary() {
        double salary = getBaseSalary();
        if (getAge() < 25 && zone.equalsIgnoreCase("Ciudad Sandino")) {
            salary += INCENTIVE;  // Recibe el incentivo completo
        }
        // Deducción del 10% por servicio profesional
        salary -= salary * 0.10;
        return salary;
    }
}


