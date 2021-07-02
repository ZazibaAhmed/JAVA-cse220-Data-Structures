
public class DoublyList{
  public Node head;
  
  
  
  public DoublyList(int [] a){
  head = new Node(0, null, null);
   Node tail = head;
    
    for(int i = 0; i<a.length; i++){
      Node mn = new Node(a[i], null, null);
      tail.next = mn;
      mn.prev=tail;
      tail=tail.next;
    }
    tail.next=head; 
    head.prev=tail;
  }
  
  
  
  public DoublyList(Node h){
    head = h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    int count = 0;
    for(Node n = head.next; n!=head; n=n.next){
      count++;
    }
    return count;
    
  }
  
  /* prints the elements in the list */
  public void forwardprint(){
    for(Node n = head.next; n!=head; n=n.next){
      if(n.next!=head){
        System.out.print(n.element + ",");         
      }
      else{
        System.out.print(n.element + ".");   
      }
    }
    System.out.println();     
  }
  
  
  public Node nodeAt(int idx){
    if(idx==-1){
      return head;
    }
    if(idx<-1){
      return null;
    }
    int i=0;
    for(Node n=head.next; n!=head; n=n.next){
      if(i==idx){
        return n;
      }
      i++;
    }
    return null;
 
  }
  
  /* remove Nodes from given starting index to the given end index. 
   * Check validity of index. Print a message if index is invalid.
   */
  public void removeFromUpto(int st_index, int en_index){
   if(st_index<0||en_index<0||en_index<st_index||en_index>=countNode()){
      System.out.println("Invalid Index");
    }
    Node pred=nodeAt(st_index-1);
    Node succ=nodeAt(en_index+1);
    pred.next=succ;
    succ.prev=pred;
    Node start=nodeAt(st_index);
    Node end=nodeAt(en_index);
    start.prev=end;
    end.next=start;
    Node tail=start.next;
    
    for(Node n=tail;n!=start;n=tail){
      tail=tail.next;
      Node mn=n;
      n.element=0;
      n.next=null;
      n.prev=null;
      n=null;
    }
    start.element=0;
    start.next=null;
    start.prev=null;
    start=null;
  }
  
  
  /* remove Nodes from the given index to the end of list. 
   * Check validity of index. Print a message if index is invalid.
   */
  public void InsertAtFirst(int elem){
    Node mn=new Node(elem,null,null);
    mn.next=nodeAt(0);
    (mn.next).prev=mn;
    head.next=mn;
  }
  
  /*sort the list in ascending order */
  public void sort(){
  //TO DO
  }
}