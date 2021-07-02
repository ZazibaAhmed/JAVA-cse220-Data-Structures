public class CircularArrayTester{
  public static void main(String [] args){
    
    Object [] linear = {10, 20, 30, 40, null};
    
    
    System.out.println("\n///// Insert at the start /////");
    Object [] linear4 = {10, 20, 30, 40, 50,null,null};
    CircularArray c4 = new CircularArray(linear4, 2, 5);
    c4.printFullLinear(); // This Should Print: null, null, 10, 20, 30, 40, 50.
    c4.insertAtTheStart(80); //parameter--> element
                               // Do not insert if size==cir.length
    c4.printFullLinear(); // This Should Print: 50, null, 80, 10, 20, 30, 40.
    
    
    System.out.println("\n///// Remove at the end /////");
    Object [] linear5 = {10, 20, 30, 40, 50, null, null};
    CircularArray c5 = new CircularArray(linear5, 3, 5);
    c5.printFullLinear(); // This Should Print: 50, null, null, 10, 20, 30, 40.
    c5.removeFromTheEnd();                        
    c5.printFullLinear(); // This Should Print: null, null, null, 10, 20, 30, 40.  
    c5.removeFromTheEnd();                        
    c5.printFullLinear();
    
   
    
  }
  
}