package _2D_Array;

import java.util.Scanner;

public class Multiply {
    static void printArray(int[][] arr){
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void MultiplyMatrix(int[][] a,int r1,int c1,int[][] b,int r2,int c2 ){
        if(c1 != r2){
            System.out.println("Multiplication not possible ");
            return;
        }
        int[][] mul = new int[r1][c2];

        for(int i = 0 ; i<r1 ; i++){
            for(int j = 0 ; j<c2 ; j++){
               for(int k = 0 ; k <c1 ; k++){
                mul[i][j] = a[i][k]*b[k][j];
               }
            }
        }
        printArray(mul);

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
        for(int i = 0 ; i<3 ; i++ ){
            for(int j = 0 ; j<2 ; j++){
                b[i][j] = sc.nextInt();
            }
        }

        MultiplyMatrix(a, r1, c1, b, r2, c2);



        sc.close();
    }
    
}
