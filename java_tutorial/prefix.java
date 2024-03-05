public class prefix {
    static void printArray(int[] arr){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static int[] makePrefixSum(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for(int i = 1 ; i<n ; i++){
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] ans = makePrefixSum(arr);
        printArray(ans);
    }
}
