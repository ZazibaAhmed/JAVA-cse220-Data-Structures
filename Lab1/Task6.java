public class Task6{
  
  public static void Palindrome(int []a){
    boolean m=false;;
    if(a.length%2==0){
      int y=a.length/2;
      for(int i=0;i<=y;i++){
        if(a[i]==a[a.length-1-i]){
          m=true;
        }
       else{
         m=false;
         break;
        }
    }
    }
    else{
      int x=(a.length-1)/2;
        for(int i=0;i<=x;i++){
        if(a[i]==a[a.length-1-i]){
          m=true;
        }
        else{
          m=false;
          break;
        }
      }
    }
    if(m==true){
      System.out.println("Palindrome");
    }
    else{
      System.out.println("Not a palindrome");
    }
  }
}

    
  


       
      