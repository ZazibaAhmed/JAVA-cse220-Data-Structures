import java.util.Scanner;
public class Patient
{
  Scanner sc=new Scanner(System.in);
  ArrayQueue a=new ArrayQueue();
  static int id=0;
  
  public void RegisterPatient()
  {
    System.out.println("Enter name");
    String n=sc.nextLine();
    id++;
    MyData i=new MyData(n,id);
    try
    {
      a.enqueue(i);
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
  
  public void ServePatient()
  {
    try 
    {
     String s=(((MyData)(a.dequeue())).name);
     System.out.println(s+" is taking service now.");
    }
    catch (Exception e)
    {
      System.out.println(e);
    }
  }
  
  
  public void CancelAll()
  {
    for (int i=0;i<a.size;i++)
    {
      try
    {
      a.dequeue();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
    }
    a.size=0;
  }
  
  
  public boolean CanDoctorGoHome()
  {
    return a.isEmpty();
  }
  
  
  public void ShowAllPatient()
  {
    
    Object [] b=new Object[a.size];
    for(int i=0;i<b.length;i++)
    {
      b[i]=(a.toArray())[i];
    }
    //b=a.toArray();
    Object temp=0;
    for(int count=0;count<b.length-1;count++){
        for(int j=0;j<b.length-1;j++){
            int diff=((((MyData)b[j]).name).compareTo((((MyData)b[j+1]).name)));
            if(diff>0){
               temp=(MyData)b[j];  
               b[j]=b[j+1];
               b[j+1]=temp;
            }
        }
    }
    for(int i=0;i<b.length;i++)
    {
      MyData arr=(MyData)b[i];
      System.out.println(arr.name);
    }
  }
}