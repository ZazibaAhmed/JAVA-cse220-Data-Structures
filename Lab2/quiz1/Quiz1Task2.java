public class Quiz1Task2{
  public static void MinDifference(int []a){
     int minDiff=0,value1=a[0],value2=a[1],Diff;
    for(int count=0;count<a.length;count++){
       for(int j=0;j<a.length;j++){
        if((a[count]>=a[j])&&(!(count==j))){
          minDiff=a[count]-a[j];
        }
       }
      for(int i=0;i<a.length;i++){
        if((a[count]>=a[i])&&(!(count==i))){
          Diff=a[count]-a[i];
          if(Diff<=minDiff){
            value1=a[count];
            value2=a[i];
            minDiff=Diff;
          }
        }
        else{
          if((a[count]<a[i])&&(!(count==i))){
            Diff=a[i]-a[count];
             if(Diff<=minDiff){
                value1=a[count];
                value2=a[i];
                minDiff=Diff;
             }
          }
        }
      }
    }
    System.out.println(minDiff+",Difference between "+value1+" and "+value2);
  }
  public static void main(String []args){
    int []a={10,5,1,8,4};
    int []b={6,11,3,0,9};
    MinDifference(a);
    MinDifference(b);
  }
}
           
            
         
            
     
      
        
        
          
        
           
             
          
         

        
    