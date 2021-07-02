public class LinearArray{
  public static void main(String [] args){
    int [] a = {10, 20, 30, 40, 50, 60};
    
    System.out.println("\n///// TEST 01: Copy Array example /////");
    int [] b = copyArray(a, a.length);
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    
    System.out.println("\n///// TEST 02: Print Reverse example /////");
    printArray(a); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    printReverse(a); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
    
    
    System.out.println("\n///// TEST 03: Reverse Array example /////");
    reverseArray(b);
    printArray(b); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
    
    
    System.out.println("\n///// TEST 04: Shift Left k cell example /////");
    b = copyArray(a, a.length);
    b=shiftLeft(b,4);
    printArray(b); // This Should Print: { 40, 50, 60, 0, 0, 0 } 
    
    System.out.println("\n///// TEST 05: Rotate Left k cell example /////");
    b = copyArray(a, a.length); 
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    b=rotateLeft(b,3);
    printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 } 
    
    System.out.println("\n///// TEST 06: Shift Right k cell example /////");
    b = copyArray(a, a.length);
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    b=shiftRight(b,3);
    printArray(b);  // This Should Print: { 0, 0, 0, 10, 20, 30 } 
    
    System.out.println("\n///// TEST 07: Rotate Right k cell example /////");
    b = copyArray(a, a.length);
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    b=rotateRight(b,3);
    printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 } 
    
    
    System.out.println("\n///// TEST 08: Insert example 1 /////");
    
    b = copyArray(a, a.length);
    printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 } */
    boolean bol=insert(b,6, 70, 2); // This Should Print: No space Left 
    System.out.println(bol); // This Should Print: false
    printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 }*/
    
    System.out.println("\n///// TEST 09: Insert example 2 /////");
    int [] c = {10, 20, 30, 40, 50, 0, 0}; 
    printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 }
    bol=insert(c,5,70,2);  // This Should Print: Number of elements after insertion: 6
    System.out.println(bol); // This Should Print: true
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 } 
    
    System.out.println("\n///// TEST 10: Insert example 3 /////");
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 } 
    bol=insert(c,6, 70, 6); // This Should Print: Number of elements after insertion: 7 
    System.out.println(bol); // This Should Print: true
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    
    System.out.println("\n///// TEST 11: Remove example 1 /////");
    
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    printArray(c);
    bol=removeAll(c,7,90);
    System.out.println(bol); // This Should Print: false
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    
    System.out.println("\n///// TEST 12: Remove example 2 /////");
    printArray(c);  // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    bol=removeAll(c,7,70);
    System.out.println(bol); // This Should Print: true
    printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 } 
    
    
    
  }
  
  // Prints the contents of the source array
  public static void printArray(int [] source){
   
    for(int i=0;i<source.length;i++){
      System.out.print(source[i]+" ,");
    }
    System.out.println();
   
  }
    
  // Prints the contents of the source array in reverse order
  public static void printReverse(int [] source){
    for(int i=source.length-1;i>=0;i--){
      System.out.print(source[i]+" ,");
    }
    System.out.println();
  }
  
  // creates a copy of the source array and returns the reference of the newly created copy array
  public static int [] copyArray(int [] source, int len){
    int []newA=new int[len];
    for(int i=0;i<len;i++){
      newA[i]=source[i];
    }
    return newA;    
  }
  
  // creates a reversed copy of the source array and returns the reference of the newly created reversed array
  public static void reverseArray(int [] source){
    int []revA=new int[source.length];
    int j=source.length-1;
    for(int i=0;i<source.length;i++){
      revA[i]=source[j];
      j--;
    }
    for(int i=0;i<source.length;i++){
      source[i]=revA[i];
    }
  }
         
  
  // Shifts all the elements of the source array to the left by 'k' positions
  // Returns the updated array
  public static int [] shiftLeft(int [] source, int k){
   
    int m=k;
    for(int i=0;i<source.length-k;i++){
      source[i]=source[m];
      m++;
    }
    for(int c=source.length-k;c<source.length;c++){
      source[c]=0;
    }
    return source;
  }

  // Rotates all the elements of the source array to the left by 'k' positions
  // Returns the updated array
  public static int [] rotateLeft(int [] source, int k){
      int []temp=new int[k];
      for(int i=0;i<k;i++){
          temp[i]=source[i];
      }
      for(int i=k;i<=source.length-1;i++){
          source[i-k]=source[i];
      }
      int j=0;
      for(int i=source.length-k;i<source.length;i++){
          source[i]=temp[j];
          j++;
      }
    return source;     
  }
  
  // Shifts all the elements of the source array to the right by 'k' positions
  // Returns the updated array
  public static int [] shiftRight(int [] source, int k){
      for(int i=source.length-1;i>k-1;i--){
          source[i]=source[i-k];
      }
      for(int i=0;i<k;i++){
          source[i]=0;
      }
      return source;  
  }
  
  // Rotates all the elements of the source array to the right by 'k' positions
  // Returns the updated array
  public static int [] rotateRight(int [] source, int k){
    int []a=new int[k];
    int j=source.length-k;
    for(int i=0;i<k;i++){
        a[i]=source[j];
        j++;
    }
    for(int i=source.length-1;i>k-1;i--){
       source[i]=source[i-k];
    }
    for(int i=0;i<k;i++){
       source[i]=a[i];
    }
    return source;    
  }
  
  /** @return true if insertion is successful; @return false otherwise
    * @param arr the reference to the linear array
    * @param size the number of elements that exists in the array. size<=arr.length
    * @param elem the element that is to be inserted
    * @param index the index in which the element is required to be inserted
    * if insertion is not successful due to lack space, print "No space Left"
    * if given index is invalid, print "Invalid Index"
    * if insertion is successful, print the 'Number of elements after insertion' is completed*/
    
   public static boolean insert(int [] arr, int size, int elem, int index){
     if(index<0||index>=arr.length){
          System.out.println("Invalid Index");
          return false;
      }
      else{
          if(size==arr.length){
              System.out.println("No Space Left");
              return false;
          }
          else{
              
              for(int i=size;i>index;i--){
                  arr[i]=arr[i-1];
              }
              arr[index]=elem;
              size++;
              System.out.println("Number of elements after insertion :"+size);
              return true;
          }
      }
   }
   
  
  /** 
   * removes all the occurences of the given element
   * @param arr the reference to the linear array
   * @param size the number of elements that exists in the array. size<=arr.lengt
   * @param elem the element to be removed
   * @return true if removal is successful; return false otherwise
   * if removal is successful, print the 'Number of elements after removal' is completed */
     
  public static boolean removeAll(int [] arr, int size, int elem){
      boolean m=false;
      for(int i=0;i<arr.length;i++){
        if(arr[i]==elem){
            m=true;
            break;
        }
      }
      
      for(int i=0;i<arr.length;i++){
          if(arr[i]==elem){
              for(int j=i;j<size-1;j++){
                  arr[j]=arr[j+1];
              }
              arr[size-1]=0;
              size--;
           }
      }
      return m;
  }
  
}

  
  
  
  
  
  