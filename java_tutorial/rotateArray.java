

public class rotateArray {
    static void printArray(int[] arr){
        System.out.print("The rotated Array is : ");
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static int[] rotate(int[] arr,int k){
        int n = arr.length;
        k = k%n;
        int[] ans = new int[n];
        int j = 0 ;
        for(int i = n-k ; i<n ; i++){
            ans[j++] = arr[i];
        }
        for(int i = 0 ;i<n-k ; i++){
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 3;
        int[] ans = rotate(arr, k);
        printArray(ans);
       


    }
}
