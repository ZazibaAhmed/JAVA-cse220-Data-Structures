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
  public boolean isEmpty(){
    return size == 0;
  }
  public void push(Object e) throws StackOverflowException{
    if(top == null){
      Node myNode = new Node(e,null);
      top = myNode;
      size++;
    }else{
      Node myNode = new Node(e,null);
      myNode.next=top;
      top = myNode;
      size++;
    }
  }
  public Object pop() throws StackUnderflowException{
    Node myNode = top;
    Object temp = myNode.val;
    top = top.next;
    myNode.val = null;
    myNode.next = null;
    size--;
    return temp;
  }
  public Object peek() throws StackUnderflowException{
    if(size == 0){
      throw new StackUnderflowException();
    }else{
      Object temp = top.val;
      return temp;
    }
  }
  public String toString(){
    String s="[ ";
    for(Node n=top;n != null; n=n.next){
      s+=n.val+" ";
    }
    s+="]";
    return s;
  }
  public Object[] toArray(){
    Object []newArray = new Object[size];
    int i=0;
    for(Node n=top;n != null; n=n.next,i++){
      newArray[i]=n.val;
    }
    return newArray;
  }
  public int search(Object e){
    int i=0;
    for(Node n=top;n != null; n=n.next,i++){
      if(n.val.equals(e))
        return i;
      else
        continue;
    }
    return -1;
  }
}
