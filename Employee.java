/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assesment;

/**
 *
 * @author ASUS
 */
public class Employee {

    private String name;
    private int age;
    private double salary;

    //constructor with no parameters
    public Employee() {
        this.name = "";
        this.age = 0;
        this.salary = 0.00;
    }

    //constructor with 3 parameters

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getsalary() {
        return salary;
    }

    public static void main(String[] args) {

        //create five Employee objects using the parameterized constructor
        Employee p1 = new Employee("dihu", 22, 4500.00);
        Employee p2 = new Employee("kavee", 21, 5000.00);
        Employee p3 = new Employee("nadu", 20, 6500.00);
        Employee p4 = new Employee("wasana", 22, 4000.00);
        Employee p5 = new Employee("yuwi", 24, 8500.00);

        //display the formatted the output
        System.out.println("salary for the month of july : ");
        System.out.println("===============================================");
        System.out.println("Employee Name\t\t Age\t\t Salary");
        System.out.println("===============================================");

        System.out.println(p1.name + "\t\t\t" + p1.age + "\t\t" + p1.salary);
        System.out.println(p2.name + "\t\t\t" + p2.age + "\t\t" + p2.salary);
        System.out.println(p3.name + "\t\t\t" + p3.age + "\t\t" + p3.salary);
        System.out.println(p4.name + "\t\t\t" + p4.age + "\t\t" + p4.salary);
        System.out.println(p5.name + "\t\t\t" + p5.age + "\t\t" + p5.salary);
        System.out.println();
        
        double totalsalary=(p1.salary+p2.salary+p3.salary+p4.salary+p5.salary);
        System.out.printf("Total\t\t\t\t\t %.2f\n",totalsalary);

    }

}
