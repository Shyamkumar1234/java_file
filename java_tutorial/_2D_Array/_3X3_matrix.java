import java.util.Scanner;

/**
 * _3X3_matrix
 */
public class _3X3_matrix {
    public static void main(String[] args) {
   int[][] arr = new int[3][3];
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the data of 3X3 array");
    for(int i = 0 ; i < 3 ; i++){
        // for(int j = 0 ; j < 3 ; j++){
            for(int k = 0 ; k < 3 ; k++){
                arr[i][k] = sc.nextInt();               
            }
        // }
    }
    for(int i = 0 ; i < 3 ; i++){
        // for(int j = 0 ; j < 3 ; j++){
            for(int k = 0 ; k < 3 ; k++){
              System.out.print(arr[i][k] + " ");
            }
            // System.out.println();
        // }
        System.out.println();
    }
    


    sc.close();
    }
    
}