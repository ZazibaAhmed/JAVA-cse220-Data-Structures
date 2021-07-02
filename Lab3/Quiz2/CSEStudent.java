public class CSEStudent extends Student{
  public CSEStudent(String x){
    super.setName(x);
    super.setDepartment("CSE");
    totalStudent+=1; 
  }
  public String toString(){
    System.out.println(super.toString());
    return "name: "+getName()+" Department: "+getDepartment();
  }
    
}