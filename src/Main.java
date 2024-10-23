public class Main {
    public static void main(String[] args) {
        Employee roman = new Employee("Роман Евгеньевич Орловский", 1, 59_000);
        Employee petr = new Employee("Петр Александрович Ухалин", 4, 90_000);
        Employee anna = new Employee("Анна Викторовна Брик", 3, 120_000);
        System.out.println(anna.toString());
        System.out.println(roman.toString());
        System.out.println(petr.toString());



    }
}