public class sortzero {
    static void printArray(int[] arr){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void swap(int[] arr,int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    static void sortZeroAndOne(int[] arr){
        // int zeroes = 0 ;
        // for(int i = 0 ; i < arr.length ; i++){
        //     if(arr[i] == 0){
        //         zeroes++;
        //     }
        // }
        

        // for(int i = 0 ; i<arr.length ; i++){
        //     if(i<zeroes){
        //         arr[i] = 0;
        //     }else{
        //         arr[i] = 1;
        //     }
        // }
       
        int left = 0,right = arr.length-1;
        while (left<right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }
    }
    public static void main(String[] args) {
        // int[] arr = {0,1,0,1,0,1,0,1,0};
        // sortZeroAndOne(arr);
        // printArray(arr);
        int x = 9,y=12;
        int a = 2,b = 4, c = 6;
        int exp = 4/3*(x+34) + 9*(a+b+c) + (3+y*(2+a))/(a+b*y);
        System.out.println(exp);

    }
}
