import java.util.Scanner;

public class Factorial {
    public static void main(String[] arg){
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int Fact = sc.nextInt();

        int a = 1;

        for(int i = Fact; i>0; i--){
            a = a*i;
        }

        System.err.println("The Factorial is "+a);

        sc.close();

    }
}
