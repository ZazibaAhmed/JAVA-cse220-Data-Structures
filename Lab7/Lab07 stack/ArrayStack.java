public class ArrayStack implements Stack{
    int size;
    int top;
    Object [] data;
    
    public ArrayStack(){
        size=0;
        top =-1;
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
    
    public void push(Object e) throws StackOverflowException{
        if(size()==data.length){
            throw new StackOverflowException();
        }
        else{
            size++;
            top=size-1;
            data[top]=e;
        }
    }
    
    public Object pop() throws StackUnderflowException{
        if(size==0){
            throw new StackUnderflowException();
        }
        else{
            size--;
            Object o=data[top];
            data[top]=null;
            top=size-1;
            return o;
        }
    }
    
    public Object peek() throws StackUnderflowException{
        if(size()==0){
            throw new StackUnderflowException();
        }
        else{
            return data[top];
        }
    }
    
    public String toString(){
        String s="[ ";
        for(int i=top;i>=0;i--){
            s=s+(data[i])+" ";
        }
        s=s+"]";
        return s;
    }
    
    public Object[] toArray(){
        Object []a=new Object[size];
        int j=0;
        for(int i=0;i<size;i++){
            a[j]=data[i];
            j++;
        }
        return a;
    }
    
    public int search(Object e){
        for(int i=0;i<size;i++){
            if(data[i]==e){
                return i;
            }
        }
        return -1;
    }
}

        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
            
        
        
        
        
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
