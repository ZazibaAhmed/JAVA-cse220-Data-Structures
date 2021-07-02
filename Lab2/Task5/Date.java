public class Date{
    public int month,day,year;
    public Date(){
    }
    public Date(int m,int d,int y){
        month=m;
        day=d;
        year=y;
    }
    public void setMonth(int m){
        month=m;
    }
   public int getMonth(){
        return month;
    }
    public void setDay(int d){
        day=d;
    }
    public int getDay(){
        return day;
    }
    public void setYear(int y){
        year=y;
    }
    public int getYear(){
        return year;
    }
    public String DisplayDate(){
        String date=month+"/"+day+"/"+year;
        return date;
    }
}