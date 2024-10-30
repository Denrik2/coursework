import java.util.Arrays;

public class Main {
    public static void listOfAllEmployees(Employee[] listOfEmployees) {
        for (int i = 0; i < Employee.counter; i++) {
            System.out.println(listOfEmployees[i].toString());
        }
    }

    public static void amountOfExpenses(Employee[] listOfEmployees) {
        int sum = 0;
        for (int i = 0; i < Employee.counter; i++) {
            sum = sum + listOfEmployees[i].getSalary();
        }
        System.out.println("Сумма затрат на ЗП в месяц = " + sum + "р");
    }

    public static void minWage(Employee[] listOfEmployees) {
        int sum = 1000000000;
        for (int i = 0; i < Employee.counter; i++) {
            if (listOfEmployees[i].salary < sum) {
                sum = listOfEmployees[i].salary;
            }
        }
        for (int i = 0; i < Employee.counter; i++) {
            if (listOfEmployees[i].salary == sum) {
                System.out.println("У Сотрудника - " + listOfEmployees[i].getName() + " минимальная зп. - " + sum);
            }

        }
    }

    public static void maxWage(Employee[] listOfEmployees) {
        int sum = 0;
        for (int i = 0; i < Employee.counter; i++) {
            if (listOfEmployees[i].salary > sum) {
                sum = listOfEmployees[i].salary;
            }
        }
        for (int i = 0; i < Employee.counter; i++) {
            if (listOfEmployees[i].salary == sum) {
                System.out.println("У Сотрудника - " + listOfEmployees[i].getName() + " максимальная зп. - " + sum);
            }

        }
    }

    public static void averageSalary(Employee[] listOfEmployees) {
        int sum = 0;
        for (int i = 0; i < Employee.counter; i++) {
            sum = sum + listOfEmployees[i].getSalary();
        }
        System.out.println("Средняя зп. сотрудников = " + sum / Employee.counter);

    }

    public static void main(String[] args) {
        Employee[] listOfEmployees = new Employee[10];
        Employee roman = new Employee("Роман Евгеньевич Орловский", 1, 59_000);
        Employee petr = new Employee("Петр Александрович Ухалин", 4, 90_000);
        Employee anna = new Employee("Анна Викторовна Брик", 3, 120_000);
        Employee denis = new Employee("Денис Игоревич Волохов", 5, 70_000);
        listOfEmployees[roman.getId()] = roman;
        listOfEmployees[petr.getId()] = petr;
        listOfEmployees[anna.getId()] = anna;
        listOfEmployees[denis.getId()] = denis;

        listOfAllEmployees(listOfEmployees);
        amountOfExpenses(listOfEmployees);
        minWage(listOfEmployees);
        maxWage(listOfEmployees);
        averageSalary(listOfEmployees);
    }


}