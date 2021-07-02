public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object []a){
    head=new Node(a[0],null);
    Node tail=head;
   for(int i=1;i<a.length;i++){
     Node mn=new Node(a[i],null);
     tail.next=mn;
     tail=tail.next;
   }
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
    head=h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    int i=0;
    for(Node n=head;n!=null;n=n.next){
       i++;
    }   
    return i; 
  }
  
  /* prints the elements in the list */
  public void printList(){
    for(Node n=head;n!=null;n=n.next){
      System.out.print(n.element+",");
    }
    System.out.println();
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    int i=0;
    for(Node n=head;n!=null;n=n.next){
      if(i==idx){
        return n;
      }
      i++;
    }   
    return null; // please remove this line!
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
    int i=0;
    for(Node n=head;n!=null;n=n.next){
      if(i==idx){
        return n.element;
      }
      i++;
    }   
    return null; // please remove this line!
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
    Object temp=null;
    int i=0;
    for(Node n=head;n!=null;n=n.next){
        if(i==idx){
            temp=n.element;
            n.element=elem;
            return temp;
        }
        i++;
    }
    return null; 
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    int i=0;
    for(Node n=head;n!=null;n=n.next){
        if(n.element==elem){
            return i;
        }
        i++;
    }
    return -1; 
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
     for(Node n=head;n!=null;n=n.next){
        if((n.element).equals(elem)){
            return true;
        }
    }
    return false; 
  }
    
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
      Node head2=new Node(head.element,null);
      Node tail=head2;
      for(Node n=head.next;n!=null;n=n.next){
          Node mn=new Node(n.element,null);
          tail.next=mn;
          tail=tail.next;
      }
    return head2;
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
    Node head2=null;
    Node rev=head2;
    for(Node n=head;n!=null;n=n.next){
        Node mn=new Node(n.element,null);
        mn.next=head2;
        head2=mn;
    }
    return head2; 
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
      if(idx==0){
          Node mn=new Node(elem,null);
          mn.next=head;
          head=mn;
      }
      else{
          int i=0;
          Node pred=null,succ=null;
          for(Node n=head;n!=null;n=n.next){
              if(i==(idx-1)){
                  pred=n;
              }
              if(i==idx){
                  succ=n;
              }
              i++;
          }
          Node mn=new Node(elem,null);
          pred.next=mn;
          mn.next=succ;
      }
      
  }
                  
      
          
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
      if(index<0){
          return null;
      }
      else{
     if(index==0){
        Node rn=head;
        head=head.next;
        Object elem=rn.element;
        rn.element=null;
        rn.next=null;
        rn=null;
        return elem;
      }
      else{
          int i=0;
          Node pred=null,succ=null,rn=null;
          for(Node n=head;n!=null;n=n.next){
              if(i==(index-1)){
                  pred=n;
              }
              if(i==index){
                  rn=n;
              }
              if(i==(index+1)){
                  succ=n;
              }
              i++;
          }
          Object elem=rn.element;
          pred.next=succ;
          rn.element=null;
          rn.next=null;
          rn=null;
          return elem;
      }
      }
  }
    
  
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
    // TO DO
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
    // TO DO
  }
  
}