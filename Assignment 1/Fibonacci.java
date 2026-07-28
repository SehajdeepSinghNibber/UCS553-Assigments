import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] arg){
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int first = 0;
        int second = 1;

        for(int i = 1; i<=number;i++){
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
        sc.close();
    }
}
