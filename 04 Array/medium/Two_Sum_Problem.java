// package TUF DSA.04 Array.medium;

public class Two_Sum_Problem {
    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        int target=14;
        System.out.println(Two_Sum(arr, target));
    }
    public static String Two_Sum(int arr[],int target){
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j) continue;
                if (arr[i]+arr[j]==target) {
                    
                    return "YES";
                }
            }
            
            
        }
        return "No";
    }
}
