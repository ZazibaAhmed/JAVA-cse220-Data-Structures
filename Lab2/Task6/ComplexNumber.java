public class ComplexNumber{
    public int x,y;
    public double radius;
    public ComplexNumber(int o1,int o2){
        x=o1;
        y=o2;
    }
    public void increaseValue(){
        x+=2;
        y+=2;
    }
    public double polarRadius(){
    double x2=Math.pow(x,2);
    double y2=Math.pow(y,2);
    radius=Math.pow((x2+y2),0.5);
    return radius;
    }
    public String toString(){
       String complex=x+"+"+y+"i";
       return complex;
    }
}