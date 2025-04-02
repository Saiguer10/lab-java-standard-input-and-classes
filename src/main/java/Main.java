import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Antonio", "antonio@email.com", 32, 45000));
        employees.add(new Employee("Jesus", "jesus@email.com", 38, 34500));
        employees.add(new Employee("Candela", "Candela@email.com", 21, 20300));
        employees.add(new Employee("Alberto", "alberto@email.com", 45, 33000));
        employees.add(new Employee("Jose", "jose@email.com", 37, 58000));
        employees.add(new Employee("Paula", "paula@email.com", 25, 19500));
        employees.add(new Employee("Mar", "mar@email.com", 29, 25000));
        employees.add(new Employee("Elsa", "elsa@email.com", 23, 18000));
        employees.add(new Employee("Damian", "damian@email.com", 27, 52000));
        employees.add(new Employee("Gema", "gema@email.com", 42, 41200));

        try (FileWriter writer = new FileWriter("employees.txt")){
            for (Employee empleado : employees) {
                writer.write(empleado.toString() + "\n");
            }

            System.out.println("Empleados guardados en el archivo employees.txt");
        } catch (IOException e) {
            System.out.println("Se ha producido un error de escritura en el archivo: " + e.getMessage());
        }
    }
}

