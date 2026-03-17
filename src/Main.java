/**
 * Main — demonstrate your Employee Management System.
 *
 * YOUR TASKS:
 *   Part C — Create Manager and Intern objects, demonstrate polymorphism
 *   Part D — Add try/catch blocks for exception handling
 *
 * This file should compile and run, printing output that proves
 * all your code works correctly.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=== PART A: Salary Utilities ===");
//        SalaryUtils.calculateAnnualSalary(-100);
        System.out.println(SalaryUtils.calculateAnnualSalary(100));

//        System.out.println(SalaryUtils.calculateTax(-9000));
        System.out.println(SalaryUtils.calculateTax(9000));
        System.out.println(SalaryUtils.calculateTax(15000));
        System.out.println(SalaryUtils.calculateTax(40000));

//        System.out.println(SalaryUtils.calculateNetSalary(-40000));
        System.out.println(SalaryUtils.calculateNetSalary(40000));

//        System.out.println(SalaryUtils.applyRaise(-40000, 20));
        //System.out.println(SalaryUtils.applyRaise(40000, -30));
//        System.out.println(SalaryUtils.applyRaise(40000, 150));
       System.out.println(SalaryUtils.applyRaise(40000, 30));


        System.out.println("\n=== PART B: Employee Manager ===");
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(new Employee(1, "Noor", "Design", 3300));
        employeeManager.addEmployee(new Employee(2, "Fatima", "Human Resourses", 1000));
        employeeManager.addEmployee(new Employee(3, "Ali", "Testing", 5000));
        employeeManager.addEmployee(new Employee(4, "Khaled", "Programming", 4000));
        employeeManager.addEmployee(new Employee(5, "Musa", "Testing", 2000));
        employeeManager.addEmployee(new Employee(6, "Hassan", "Design", 3300));

        System.out.println(employeeManager.findById(2));
        System.out.println(employeeManager.findById(10));

        System.out.println(employeeManager.getEmployeesByDepartment("Testing"));


        System.out.println("\n=== PART C: Inheritance & Polymorphism ===");
        // TODO: Create at least 1 Manager and 1 Intern
        Employee e1 =  new Employee(7, "Noor", "Design", 3300);
        Manager m1 =  new Manager(8, "Fatima", "Human Resourses", 1000,10);
        Intern i1 = new Intern(9, "Aysha", "Design", 3300,"UOB");
        // TODO: Add all employees (Employee, Manager, Intern) to the manager
        employeeManager.addEmployee(e1);
        employeeManager.addEmployee(m1);
        employeeManager.addEmployee(i1);
        // TODO: Loop through getAllEmployees() and call getBonus() on each
        //       Print: "<name> bonus: <amount>" for each one
        //       This demonstrates polymorphism — same method call, different behavior
        for (Employee e : employeeManager.getAllEmployees()) {
            System.out.println(e.getName() + " bonus: " + e.getBonus());
        }


        System.out.println("\n=== PART D: Exception Handling ===");
        // TODO: Use try/catch to demonstrate:
        //   1. Trying to remove an employee that doesn't exist
        //   2. Trying to promote an employee that's already a Manager
        //   3. Trying to create an Employee with invalid data (negative salary)
        // Each try/catch should print the error message gracefully



    }
}
