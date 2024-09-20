public abstract class Employee {
    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private double baseSalary;
    public static final double INCENTIVE = 300; // Incentivo común para todos los empleados

    public Employee(String id, String firstName, String lastName, int age, double baseSalary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateNetSalary();

    // Getters
    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}
