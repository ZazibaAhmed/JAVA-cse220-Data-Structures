public class Lab11{
  public static void main(String []args){
       System.out.println(fact(5));
       System.out.println(fib(10));
       int []a={2,3,4,5,7,9};
       System.out.println(bsearch(a,0,5,4));
       ToBinary(5);
       System.out.println();
       Object []b={10,20,30,40,50};
       //LinkedList l=new LinkedList(b);
       //System.out.println(Index(l.head,20,0));
       System.out.println(pow(2,3));
       
    }
    
  public static int fact(int n){
        if(n==0){
            return 1;
        }
        else{
          return (n*fact(n-1));
        }
       
    }
  
  public static int fib(int n){
    if(n==1||n==2){
      return 1;
    }
    else{
      return (fib(n-1)+fib(n-2));
    }
  }

  
  public static int bsearch(int []x,int l,int r,int n){
    int mid=0;
     if(r>=l){
      mid =(r+l)/2;
     }
     if(x[mid]==n){
       return mid;
     }
     else{
       if(n>x[mid]){
          return bsearch(x,l+1,r,n);
       }
       else{
         return bsearch(x,l,r-1,n);
       }
     }
  }
  
  public static void ToBinary(int n){
    if(n==0){
      
      return;
    }
    else{
    ToBinary(n/2);
    System.out.print(n%2);
   }
  }
  
//  public static int Index(Node n,Object obj,int i){
//      if(n==null){
//          return -1;
//      }
//      if(n.element==obj){
//          return i;
//      }
//      else{
//          n=n.next;
//          i=i+1;
//          return (Index(n,obj,i));
//      }
//  }
      
  
  
  public static int pow(int m,int n){
    if(n==1){
      return m;
    }
    else{
       return (m*pow(m,n-1));
    }
  }
}
  
  
  


  
  


       
       
       
       
       
      
      
      
      
      
      
    
    
