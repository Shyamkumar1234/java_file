

public class smallest {
    public static void main(String[] args) {
       
        int[] arr = {90,20,30,40,50,60};
        int min = arr[0];
        for(int i = 0 ; i < 6 ; i++){
            if(arr[i] < min ){
                min = arr[i];
            }
        }
        System.out.println("The smallest is : " + min);
    }
}
