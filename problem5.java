import java.util.*;
public class problem5 {
    public static void main(String[] args) {
        //union and intersection
        int a[] = {1,2,3,4,5,6,7,8};
        int b[]={12,23,2,3,4,5,6,7};
        int n = a.length;
        int m = b.length;
        union(a,n,b,m);
    }
    static int union(int a[],int  n,int b[] ,int m){
        HashSet<Integer> set = new HashSet<>();
        for(int i : a){
            set.add(i);
        }
        for (int k : b){
            set.add(k);
        }
        return set.size();

    }
}
