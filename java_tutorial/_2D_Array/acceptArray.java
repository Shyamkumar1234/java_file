import java.util.Scanner;

class acceptArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = new char[10];
        for(int i = 0 ; i < 10 ; i++){
            arr[i] = sc.nextLine().charAt(0);
        }

        for(int j = 0 ; j < 10 ; j++){
            System.out.print(arr[j]);
        }

        sc.close();
    }
}
