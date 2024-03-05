
public class Main {
       static void printArray(int[] arr){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
       }
       static void swapInArray(int[] arr,int i,int j){
        int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
       }
       static void reverseArray(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while (i<j) {
            swapInArray(arr,i,j);
            i++;
            j--;
        }

       }
    public static void main(String[] args) {
         int arr[] = {1,4,2,5,2,3,5,2,4};
         reverseArray(arr);
         printArray(arr);

       
        
    }
}