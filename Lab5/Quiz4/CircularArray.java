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
    cir = new Object[lin.length];
    start = st;
    size=sz;
    int k = start;
    for(int i = 0; i<size; i++){
      cir[k]=lin[i];
      k=(k+1)%cir.length;
    }
    
  }
  
  //Prints from index --> 0 to cir.length-1
  public void printFullLinear(){
    
    for(int i = 0; i<cir.length; i++){
      if(i<(cir.length-1))
        System.out.print(cir[i]+", ");
      else
        System.out.print(cir[i]+". ");
      
    }
    
    System.out.println();
  }
  
  public void insertAtTheStart(Object elem){
    if(size==cir.length){
      System.out.println("full");
    }
    else{
    Object []lin=new Object[size];
    int k = start;
    for(int i = 0; i<size; i++){
      lin[i]=cir[k];
      k=(k+1)%cir.length;
    }
    cir[start]=elem;
    int j=start+1;
    for(int i = 0; i<size; i++){
      cir[j]=lin[i];
      j=(j+1)%cir.length;
    }
    size++;
  }
      /*int nshift=
        int to=
        int from=*/
  }
  
  public void removeFromTheEnd(){
    /*  OR
     * int index=(start+size-1)%cir.length;
     * cir[index]=null;
     * size--;
     * */
    int k=start;
    for(int i=0;i<size;i++){
      if(i==size-1){
        cir[k]=null;
      }
      
      k=(k+1)%cir.length;
  }
    size--;
  }
 
  
}