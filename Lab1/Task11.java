public class Task11{
    public static void allDigitsOdd(String x){
        boolean v=false;
        for(int i=0;i<x.length();i++){
            char ch=x.charAt(i);
            int code=(int)ch-48;
            if(!(code%2==0)){
                v=true;
            }
            else{
                v=false;
                break;
            }
        }
        System.out.println(v);
    }
}
                
        
    
    