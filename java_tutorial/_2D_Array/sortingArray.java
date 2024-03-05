
// import java.util.Arrays;

public class sortingArray {
    public static void main(String[] args) {
        int[] arr = {5,2,7,9,4,6,0};
        // Arrays.sort(arr);
        // for(int i = 0 ; i < 7 ; i++){
        //     System.out.print(arr[i] + " ");
        // }
        for(int i = 0 ; i < 6 ; i++){
            for(int j = i+1 ; j < 7 ; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int k = 0 ; k < 7 ; k++){
            System.out.print(arr[k] + " ");
        }

    }
}
