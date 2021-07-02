public class ListQueue implements Queue{
    int size;
    Node front;
    Node rear;
    
    
    public ListQueue(){
        size = 0;
        front = null;
        rear = null;
    }
    
    public int size(){
      return size;
    }
    
    public boolean isEmpty(){
      if(size==0){
        return true;
      }
      else{
        return false;
      }
    }
    
    public void enqueue(Object o){
      if(size==0){
        Node mn=new Node(o,null);
        front=mn;
        rear=mn;
        size++;
      }
      else{
        Node mn=new Node(o,null);
        rear.next=mn;
        rear=mn;
        size++;
      }
    }
    
    public Object dequeue() throws QueueUnderflowException{
      if(size==0){
        throw new QueueUnderflowException();
      }
      else{
         if(size==1){
           Object v=front.val;
           front=null;
           rear=null;
           size=0;
           return v;
         }
         else{
           Object v=front.val;
           Node mn=front;
           front=front.next;
           mn.val=null;
           mn=null;
           size--;
           return v;
         }
      }
    }
    
    public Object peek() throws QueueUnderflowException{
      if(size==0){
        throw new QueueUnderflowException();
      }
      else{
           return front.val;
      }
    }
    
    public String toString(){
      String s="[ ";
      for(Node n=front;n!=null;n=n.next){
        s=s+n.val+" ";
      }
      s=s+"]";
      return s;
    }
    
    public Object[] toArray(){
      Object []a=new Object[size];
      int i=0;
      for(Node n=front;n!=null;n=n.next){
        a[i]=n.val;
        i++;
      }
      return a;
    }
    
    public int search(Object o){
      int i=0;
      for(Node n=front;n!=null;n=n.next){
        if(n.val==o){
         return i;
        }
         i++;
      }
      return -1;
    }
        
      
}


       
         
    
      
    
     

    
   
    
        
    
