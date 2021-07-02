public class quiz3{
  public static boolean Palindrome(char []a){
    boolean p=false;
    if(a.length%2==0){
      int l=(a.length/2);
      for(int i=0;i<l;i++){
        if(a[i]==a[a.length-1-i]){
          p=true;
        }
        else{
          p=false;
          break;
        }
      }
      return p;
    }
    else{
      int l=((a.length-1)/2);
      for(int i=0;i<l;i++){
        if(a[i]==(a[a.length-1-i])){
          p=true;
        }
        else{
          p=false;
          break;
        }
      }
      return p;
    }
  }
  public static char[] rotateLeft(char []source){
    int k=1;
    char temp[] = new char[k];
    temp[0]=source[0];
    for (int i = 0; i < source.length-1; i++)
    {
     source[i] = source[i+k];
    }
    source[source.length-1]=temp[0];
    return source;
  }
  public static int check(char []source){
    int k=1;
    
    for(int i=0;i<k;i++){
      rotateLeft(source);
    if(Palindrome(source)){
      break;
      
    }
    else{
      k++;
    }
    }
    return k;
  }
   
  
  public static void main(String []args){
    char []a={'a','b','c','b','a'};
    System.out.println(Palindrome(a));
    //System.out.println(rotateLeft(a));
    System.out.println(check(a));
    /*char []b={'1','2','3','3','2','1'};
    System.out.println(Palindrome(b));
    System.out.println(check(b));*/
    
    
  }
}
    
    
    
    
    
    
    
    
    
    
    