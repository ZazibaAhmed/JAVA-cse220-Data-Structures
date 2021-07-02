public class ComplexNumber extends RealNumber{
    public double imaginaryValue;
    public ComplexNumber(){
        this(1.0,1.0);
    }
    public ComplexNumber(double x,double y){
        super(x);
        imaginaryValue=y;
    }
     
    public String toString(){
        System.out.println("RealPart: "+getRealValue());
        return "ImaginaryPart: "+imaginaryValue;
    }
    
    public void ping() {
        System.out.println("I'm in ComplexNumber class");
    }
    public void check(){
        ping();
        super.ping();
        System.out.println("Checking ended.");
    }
}
        
    