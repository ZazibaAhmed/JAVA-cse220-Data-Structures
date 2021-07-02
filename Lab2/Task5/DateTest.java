public class DateTest{
    public static void main(String []args){
        Date year1=new Date(5,13,2016);
        System.out.println(year1.DisplayDate());
        Date year2=new Date();
        year2.setMonth(6);
        year2.setDay(13);
        year2.setYear(2016);
        System.out.println(year2.getMonth());
        System.out.println(year2.getDay());
        System.out.println(year2.getYear());
        System.out.println(year2.DisplayDate());
    }
}
        
        
        
    