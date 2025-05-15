
import java.util.Scanner;
public class examMark_calculator {
    public static void main(String[] args) {
        System.out.println("Calculate the Exam Marks");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the Subject 1");
        int Subject1 = input.nextInt();

        System.out.println("Enter the Subject 2");
        int Subject2 = input.nextInt();

        System.out.println("Enter the Subject 3");
        int Subject3 = input.nextInt();

        System.out.println("Enter the Subject 4");
        int Subject4 = input.nextInt();

        System.out.println("Enter the Subject 5");
        int Subject5 = input.nextInt();

        

        float totalMarks=Subject1+Subject2+Subject3+Subject4+Subject5;
        System.out.println("The Total Marks is : "+totalMarks);
        float result=totalMarks/5;
        System.out.println("The Result is : "+result+" %");
        
    }
}
