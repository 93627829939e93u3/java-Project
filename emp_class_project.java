import java.util.Scanner;

public class emp_class_project {

    class employee {
        int id, salary ,totalSalary;
        String name, work;

        void getData(int emp_id, String emp_name,String emp_work, int emp_salary) {
            id = emp_id;
            name = emp_name;
            work = emp_work;
            salary = emp_salary;
        }

        void display() {
          
            System.out.println("Employee ID     : " + id);
            System.out.println("Employee Name   : " + name);
            System.out.println("Employee Work   : " + work);
            System.out.println("Employee Salary : " + salary);
            System.out.println();
        }
        int totalSalary(){
           return totalSalary +=salary;
        }
    }

    public static void main(String[] args) {
        emp_class_project main_emp = new emp_class_project();
        employee[] emp = new employee[100];

        // emp.getData(101, "Jone", 2000);
        // emp.display();

        Scanner input = new Scanner(System.in);

        

        System.out.println("Enter the size of Employee : ");
        int ent = input.nextInt();
        for (int i = 1; i <= ent; i++) {
            System.out.println();
            System.out.println("Employee No : "+i);
            System.out.println("Enter the Employee Name : ");
            String name = input.next();
            System.out.println("Enter the Employee Work : ");
            String work = input.next();
            System.out.println("Enter the Employee Salary : ");
            int salary = input.nextInt();

            emp[i] = main_emp.new employee();
            emp[i].getData(i+100, name, work,salary);
            
        }
        System.out.println();
        System.out.println("Empoyee Ditails : ");
        for (int i = 1; i <= ent; i++) {
            
            emp[i].display();
            
        }
        
        int total = 0;
        for(int i=1; i<=ent; i++){
            total += emp[i].totalSalary();
        }
        System.out.println("Total Salary : "+ total);
    }
}
