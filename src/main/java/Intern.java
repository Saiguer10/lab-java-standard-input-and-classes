public class Intern extends Employee {
    private static final double MAX_SALARIO = 20000;

    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, salary);
        if (salary > MAX_SALARIO) {
            throw new IllegalArgumentException("El salario no puede ser mas alto de" + MAX_SALARIO );
        }
    }

    @Override
    public void setSalary(double salary) {
        if (salary > MAX_SALARIO) {
            throw new IllegalArgumentException("El salario no puede ser mas alto de" + MAX_SALARIO);
        }
        super.setSalary(salary);
    }
}
