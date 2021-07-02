public class Student{
  private String name = "Just a Student";  
  private String department = "nothing";
  static int totalStudent = 0;
  protected int getStudentCount(){
    return totalStudent;
  } 
  protected void setDepartment(String dpt){
this.department = dpt;
  }
  protected String getDepartment(){
    return department;
  }
  protected String getName(){
    return name;
  } 
  protected void setName(String n){
    this.name = n;
  }
  public String toString(){
    return "I am BRACU student";
  }
}
