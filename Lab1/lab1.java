import java.util.Scanner;
public class lab1{
  public static void Array(int []x,int y){
      for(int i=0;i<x.length;i++){
          System.out.println(x[i]);
      }
  }
    
  public static void main(String []args){
    
    int b[]={1,2,6};
    int c[]={6, 1, 2, 3};
    int d[]={13, 6, 1, 2, 3};
    System.out.println(Task1.firstLast6(b));
    System.out.println(Task1.firstLast6(c));
    System.out.println(Task1.firstLast6(d));
     
     int []a={10,2,3,4,5,6,7,8,9,1};
     Task2.MaxMinSwap(a);
     
     int []num3={7, 13, 2, 10, 6};
     Task3.HighToLow(num3);
    
    Task4.UniqueNumber();
     
    int []num5={1,1,2,5,6,8,7,2,4,6,9,4,2,5,6};
    Task5.CountNumbers(num5);
     
    int []num6={4 ,3 ,2 ,4};
    Task6.Palindrome(num6);
    
    Task7.ArrayCell();
      
    Task8.Matrix();
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 10 numbers");
    int array[]=new int[10];
    for(int count=0;count<array.length;count++){
      array[count]=sc.nextInt();
    }
    Array(a,10);
    Task9.SquareArray(a,10);
    
    Task10.Seasons(3,17);
                                         
    Task11.allDigitsOdd("135319");
    Task11.allDigitsOdd("9145293");
    
    Task12.Dates(10,8,10,23);
    
    int []x={21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
    Task13.RemoveOdd(x);
    
  }
}

