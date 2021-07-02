import java.util.Scanner;
public class Task7{
    public static void ArrayCell(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 10 numbers");
    int a[]=new int[10];
    for(int count=0;count<a.length;count++){
      a[count]=sc.nextInt();
    }
    System.out.println("Enter another number between 0 to 9");
    int c=sc.nextInt();
    for(int i=0; i<a[c] ;i++){
        System.out.print("*");
    }
    }
}
        