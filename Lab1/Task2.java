public class Task2{
  
  public static void MaxMinSwap(int []a){
   int max=a[0];
   int maxposition=0;
    for(int j=0;j<a.length;j++){
      
      if(a[j]>a[0]){
        max=a[j];
        maxposition=j;
      }
    }
    int min=a[0];
    int minposition=0;
    for(int k=0;k<a.length;k++){
      
      if(a[k]<a[0]){
        min=a[k];
        minposition=k;
      }
    }
    a[maxposition]=min;
    a[minposition]=max;
    for(int l=0;l<a.length;l++){
      System.out.println(a[l]);
    }
  }
}
        
    
    
    