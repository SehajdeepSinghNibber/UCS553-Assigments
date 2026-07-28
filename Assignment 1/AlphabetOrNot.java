import java.util.Scanner;

public class AlphabetOrNot {
    public static void main(String[] arg){
        System.out.print("Please enter a letter ");
        Scanner sc = new Scanner(System.in);
        char isAlpha = sc.next().charAt(0);

        if (isAlpha>= 'a' && isAlpha<='z' || isAlpha>= 'A' && isAlpha <= 'Z'){
            System.out.println(isAlpha+ " is an Alphabet");
        }
        else{
            System.out.println(isAlpha+ " is not an Alphabet");
        }

    }    
}
