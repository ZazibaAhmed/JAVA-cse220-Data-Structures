public class Quiz1Task1{
  public static void twin(String n1,String n2){
    char a[]=n1.toCharArray();
    char b[]=n2.toCharArray();
    int sum1=0,sum2=0;
    for(int i=0;i<a.length;i++){
      sum1+=((int)a[i])-48;
    }
    for(int j=0;j<b.length;j++){
      sum2+=((int)b[j])-48;
    }
    if(sum1==sum2){
      System.out.println("TWIN");
    }
    else{
      System.out.println("Not TWIN");
    }
  }
  public static void main(String []args){
    twin("123","51");
    twin("221","222");
  }
}
      
  