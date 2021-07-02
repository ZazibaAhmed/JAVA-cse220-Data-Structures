import java.util.Scanner;
public class task7{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the coordinates");
        int x=sc.nextInt();
        int y=sc.nextInt();
        point p=new point(x,y);
        System.out.println(p.distanceFromOrigin());
    }
}
        