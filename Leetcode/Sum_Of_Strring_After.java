public class Sum_Of_Strring_After {
  public static void main(String[] args) {
    String s="zbax";
    int k=2;
    System.out.println(getLucky(s,k));

  }
  
  public static int getLucky(String s, int k) {
        StringBuilder number=new StringBuilder();
        
        for(char a:s.toCharArray()){
            number.append(a-'a'+1);
        }
        while (k>0){
            int temp=0;
            for(char x:number.toString().toCharArray()){
                temp+=x-'0';
            }
            number=new StringBuilder(String.valueOf(temp));
            k--;
        }
        return Integer.parseInt(number.toString());
    }


}
