public class BBAStudent extends Student{
  public BBAStudent(String x){
    setName(x);
    super.setDepartment("BBA");
    totalStudent+=1; 
  }
  public String toString(){
    System.out.println(super.toString());
    return "name: "+getName()+" Department: "+getDepartment();
  }
    
}
