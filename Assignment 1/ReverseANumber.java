import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nuber you want to reverse: ");
        int number = sc.nextInt();
        
        String str = String.valueOf(number);

        String str2 = "";

        for(int i = str.length()-1; i>=0;i--)
            str2+=str.charAt(i);
        int reversedNumber = Integer.parseInt(str2);


        System.out.println("The reversed number is "+reversedNumber);

        sc.close();
    }

}
