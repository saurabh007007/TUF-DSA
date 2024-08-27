public class Left_Rotate_Array_By_One_place {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Left_Rotate_One(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void Left_Rotate_One(int arr[]){
        int b=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=b;
    }
}
