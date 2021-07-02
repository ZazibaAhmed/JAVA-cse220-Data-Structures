public class ArrayStackDemo{
  public static void main(String [] args) throws Exception{
    ArrayStack arrayStackDemo = new ArrayStack();  
    
    arrayStackDemo.push(31);  
    arrayStackDemo.push(4);  
    arrayStackDemo.push(67); 
    System.out.println("Peek :"+arrayStackDemo.peek());
    arrayStackDemo.push(77);  
    arrayStackDemo.push(547);  
    
    System.out.println("Push toString() :"+arrayStackDemo.toString());
    arrayStackDemo.pop();
    System.out.println("Pop toString() :"+arrayStackDemo.toString());
    
    Object [] myArray = arrayStackDemo.toArray();
    System.out.print("toArray() :");
    for(int i=0;i<myArray.length;i++){
      System.out.print(myArray[i]+" ");
    }
    System.out.println();
    System.out.println("31 scarch :"+arrayStackDemo.search(31));
    System.out.println("97 scarch :"+arrayStackDemo.search(97));
  }
  
}