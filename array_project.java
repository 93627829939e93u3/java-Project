/*

step 1: Enter the arrays elements
step 2: ENter the arrays
step 3: Print The arrays
step 4: Update the arrays
step 5: Delete the array element
step 6: Delete all array element

*/

import java.util.Scanner;

public class array_project {

 
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int loop = 1;
        int size = 0;
        int[] arr = null;
        while (loop <= 5) {
            System.out.println();
            System.out.println("\nEnter 1 for Create a Array");
            System.out.println("Enter 2 for Update the Array");
            System.out.println("Enter 3 for delete the Array element");
            System.out.println(loop+". Enter Your Choice");
            int ent = input.nextInt();

            int update = 0;
            int del = 0;

            if (ent == 1) {
                System.out.println("\nEnter the size of Array");
                size = input.nextInt();
                arr = new int[size];
                for (int i = 0; i < size; i++) {
        
                    System.out.printf("\nEnter the %d element of array: ", i + 1);
                    arr[i] = input.nextInt();
                }
                System.out.print("Array: ");
                for (int element : arr) {
                    System.out.print(element + " ");
                }
            } else if (ent == 2) {
                System.out.println("\nEnter index Number to Update element of Array: ");
                update = input.nextInt();
                System.out.println("Enter updated array");
                arr[update - 1] = input.nextInt();
                System.out.print("Array: ");
                for (int element : arr) {
                    System.out.print(element + " ");
                }
            } else if (ent == 3) {
                System.out.println("\n Enter Index Number to delete elemet of Array: ");
                del = input.nextInt();
                arr[del - 1] = 0;
                System.out.print("Array: ");
                for (int element : arr) {
                    System.out.print(element + " ");
                }
            }
            else{
                System.out.println("Enter a valid Choice");
            }
            loop++;
        }
        

    }

}
