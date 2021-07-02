public class QuadEqn{
    public int a,b,c;
    public String eqn;
    public QuadEqn(int x,int y,int z){
        a=x;
        b=y;
        c=z;
        if(a==1){
            eqn="x2+"+b+"x+"+c;
        }
        else{
            if(b==1){
                eqn=a+"x2+"+"x+"+c;
            }
            else{
                eqn=a+"x2+"+b+"x+"+c;
            }
        }
    }
    public double firstRoot(){
        double num=Math.pow(((Math.pow(b,2))-4*a*c),0.5);
        double root=((-b)+num)/(2*a);
        return root;
    }
    public String toString(){
        return eqn;
    }
}











                
        
    