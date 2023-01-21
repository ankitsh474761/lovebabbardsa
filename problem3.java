import java.util.Arrays;

public class problem3 {
    public static void main(String[] args) {
        //kth smallest element
        int arr[]={7,10,4,20,15};
        int l = 0 ,r = arr.length-1;
        int k = 2;
        System.out.println( kthsmallest(arr,l,r,k));
    }
    static int kthsmallest(int arr[],int l , int r , int k){

        // for sorting
        for(int i = 0 ; i < arr.length-1;i++){
            for (int j = i+1; j < arr.length ;j++) {
                if (arr[i] > arr[j]) {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("adf "+Arrays.toString(arr));//[4, 7, 10, 15, 20]
        Arrays.sort(arr);
        int result = arr[k-1];
        System.out.println(Arrays.toString(arr));
        return result;
    }
}
