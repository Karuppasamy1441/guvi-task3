import java.util.*;
class Employee implements Taxable {
    int emlId;
    String name;
    double salary;

    public Employee(int emlId, String name, double salary) {
        this.emlId = emlId;
        this.name = name;
        this.salary = salary;
    }
    public void calculateTax() {
        double incomeTax = salary * INCOME_TAX;
        System.out.println("Income Tax : " + incomeTax);
    }
}

class Product implements Taxable {
    int pid;
    double price;
    int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public void calculateTax() {
        double salesTax = price * SALES_TAX;
        System.out.println("Sales Tax : " + salesTax);
    }
}

public class DriverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee ID : ");
        int emlId = scanner.nextInt();
        System.out.print("Enter employee name : ");
        String name = scanner.next();
        System.out.print("Enter  salary : ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(emlId, name, salary);
        employee.calculateTax();

        System.out.print("Enter product ID : ");
        int pID = scanner.nextInt();
        System.out.print("Enter product price : ");
        double price = scanner.nextDouble();
        System.out.print("Enter product quantity : ");
        int quantity = scanner.nextInt();

        Product product = new Product(pID, price, quantity);
        product.calculateTax();
    }
}

