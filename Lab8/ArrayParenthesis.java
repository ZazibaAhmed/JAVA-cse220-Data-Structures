import java.util.Scanner;
public class ArrayParenthesis
{
  public static void main(String [] args) throws Exception
  {
    Scanner sc=new Scanner(System.in);
    String sr=sc.nextLine();
    char popChar=' ';
    int popNum=0;
    int c=0;
    int i=0;
    ArrayStack parenthesesStack = new ArrayStack(); 
    ArrayStack positionStack = new ArrayStack();
    char ch[]=sr.toCharArray();
    try
    {
      for(i=0;i<ch.length;i++)
      {
        if(ch[i]=='(' || ch[i]=='{' || ch[i]=='[')
        {
          parenthesesStack.push(ch[i]);
          positionStack.push(i+1);
        }
        else if(ch[i]==')' || ch[i]=='}' || ch[i]==']')
        {
          popChar=(char)parenthesesStack.pop();
          popNum=(int)positionStack.pop();
          if(!(ch[i]==')'&&popChar=='(' || ch[i]=='}'&&popChar=='{' ||ch[i]==']'&&popChar=='['))
          {
            System.out.println("This expression is NOT correct.");
            System.out.println("Error at character # "+popNum+". ‘"+popChar+"‘- not closed."); 
            c++;
          }
        }
      }
      if(c==0)
      {
        if(parenthesesStack.size()==0)
        {
          System.out.println("This expression is correct.");
        }
        else
        {
          System.out.println("This expression is NOT correct.");
          System.out.println("Error at character # "+i+". ‘"+(char)parenthesesStack.pop()+"‘- not closed.");
        }
      }
    }
    catch(StackUnderflowException ue)
    {
      System.out.println("This expression is NOT correct.");
      System.out.println("Error at character # "+(i+1)+". ‘"+ch[i]+"‘- not opened."); 
    } 
  }
}