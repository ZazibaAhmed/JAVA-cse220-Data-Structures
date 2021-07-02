public class ArrayQueue implements Queue{
    int size;
    int front;
    int rear;
    Object [] data;
    
    public ArrayQueue(){
        size=0;
        front = -1;
        rear = -1;
        data = new Object[5];
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
    
    public void enqueue(Object o) throws QueueOverflowException{
        if(size==data.length){
            throw new QueueOverflowException();
        }
        else{
           if(size==0){
           front=0;
           rear=0;
           data[front]=o;
           size++;
           }
          else{
          rear=(rear+1)%data.length;
          data[rear]=o;
          size++;
      }
        }
    }
       
    public Object dequeue() throws QueueUnderflowException{
      if(size==0){
        throw new QueueUnderflowException();
      }
      else{
         if(size==1){
           Object v=data[front];
           data[front]=null;
           data[rear]=null;
           front=0;
           rear=0;
           size=0;
           return v;
         }
         else{
           Object v=data[front];
           data[front]=null;
           front=(front+1)%data.length;
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
           return data[front];
      }
    }
    
    public String toString(){
      String s="[ ";
      int i=front;
      for(int count=0;count<size;count++){
        s=s+data[i]+" ";
        i=(i+1)%data.length;
      }
      s=s+"]";
      return s;
    }
    
    public Object[] toArray(){
      Object []a=new Object[size];
      int i=front;
      for(int count=0;count<size;count++){
        a[count]=data[i];
        i=(i+1)%data.length;
      }
      return a;
    }
    
    public int search(Object o){
      int i=front;
      for(int count=0;count<size;count++){
        if(data[i]==o){
         return count;
        }
         i=(i+1)%data.length;
      }
      return -1;
    }
    
    
}