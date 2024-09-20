import java.util.Scanner;

public class EmployeeManagementApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        // Mostrar el menú hasta que el usuario decida salir
        while (!exit) {
            printMenu();  // Imprimir el menú con las opciones

            System.out.print("Seleccione una opción: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (option) {
                case 1:
                    createOfficeWorker(scanner);
                    break;
                case 2:
                    createDeliveryPerson(scanner);
                    break;
                case 3:
                    createSalesperson(scanner);
                    break;
                case 4:
                    System.out.println("Saliendo del programa. ¡Adiós!");
                    exit = true;
                    break;
                default:
                    System.out.println("¡Opción no válida! Por favor, seleccione una opción correcta.");
            }
        }

        scanner.close();
    }

    // Método para imprimir el menú
    private static void printMenu() {
        System.out.println("****************************************");
        System.out.println("*         Gestión de Empleados          *");
        System.out.println("****************************************");
        System.out.println("1. Crear Oficinista");
        System.out.println("2. Crear Repartidor");
        System.out.println("3. Crear Comercial");
        System.out.println("4. Salir");
        System.out.println("****************************************");
    }

    // Método para crear un Oficinista
    private static void createOfficeWorker(Scanner scanner) {
        System.out.println("*** Creando Oficinista ***");
        // Recoge los datos comunes del empleado
        String[] employeeData = createCommonEmployeeData(scanner);

        System.out.print("Ingrese el cargo (Gerente u Otro): ");
        String position = scanner.nextLine();

        // Crear una instancia de OfficeWorker
        Employee officeWorker = new OfficeWorker(
                employeeData[0],  // ID
                employeeData[1],  // First Name
                employeeData[2],  // Last Name
                Integer.parseInt(employeeData[3]),  // Age
                Double.parseDouble(employeeData[4]),  // Base Salary
                position
        );

        // Calcular y mostrar el salario neto
        double netSalary = officeWorker.calculateNetSalary();
        System.out.println("Salario Neto para Oficinista: $" + netSalary);
    }

    // Método para crear un Repartidor
    private static void createDeliveryPerson(Scanner scanner) {
        System.out.println("*** Creando Repartidor ***");
        // Recoge los datos comunes del empleado
        String[] employeeData = createCommonEmployeeData(scanner);

        System.out.print("Ingrese la zona de reparto: ");
        String zone = scanner.nextLine();

        // Crear una instancia de DeliveryPerson
        Employee deliveryPerson = new DeliveryPerson(
                employeeData[0],  // ID
                employeeData[1],  // First Name
                employeeData[2],  // Last Name
                Integer.parseInt(employeeData[3]),  // Age
                Double.parseDouble(employeeData[4]),  // Base Salary
                zone
        );

        // Calcular y mostrar el salario neto
        double netSalary = deliveryPerson.calculateNetSalary();
        System.out.println("Salario Neto para Repartidor: $" + netSalary);
    }

    // Método para crear un Comercial
    private static void createSalesperson(Scanner scanner) {
        System.out.println("*** Creando Comercial ***");
        // Recoge los datos comunes del empleado
        String[] employeeData = createCommonEmployeeData(scanner);

        System.out.print("Ingrese la comisión: ");
        double commission = scanner.nextDouble();
        scanner.nextLine();  // Limpiar el buffer

        // Crear una instancia de Salesperson
        Employee salesperson = new Salesperson(
                employeeData[0],  // ID
                employeeData[1],  // First Name
                employeeData[2],  // Last Name
                Integer.parseInt(employeeData[3]),  // Age
                Double.parseDouble(employeeData[4]),  // Base Salary
                commission
        );

        // Calcular y mostrar el salario neto
        double netSalary = salesperson.calculateNetSalary();
        System.out.println("Salario Neto para Comercial: $" + netSalary);
    }

    // Método para recoger los datos comunes de los empleados
    private static String[] createCommonEmployeeData(Scanner scanner) {
        System.out.print("Ingrese la cédula: ");
        String id = scanner.nextLine();

        System.out.print("Ingrese el nombre: ");
        String firstName = scanner.nextLine();

        System.out.print("Ingrese el apellido: ");
        String lastName = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        String age = scanner.nextLine();

        System.out.print("Ingrese el salario base: ");
        String baseSalary = scanner.nextLine();

        // Devolver los datos como un array de Strings
        return new String[]{id, firstName, lastName, age, baseSalary};
    }
}

