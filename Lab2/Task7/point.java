public class point{
    public int x,y;
    public double distance;
    public point(int o1,int o2){
        x=o1;
        y=o2;
    }
    public double distanceFromOrigin(){
    double x2=Math.pow(x,2);
    double y2=Math.pow(y,2);
    distance=Math.pow((x2+y2),0.5);
    return distance;
    }
}