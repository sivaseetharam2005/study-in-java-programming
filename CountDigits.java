import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=0;
        System.out.print("enter the numbers:");
        String num=scanner.nextLine();
        int stringLength=num.length();
        for(int i=0;i<stringLength;i++){
            char charDigit = num.charAt(i); 
            count = Character.getNumericValue(charDigit); 
        } 
        System.out.println(count);   
    }
}
