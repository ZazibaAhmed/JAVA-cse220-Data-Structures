
public class DoublyListTester{
    public static void main(String [] args){
        
        
        int [] a1 = {100,20,30,40,50,60,70,80};
        DoublyList h1 = new DoublyList(a1); 
        h1.forwardprint(); // This should print: 100,20,30,40,50,60,70,80.
        System.out.println("\n/////  Test 01  /////");
        h1.removeFromUpto(2,4);
        h1.forwardprint(); // This should print: 100,20,60,70,80. 
        System.out.println("\n/////  Test 02  /////");
        h1.InsertAtFirst(120);
        h1.forwardprint(); // This should print: 120,100,20,60,70,80.  
//        System.out.println("\n/////  Test 03  /////");
//        h1.sort();
//        h1.forwardprint(); 
// This should print: 20,60,70,80,100,120.
         
    }
    
}