import java.util.Scanner;
public class Task5{
  
  public static void CountNumbers(int []a){
    int b[]=new int[10];
    for(int i=0;i<a.length;i++){
     int x=a[i];
     b[x]=b[x]+1;
    }
    for(int j=0;j<b.length;j++){
    System.out.println(j+" was found "+b[j]+" times.");
    }
}
}

      
    