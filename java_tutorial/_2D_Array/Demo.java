import java.util.Scanner;
public class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three number here for finding greatest of 3 number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a >= b){
            if(a>=c){
                System.out.println("A is greater");
            }else{
                System.out.println("C is greater");
            }
        }else{
            if(b>=c){
                System.out.println("B is greater");
            }else{
                System.out.println("C is greater");
            }
        }

        sc.close();
    }
}