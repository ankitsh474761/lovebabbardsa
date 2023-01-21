import java.util.Arrays;

public class problem6 {
    public static void main(String[] args) {

        //cyclically rotate an array by one

        int arr[] ={1,2,3,4,5};
        int n = arr.length;
        rotate(arr,n);
    }
    static void rotate(int arr[], int n){
       int last = arr[n-1];//store the last element
        //traverse the whole array
        for(int i = n-1; i > 0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
       // System.out.println(Arrays.toString(arr));
    }
}
