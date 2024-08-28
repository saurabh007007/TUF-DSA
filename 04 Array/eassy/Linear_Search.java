public class Linear_Search {
    public static void main(String[] args) {
        int arr[]={1,23,4,6575,8,97,98,45};
        int k=1;
        System.out.println(Linear_Search_No(arr, k));
    }
    public static int Linear_Search_No(int arr[],int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return 1;
            }
        }
        return -1;
    }
}
