public class Task1 {
    public static void main(String[] args) {
        Manager m = new Manager(77777);
        m.displaySalary();
        m.increaseSalary();
    }
}

class Employee {
    protected double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    void displaySalary() {
        System.out.println("Salary of employee is INR: " + salary);
    }
}

class Manager extends Employee {

    Manager(double salary) {
        super(salary);
    }

    void increaseSalary() {
        salary = salary * 1.20;
        System.out.println("Salary of manager is INR: " + salary);
    }
}
