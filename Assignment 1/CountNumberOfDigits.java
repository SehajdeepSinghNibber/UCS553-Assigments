import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");

        long number = sc.nextInt();

        int i = 0;

        long newNumber = number;

        while (newNumber>0) {
            newNumber=newNumber/10;
            i++;
        }

        System.out.println("The number of digits in "+number+" is "+i);

        sc.close();
    }
}
