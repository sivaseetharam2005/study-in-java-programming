import java.util.Scanner;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=scanner.nextInt();
        int sum=0;
        for(int i=0;i<num+1;i++){
            if(i%2==0){
            sum+=i;
        }}
        System.out.println("sum of "+num+" is "+sum);
    }
    
}
