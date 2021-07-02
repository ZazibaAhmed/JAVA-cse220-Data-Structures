public class LinkStackDemo{
  public static void main(String [] args) throws Exception{
    ListStack linkStackDemo = new ListStack();  
    
    linkStackDemo.push(21);  
    linkStackDemo.push(64);  
    linkStackDemo.push(53);  
    System.out.println("Peek :"+linkStackDemo.peek());
    linkStackDemo.push(51);  
    linkStackDemo.push(819);  
    
    System.out.println("Push toString() :"+linkStackDemo.toString());
    linkStackDemo.pop();
    System.out.println("Pop toString() :"+linkStackDemo.toString());
    
    Object [] myArray = linkStackDemo.toArray();
    System.out.print("toArray() :");
    for(int i=0;i<myArray.length;i++){
      System.out.print(myArray[i]+" ");
    }
    System.out.println();
    System.out.println("64 scarch :"+linkStackDemo.search(64));
    System.out.println("88 scarch :"+linkStackDemo.search(88));
  }
}