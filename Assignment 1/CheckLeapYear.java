import java.util.Scanner;

public class CheckLeapYear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the year: ");

        int Year = sc.nextInt();

        if((Year%400 == 0) || Year%4 == 0 && Year%100 !=0){
            System.out.println(Year+" is a leap Year");
        }
        else{
            System.out.println(Year+ " is not a leap Year");
        }

        sc.close();
    }
}