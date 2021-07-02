public class TestStudent{
  public static void printName(Student s){
System.out.println(s.toString());
System.out.println("Number of total students: "+s.getStudentCount());
  }
  public static void main(String [] args){

CSEStudent c = new CSEStudent("abc");
printName(c);   
BBAStudent b = new BBAStudent("def");
printName(b);   
LAWStudent l = new LAWStudent("ghi");
printName(l);
  }
}
