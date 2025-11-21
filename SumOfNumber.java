import java.util.Scanner;

public class SumOfNumber{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=scanner.nextInt();
        int sum=0;
        sum=(num*(num+1))/2;
        System.out.println("sum of "+num+" is "+sum);
    }    
}
