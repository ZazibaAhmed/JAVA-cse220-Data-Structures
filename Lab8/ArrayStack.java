public  class ArrayStack implements Stack{
  int size;
  int top;
  Object [] data;
  
  public ArrayStack(){
    size=0;
    top =-1;
    data = new Object[10];
  }
  
    public int size(){
      return top+1;
  }
  public boolean isEmpty(){
    return size == 0;
  }
  public void push(Object e) throws StackOverflowException{
    if(size == data.length){
      throw new StackOverflowException();
    }else{
      data[++top]=e;
      size++;
    }
  }
  public Object pop() throws StackUnderflowException{
    if(size == 0){
      throw new StackUnderflowException();
    }else{
      Object temp = data[top];
      data[top]=null;
      top--;
      return temp;
    }
  }
  public Object peek() throws StackUnderflowException{
    if(size == 0){
      throw new StackUnderflowException();
    }else{
      Object temp = data[top];
      return temp;
    }
  }
  public String toString(){
    String s="[ ";
    for(int i=0;i<size;i++){
      s+=data[i]+" ";
    }
    s+="]";
    return s;
  }
  public Object[] toArray(){
    Object []newArray = new Object[size]; 
    for(int i=0;i<size;i++){
      newArray[i]=data[i];
    }
    return newArray;
  }
  public int search(Object e){
    for(int i=0;i<size;i++){
      if(data[i].equals(e))
        return i;
      else
        continue;
    }
    return -1;
  }
}