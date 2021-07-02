public class Task15{
    public static void RemoveOdd(int []a){
        int newLength=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                newLength+=1;
            }
        }
        int []b=new int[newLength];
        int j=0;
        for(int i=0;i<b.length;i++){
            if(a[j]%2==0){
                b[i]=a[j];
            }
            else{
                i--;
            }
            j++;
        }
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
