import java.util.Scanner;
public class Task8{
    public static void Matrix(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter dimensions");
        int x=sc.nextInt();
        int a[]=new int[x];
        int b[]=new int[x];
        int c[]=new int[x];
        System.out.println("For A");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("For B");
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<c.length;i++){
            c[i]=5*a[i]-b[i];
        }
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+"  ");
        }
        
    }
}

        
        
        
        
        
        
        
        
        
        
            
        
    