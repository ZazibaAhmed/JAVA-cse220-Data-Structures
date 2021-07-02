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
  
  public int size()
  {
    return size;
  }
  
  public boolean isEmpty()
  {
    return size==0;
  }
  
  public void enqueue(Object o) throws QueueOverflowException
  {
    if(size>=data.length)
    {
      throw new QueueOverflowException();
    }
    else if(size==0)
    {
      front=0;
      rear=0;
      data[rear]=o;
      size++;
    }
    else
    {
      rear=(rear+1)%data.length;
      data[rear]=o;
      size++;
    }
  }
  
  public Object dequeue() throws QueueUnderflowException
  {
    if(size==0)
    {
      throw new QueueUnderflowException();
    }
    else
    {
      Object ob=data[front];
      data[front]=null;
      front=(front+1)%data.length;
      size--;
      return ob;
    }
  }
  
  public Object peek() throws QueueUnderflowException
  {
    if(size==0)
    {
      throw new QueueUnderflowException();
    }
    else
    {
      Object ob=data[front];
      return ob;
    }
  }
  
  public String toString()
  {
    if(size==0)
    {
      return "No Value";
    }
    else
    {
      String s="[ ";
      for(int i=front;i<=size;i++)
      {
        if(i<data.length)
        {
          s=s+data[i]+" , ";
        }
        else
        {
          i=0;
        }
      }
      s=s+"]";
      return s;
    }
  }
  public Object[] toArray()
  {
    if(size==0)
    {
      return null;
    }
    else
    {
      Object a[]=new Object[size];
      int c=0;
      for(int i=front;i<=rear;i++)
      {
        if(i<data.length)
        {
          a[c]=data[i];
          c++;
        }
        else
        {
          i=0;
        }
      }
      return a;
    }
  }
  public int search(Object o)
  {
    int count=1;
    if(size==0)
    {
      return -1;
    }
    else
    {
      for(int i=front;i<=size;i++)
      {
        if(i<data.length)
        {
          if(data[i]==o)
          {
            return count;
          }
          count++;
        }
        else
        {
          i=0;
        }
      }
    }
    return -1;
  }
}