import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Person1{
    private String name;
    private Date dob;

    public Person1(String name, String dob) throws ParseException {
        this.name = name;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        this.dob = sdf.parse(dob);
    }

    public void displayPersonDetails() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + sdf.format(dob));
    }
}

public class Employee extends Person1 {
    private int empId;
    private double salary;

    public Employee(String name, String dob, int empId, double salary) throws ParseException {
        super(name, dob);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayPersonDetails();
        System.out.println("Employee ID: " + empId);
        System.out.printf("Salary: $%.2f%n", salary);
    }

    public static void main(String[] args) throws ParseException {
        Employee emp = new Employee("Alice", "15-08-1990", 101, 75000);
        emp.displayEmployeeDetails();
    }
}
