/**
 * @author fazliberkordek  22 Mart 2023
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, select;
        System.out.print("Please type the first value : ");
        n1 = input.nextInt();

        System.out.print("Please type the second value : ");
        n2 = input.nextInt();

        System.out.println("Please select:..\n1-Sum\n2-Subst\n3-Multply\n4-Dividie ");
        System.out.print("Your choice : ");

        select = input.nextInt();
/* If-else solution:
        if (select == 1) {
            System.out.println("Sum is : " + (n1 + n2));
        } else if (select == 2) {
            System.out.println("Substrac is : " + (n1 - n2));
        } else if (select == 3) {
            System.out.println("Multiply :"+(n1*n2));
        } else if (select == 4) {
            if (n2 !=0){

                System.out.println("Divide:"+(n1/n2));
            }else {
                System.out.println("Number cannot be divided to 0");
            }
        }else {
            System.out.println("Wrong input!!...\n Please re run the app");
        }

*/
        switch (select) {
            case 1:
                System.out.println("Sum is : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Substrac is : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Multiply :" + (n1 * n2));
                break;
            case 4:
                switch (n2) {
                    case 0:
                        System.out.println("The number cannot be divided to zero");
                        break;
                    default:
                        System.out.println("Divided: " + (n1 / n2));
                        break;
                }
                break;
            default: {
                System.out.println("Wrong selection...");
            }
        }
    }
}