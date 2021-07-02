public class DoublyList{
    public Node head;
    
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public DoublyList(Object [] a){
        head = new Node(a[0], null, null);
        Node tail = head;
        
        for(int i = 1; i<a.length; i++){
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;
            tail=tail.next;
        }
        tail.next=head; // Making it circular
        head.prev=tail;
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h){
        head = h;
    }
    
    /* Counts the number of Nodes in the list */
    public int countNode(){
        int i=1;
        for(Node n=head.next;n!=head;n=n.next){
            i++;
        }
        return i; 
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
        System.out.print(head.element+",");
        for(Node n=head.next;n!=head;n=n.next){
           System.out.print(n.element+",");
        }
        System.out.println();
    }
    
    public void backwardprint(){
        Node tail=head.prev;
        for(Node n=tail;n!=head;n=n.prev){
            System.out.print(n.element+",");
        }
        System.out.print(head.element);
        System.out.println();
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        
        if(idx==0){
            return head;
        }
        else{
        int i=1;
        for(Node n=head.next;n!=head;n=n.next){
            if(i==idx){
                return n;
            }
            i++;
        }
        }
        return null;
    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        
        if(head.element==elem){
            return 0;
        }
        else{
        int i=1;
        for(Node n=head.next;n!=head;n=n.next){
            if(n.element==elem){
                return i;
            }
            i++;
        }
        }
        return -1; 
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        if(idx<0||idx>countNode()){
            
        }
        else{
            if(idx==countNode()){
                Node mn=new Node(elem,null,null);
                head.prev=mn;
                mn.next=head;
                Node pred =nodeAt(idx-1);
                mn.prev=pred;
                pred.next=mn;
            }
            else{
        
        Node pred=(nodeAt(idx)).prev;
        Node succ=nodeAt(idx);
        Node mn=new Node(elem,null,null);
        mn.next=succ;
        succ.prev=mn;
        pred.next=mn;
        mn.prev=pred;
        if(idx==0){
            head=mn;
        }
        }
        }
    }
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        if(index<0||index>=countNode()){
            return null;
        }
        else{
        Node mn=nodeAt(index);
        Object elem=mn.element;
        Node pred=(nodeAt(index)).prev;
        Node succ=(nodeAt(index)).next;
        pred.next=succ;
        succ.prev=pred;
        mn.element=null;
        mn.next=null;
        mn.prev=null;
        mn=null;
        if(index==0){
            head=succ;
        }
        return elem; 
    }
    }
    
    
    
}