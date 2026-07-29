import java.util.Scanner;

public class LCM2Numbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        int smaller;

        if (a>b){
            smaller = b;
        }

        else{
            smaller = a;
        }

        int gcd = 1;

        for(int i = smaller; i>0; i--){
            if (a%i ==0 && b%i == 0){
                gcd = i;
                break;
            }
        }


        int LCM = (a*b)/gcd;

        System.out.println("The LCM of "+a+" and "+b+" is "+LCM);

        sc.close();
    }

}