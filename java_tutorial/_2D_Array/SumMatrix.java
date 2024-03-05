package _2D_Array;
import java.util.Scanner;
public class SumMatrix {
    static void printArray(int[][] arr){
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void SumMatrix1(int[][] a,int r1,int c1,int[][] b,int r2,int c2 ){
        if(r1 != r2 || c1 != c2){
            System.out.println("Invalid number rows and columns ");
            return;
        }

        int[][] sum = new int[r1][c1];
        for(int i = 0 ; i<r1 ; i++){
            for(int j = 0 ; j<c1 ; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
            
        }
        printArray(sum);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = 2,r2=2,c1=3,c2=3;

        int[][] a = new int[r1][c1];
        System.out.println("Enter Elements of forst matrix");
        for(int i = 0 ; i<2 ; i++ ){
            for(int j = 0 ; j<3 ; j++){
                a[i][j] = sc.nextInt();
            }
        }
        
        int[][] b = new int[r2][c2];
        System.out.println("Enter Elements of second matrix");
        for(int i = 0 ; i<2 ; i++ ){
            for(int j = 0 ; j<3 ; j++){
                b[i][j] = sc.nextInt();
            }
        }

        SumMatrix1(a, r1, c1, b, r2, c2);
        

        
        

        sc.close();
    }
}
