public class StackTester1{
    public static void main(String args[]){
        ArrayStack obj=new ArrayStack();
        try{obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        System.out.println(obj.peek());
        System.out.println(obj.pop());
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(obj.toString());
        System.out.println((obj.toArray())[1]);
        System.out.println(obj.search(20));
        System.out.println(obj.search(40));
    }
}
        
    
    