import java.util.Scanner;
public class Task8{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the coeffecients");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        QuadEqn q=new QuadEqn(a,b,c);
        System.out.println(q);
        System.out.println(q.firstRoot());
    }
}