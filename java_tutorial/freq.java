
import java.util.*;
public class freq {
    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100005];
        for(int i = 0 ; i < arr.length ; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,32,14,65,76,80};
        System.out.println("Enter number of queries : ");
        int q = sc.nextInt();

        int[] freq = makeFrequencyArray(arr);
        
        while (q>0) {
            System.out.println("Enter your number to be searched : ");
            int x  = sc.nextInt();
            if (freq[x] >0) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

            q--;
        }


        sc.close();
    }
}
