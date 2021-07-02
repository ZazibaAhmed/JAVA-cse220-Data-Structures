import java.util.Scanner;
public class Tester
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    Patient obj=new Patient();
    while(true){
    System.out.println("1: RegisterPatient");
    System.out.println("2: ServePatient");
    System.out.println("3: CancelAll");
    System.out.println("4: CanDoctorGoHome");
    System.out.println("5: ShowAllPatient");
    System.out.println("6: Exit");
    int x=sc.nextInt();
    if(x==1){
    obj.RegisterPatient();
    }
    if(x==2){
    obj.ServePatient();
    }
    if(x==3){
    obj.CancelAll();
    }
    if(x==4){
    System.out.println(obj.CanDoctorGoHome());
    }
    if(x==5){
    obj.ShowAllPatient();
    }
    if(x==6){
      break;
    }
    }
  }
}
    
  
