import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.print number 1-10");
        System.out.println("2.print number 10-1");
        System.out.println("3.print odd numbers in 1-50");
        System.out.println("4.print even numbers in 1-50");
        System.out.println("5.print your name 5 times");
        System.out.println("Enter your choice:");
        int choice=scanner.nextInt();
        switch (choice) {
            case 1:
                for(int i=1;i<=10;i++)
                {
                    System.out.println(i);
                }
                break;
            case 2:
                for(int i=10;i>0;i++)
                {
                    System.out.println(i);
                }
                break;
            case 3:
                for(int i=1;i<=50;i++)
                {
                    if(i%2!=0){
                    System.out.println(i);
                    }
                }
                break;
            case 4:
                for(int i=1;i<=50;i++)
                {
                    if(i%2==0){
                    System.out.println(i);
                    }
                }
            case 5:
                System.out.println("Enter your name:");
                String name=scanner.next();
                for(int i=1;i<6;i++){
                    System.out.println(name);
                }
                break;                
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
    
}
