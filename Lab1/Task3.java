public class Task3{
  public static void HighToLow(int []a){
    for(int count=0;count<a.length;count++){
    int max=a[count];
    int maxposition=count;
    int index=count+1;
    for(int j=index;j<a.length;j++){
      
      if(a[j]>max){
        max=a[j];
        maxposition=j;
      }
    }
      a[maxposition]=a[count];
      a[count]=max;
    
    }
    for(int l=0;l<a.length;l++){
      System.out.print(a[l]+",");
    }
    for(int l=0;l<a.length;l++){
      if(a[l]%2==0){
      System.out.print(a[l]+",");
    }
    }
    
  }
}
    
  


  