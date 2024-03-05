
public class decending_order {
    public static void main(String[] args) {
        int[] arr = {5,2,7,9,4,6,0};

        for(int i = 0 ; i < 6 ; i++){
            for(int j = i+1 ; j < 7 ; j++){
                if(arr[i] < arr[j]){
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