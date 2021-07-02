public class Task10{
    public static void Seasons(int m,int d){
        if(m>=3&&m<=6){
            if(m==3&&d<16){
                System.out.println("Winter");
            }
            else{
                if(m==6&&d>15){
                    System.out.println("Summer");
                }
                else{
                    System.out.println("Spring");
                }
            }
        }
        if(m>=6&&m<=9){
            if(m==6&&d<16){
                    System.out.println("Spring");
                }
                else{
                    if(m==9&&d>15){
                        System.out.println("Fall");
                    }
                    else{
                        System.out.println("Summer");
                    }
                }
        }
        if(m>=9&&m<=12){
            if(m==9&&d<16){
                        System.out.println("Summer");
                    }
             else{
                 if(m==12&&d>15){
                            System.out.println("Winter");
                            }
                 else{
                            System.out.println("Fall");
                        }
             }
        }
    }
}

        
    
                        
                        
                        
                 
                                
    
                    
                        
                    
            



                    
                    
                
                
                                    
                
        