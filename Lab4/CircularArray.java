public class CircularArray{
  
  private int start;
  private int size;
  private Object [] cir;
  
  /*
   * if Object [] lin = {10, 20, 30, 40, null}
   * then, CircularArray(lin, 2, 4) will generate
   * Object [] cir = {40, null, 10, 20, 30}
   */
  public CircularArray(Object [] lin, int st, int sz){
    start=st;
    size=sz;
    int k=start;
    cir=new Object[lin.length];
    for(int i=0;i<size;i++){
        cir[k]=lin[i];
        k=(k+1)%cir.length;
    }
  
  }
    
   
  //Prints from index --> 0 to cir.length-1
  public void printFullLinear(){
      for(int i=0;i<cir.length;i++){
       System.out.print(cir[i]+",");
      }
      System.out.println();
  }
            
        
  // Starts Printing from index start. Prints a total of size elements
  public void printForward(){
      int k=start;
     for(int i=0;i<size;i++){
       System.out.print(cir[k]+",");
       k=(k+1)%cir.length;
     }
     System.out.println();
  }
  
  
  public void printBackward(){
      int k=0;
      for(int i=0;i<cir.length;i++){
          if(cir[i]==null){
              k=i-1;
              break;
          }
      }
      for(int i=0;i<size;i++){
          System.out.print(cir[k]+",");
          k--;
          if(k<0){
             k=cir.length-1;
          }
      }
      System.out.println();
  }
    
  
  // With no null cells
  public void linearize(){
      Object []lin=new Object[size];
      int k=start;
      for(int i=0;i<size;i++){
      lin[i]=cir[k];
      k=(k+1)%cir.length;
     }
      cir=new Object[size];
      for(int i=0;i<size;i++){
          cir[i]=lin[i];
      }
  }
  
  // Do not change the Start index
  public void resizeStartUnchanged(int newcapacity){
    Object []lin=new Object[newcapacity];
     int k=start;
     for(int i=0;i<size;i++){
       lin[i]=cir[k];
       k=(k+1)%cir.length;
     }
     cir=new Object[newcapacity];
     for(int i=0;i<size;i++){
        cir[k]=lin[i];
        k=(k+1)%cir.length;
    }
  }
   
  // Start index becomes zero
  public void resizeByLinearize(int newcapacity){
      Object []lin=new Object[newcapacity];
     int k=start;
     for(int i=0;i<size;i++){
       lin[i]=cir[k];
       k=(k+1)%cir.length;
     }
     cir=new Object[newcapacity];
     for(int i=0;i<size;i++){
        cir[i]=lin[i];
     }
    
  }
  
  /* pos --> position relative to start. Valid range of pos--> 0 to size.
   * Increase array length by 3 if size==cir.length
   * use resizeStartUnchanged() for resizing.
   */
  public void insertByRightShift(Object elem, int pos){
      if(size==cir.length){
         resizeStartUnchanged(cir.length+3);
      }
      int nshift=size-pos;
      int from=(start+size-1)%cir.length;
      int to=(from+1)%cir.length;
      for(int i=0;i<nshift;i++){
          cir[to]=cir[from];
          to=from;
          from--;
          if(from==-1){
              from=cir.length-1;
          }
      }
      int index=(start+pos)%cir.length;
      cir[index]=elem;
      size++;
  }
   
  
  public void insertByLeftShift(Object elem, int pos){
    if(size==cir.length){
         resizeStartUnchanged(cir.length+3);
      }
      int nshift=pos+1;
      int from=start;
      int to=from-1;
      if(to==-1){
          to=cir.length-1;
      }
      for(int i=0;i<nshift;i++){
          cir[to]=cir[from];
          to=from;
          from=(from+1)%cir.length;
      }
      int index=(start+pos)%cir.length;
      cir[index]=elem;
      size++;
      start=start-1;
      if(start<0){start=cir.length-1;}
  }
   
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByLeftShift(int pos){
      int nshift=size-(pos);
      int to=(start+pos)%cir.length;
      int from=(to+1)%cir.length;
      for(int i=0;i<nshift;i++){
          cir[to]=cir[from];
          to=from;
          from=(from+1)%cir.length;
          
      }
          int index=(start+size-1)%cir.length;
          cir[index]=null;
          size--;
             
  }
  
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByRightShift(int pos){
   int nshift=pos+1;
   int from=(start+pos-1)%cir.length;
   int to=(from+1)%cir.length;
   for(int i=0;i<nshift;i++){
       cir[to]=cir[from];
       to=from;
       from--;
       if(from==-1){from=cir.length-1;}
   }
   start++;
   size--;
  }
  
}