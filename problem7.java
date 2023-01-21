public class problem7 {
    public static void main(String[] args) {
        //KADANES ALGORITHM
        //MAXIMUM SUM OF SUBARRAY

        int arr[]={1,2,3,-2,5};
        int n = arr.length;
        System.out.println( maxSum(arr,n));
    }
    static int maxSum(int arr[],int n){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i ++){
            sum = sum + arr[i];
            if(sum > max){
                max = sum;
            }
            //we don't want the negative sum it will only harm our result so whenever the sum of subarray becomes negative
            //we will make the sum zero
            if(sum < 0){
                sum = 0;
            }
        }
        return  max;
    }
}
