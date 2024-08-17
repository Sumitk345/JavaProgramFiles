import java.util.Scanner;

class Employee {
    Scanner s1 = new Scanner(System.in);
    int id;
    double Salary;

    public void AddEmployee() {

        System.out.println("Enter ID");
        id = s1.nextInt();

        System.out.println("Enter Salary");
        Salary = s1.nextInt();
    }

    public double calculateSalary() {
        double DA = 15 * Salary / Salary;
        double HRA = 16 * Salary / Salary;
        double CCA = 21 * Salary / Salary;

        Salary = DA + HRA + CCA + Salary;
        return Salary;
    }

    public String toString() {
        return "ID :" + id + " Salary  :" + Salary;
    }

}

public class Q9 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int choice = 0;
        int counter = 1;
        System.out.println("1. Add Employee");
        System.out.println("2. Calculate Gross Salary ");
        System.out.println("3. Display Details");
        Employee Emp[] = new Employee[2];
        while (choice != 4) {
            System.out.print("\nEnter choice : ");
            choice = s1.nextInt();
            if (choice == 1) {
                Emp[counter - 1] = new Employee();
                // System.out.println(counter);
                Emp[counter - 1].AddEmployee();
                counter++;
            } else if (choice == 2) {
                System.out.println("Gross Salary Of Employee\n");
                for (int i = 0; i < Emp.length; i++) {
                    System.out.println("ID :" + Emp[i].id + " Gross Salary :" + Emp[i].calculateSalary());
                }
            } else if (choice == 3) {
                System.out.println("Enter Employee ID :");
                int id = s1.nextInt(); // 104

                int position = -1;
                for (int i = 0; i < Emp.length; i++) {
                    if (id == Emp[i].id) {
                        position = i;
                    }
                }

                if (position == -1) {
                    System.out.println("Employee ID not exist!");
                } else {
                    System.out.println(Emp[position]);
                }

            } else if (choice == 4) {
                System.out.println("Code Exits");
            }

        }

    }
}
