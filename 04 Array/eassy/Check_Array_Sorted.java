public class Check_Array_Sorted {
    public static void main(String[] args) {
        int arr[]={10,1,13,15};
        System.out.println(Chcek_Arr(arr));
    }
    public static boolean Chcek_Arr(int arr[]){
        // int count=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
