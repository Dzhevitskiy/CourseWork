import java.util.Random;

public class Main {

    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        setEmployees();
        printAllEmployees();
        System.out.println("Сумма зарплат " + sumSalary());
        findMinSalary();
        findMaxSalary();
        findAverageSalary();
        FIO();
    }

    private static void setEmployees(){
        employees[0] = new Employee(0, "Иванов", "Дмитрий", "Константинович", 1,58750);
        employees[1] = new Employee(1, "Петрова", "Мария", "Александровна", 2,87401);
        employees[2] = new Employee(2, "Захаров", "Александр", "Петрович", 2,90420);
        employees[3] = new Employee(3, "Никулин", "Петр", "Афанасьевич", 4,65789);
        employees[4] = new Employee(4, "Котов", "Никита", "Александрович", 3,75890);
        employees[5] = new Employee(5, "Черемисин", "Иван", "Юрьевич", 1,94021);
        employees[6] = new Employee(6, "Кудряшов", "Глеб", "Владиславович", 5,201943);
        employees[7] = new Employee(1, "Захарова", "Юлия", "Петровна", 4,114678);
        employees[8] = new Employee(1, "Таскина", "Александра", "Михайловна", 3,78490);
        employees[9] = new Employee(1, "Кучин", "Максим", "Александрович", 1,87930);
    }

        private static void printAllEmployees() {
        for(Employee employee : employees) {
            System.out.println(employee);
        }
    }
    private static int sumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
    private static void findMinSalary() {
        Employee empWithMinSalary = null;
        for (Employee employee : employees) {
            if (empWithMinSalary == null || employee.getSalary() < empWithMinSalary.getSalary()) {
                empWithMinSalary = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой " +  empWithMinSalary);
    }
    private static void findMaxSalary() {
        Employee empWithMaxSalary = null;
        for (Employee employee : employees) {
            if (empWithMaxSalary == null || employee.getSalary() > empWithMaxSalary.getSalary()) {
                empWithMaxSalary = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой " +  empWithMaxSalary);
    }
    private static void findAverageSalary() {
        var sum = sumSalary();
        var average = sum / employees.length;
        System.out.println("Средняя зарплата сотрудника составляет " +  average);
    }
    private static void FIO() {
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + " " +  employee.getMiddleName() + " " + employee.getLastName());
        }
    }
}