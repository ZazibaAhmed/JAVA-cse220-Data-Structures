public class tester2{
  public static void main(String []args){
    ArrayQueue obj=new ArrayQueue();
    try{
      obj.enqueue(10);
      obj.enqueue(20);
      obj.enqueue(30);
      obj.enqueue(40);
      System.out.println(obj.isEmpty());
      System.out.println(obj.dequeue());
      obj.enqueue(50);
      obj.enqueue(60);
      System.out.println(obj.size());
      System.out.println(obj.peek());
      System.out.println(obj.toString());
      System.out.println(obj.search(60));
      System.out.println(obj.search(30));
      System.out.println(obj.search(90));
    }
    catch(Exception e){
      System.out.println(e);
      
    }
    }
}
    