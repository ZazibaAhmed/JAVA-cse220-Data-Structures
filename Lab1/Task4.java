import java.util.Scanner;
public class Task4{
  
  public static void UniqueNumber(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 10 numbers");
    int a[]=new int[10];
    for(int count=0;count<a.length;count++){
      a[count]=sc.nextInt();
      for(int i=0;i<count;i++){
        if(a[count]==a[i]){
          System.out.println("Number not unique,enter again");
          a[count]=sc.nextInt();
        }
      }
    }
  }
}
          
        
      
      