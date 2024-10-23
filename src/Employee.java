import java.util.Objects;

public class Employee {
    String name;
    int department;
    int salary;
    private static int id;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        CharStack(0);
    }

    public String getName() {
        return this.name;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public static int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "ФИО сотрудника - " + this.name  + ". Подразделение " + this.department + ". З/П " + this.salary + " " + this.topOfStack;
    }

    // Переменные экземпляра
    private char [] stackArray;  // Массив для хранения символов
    private int topOfStack;  // Вершина стека

    // Теперь конструктор увеличивает счётчик для каждого созданного объекта
    public void CharStack(int capacity) {
        stackArray = new char[capacity];
        topOfStack = -1;
        id++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getDepartment() == employee.getDepartment() && getSalary() == employee.getSalary() && Objects.equals(getName(), employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDepartment(), getSalary());
    }
}

