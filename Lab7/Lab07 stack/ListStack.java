public class ListStack implements Stack{
    int size;
    Node top;
  
    
    public ListStack(){
        size = 0;
        top = null;
    }
    public int size(){
      return size;
    }
    
    // Returns true if the stack is empty
    public boolean isEmpty(){
      if(top==null){
        return true;
      }
      else{
        return false;
      }
    }
    
// Pushes the new item on the stack, throwing the
// StackOverflowException if the stack is at maximum capacity. It
// does not throw an exception for an "unbounded" stack, which
// dynamically adjusts capacity as needed.
    public void push(Object e){
        if(size==0){
            size++;
            Node mn=new Node(e,null);
            top=mn;
        }
        else{
            size++;
            Node mn=new Node(e,top);
            top=mn;
        }
    }
    
    
// Pops the item on the top of the stack, throwing the
// StackUnderflowException if the stack is empty.
    public Object pop() throws StackUnderflowException{
        if(size==0){
            throw new StackUnderflowException();
        }
        else{
            size--;
            Object v=top.val;
            Node mn=top;
            top=top.next;
            mn.val=null;
            mn.next=null;
            mn=null;
            return v;
        }
    }
                
// Peeks at the item on the top of the stack, throwing
// StackUnderflowException if the stack is empty.
    public Object peek() throws StackUnderflowException{
        if(size==0){
            throw new StackUnderflowException();
        }
        else{
            Object v=top.val;
            return top.val;
        }
    }
    
    
// Returns a textual representation of items on the stack, in the
// format "[ x y z ]", where x and z are items on top and bottom
// of the stack respectively.
    public String toString(){
        Object a[]=toArray();
        String s="[";
        for(int i=0;i<a.length;i++){
            s=s+a[i]+" ";
        }
        s=s+"]";
        return s;
    }

// Returns an array with items on the stack, with the item on top
// of the stack in the first slot, and bottom in the last slot.
    public Object[] toArray(){
        Object []a=new Object[size];
        Object []b=new Object[size];
        int i=0;
        for(Node n=top;n!=null;n=n.next){
            b[i]=n.val;
            i++;
        }
        int k=size-1;
        for(int j=0;j<a.length;j++){
            a[j]=b[k];
            k--;
        }
        return a;
    }
// Searches for the given item on the stack, returning the
// offset from top of the stack if item is found, or -1 otherwise.
    public int search(Object e){
        int i=0;
        for(Node n=top;n!=null;n=n.next){
            if(n.val==e){
                return i;
            }
            i++;
        }
        return -1;
    }
}





    

