public class bubbleSort{
    public static void main(String []args){
        
        int []a={5,7,3,10,45,33};
        int temp=0;
        for(int count=0;count<a.length-1;count++){
            
            for(int j=0;j<a.length-1;j++){
            if(a[j]<a[j+1]){
            temp=a[j];  
            a[j]=a[j+1];
            a[j+1]=temp;
            }
            }
        }
            
        for(int count=0;count<a.length;count++){
            System.out.println(a[count]);
        }
    }
}
        
            
            
        
    
