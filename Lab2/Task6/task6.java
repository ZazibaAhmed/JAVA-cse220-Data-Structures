import java.util.Scanner;
public class task6{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the coordinates");
        int x=sc.nextInt();
        int y=sc.nextInt();
        ComplexNumber a=new ComplexNumber(x,y);
        a.increaseValue();
        System.out.println(a);
        System.out.println(a.polarRadius());
    }
}