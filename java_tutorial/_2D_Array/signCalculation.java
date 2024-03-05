import java.util.Scanner;

public class signCalculation {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int[] arr = new int[5];
        int negative_cout = 0;
        int positive_count = 0 ;
        int zero_count = 0;
        for(int i = 0 ; i < 5 ; i++){
            arr[i] = sc.nextInt();
        }
        for(int j = 0 ; j < 5 ; j++){
            if(arr[j] > 0){
                positive_count++;
            }
            else if(arr[j] < 0){
                negative_cout++;
            }
            else{
                zero_count++;
            }
        }
        System.out.println("Number of zeros in Array  =  " + zero_count);
        System.out.println("Number of negative in Array  =  " + negative_cout);
        System.out.println("Number of positive in Array  =  " + positive_count);

        sc.close();
    }
}
