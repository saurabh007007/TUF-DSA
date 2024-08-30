import java.util.*;

public class Rotated_Array_D {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int d=3;
        D_Rotation(null, d);
        System.out.println(arr);
    }
    public static void D_Rotation(int arr[],int d){
        d=d%arr.length;
        if(d==0) return;
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<d;i++){
            temp.add(arr[i]);
        }
        
        for(int i=d;i<arr.length;i++){
            arr[i-d]=arr[i];

        }
        for(int i=0;i<d;i++){
            arr[arr.length-d+i]=temp.get(i);
        }
    }
}

// leet code solution

// class Solution {
//     public void rotate(int[] num, int k) {
//         k=k%num.length;
//         reverse(num,0,num.length-1);
//         reverse(num,0,k-1);
//         reverse(num,k,num.length-1);
//     }
//     public void reverse(int num[],int start,int end){
//         while(start<end){
//             int temp=num[start];
//             num[start]=num[end];
//             num[end]=temp;
//             start++;
//             end--;
//         }
//     }
}
