public class LAWStudent extends Student{
  public LAWStudent(String x){
    super.setName(x);
    super.setDepartment("LAW");
    totalStudent+=1; 
  }
  public String toString(){
    System.out.println(super.toString());
    return "name: "+getName()+" Department: "+getDepartment();
  }
    
}
