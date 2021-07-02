public class Task9{
    
    public static void LeftRotate(int []a,int n){
        for(int i=n;i<a.length;i++){
            System.out.print(a[i]+",");
        }
        for(int j=0;j<n;j++){
            System.out.print(a[j]+",");
        }
        System.out.println();
    }
    public static void RightRotate(int []a,int n){
        for(int i=(a.length-n);i<a.length;i++){
            System.out.print(a[i]+",");
        }
        for(int j=0;j<(a.length-n);j++){
            System.out.print(a[j]+",");
        }
        System.out.println();
    }
    public static void main(String []args){
        int []a={1,4,8,16,25,36,49,64,81,100};
        LeftRotate(a,4);
        RightRotate(a,4);
    }
}
        
    