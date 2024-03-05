import java.util.Scanner;

public class avg_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        int sum = 0 ;
        float avg;
        for(int i = 0 ; i < 20 ; i++){
            arr[i] =  sc.nextInt();           
        }
        for(int j = 0 ; j < 20 ; j++){
            sum += arr[j];
        }
        avg = (float)sum/20;
        System.out.println("The total sum is : " + sum);
        System.out.println("The total average is : " + avg);

        sc.close();
    }
}
