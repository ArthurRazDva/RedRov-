package HomeWork;

public class Employee extends Person {
    double salary;

    boolean isSameName(Employee employee) {
        return employee.name.equals(this.name);
    }
}