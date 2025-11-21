import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        int num,digit,reversedNo=0;
        Scanner scanner=new Scanner(System.in);
        num = scanner.nextInt();
        while (num!=0) {
            digit=num%10;
            reversedNo=reversedNo*10+digit;
            num=num/10;
        }
        System.out.println("REversed Nmder is "+reversedNo);
    }
    
}
