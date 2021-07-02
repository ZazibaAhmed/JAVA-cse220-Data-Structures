public class Task3{
    public static void main(String []args){
        BankAccount acc1=new BankAccount("john","dhanmondi","43",15000);
        BankAccount acc2=new BankAccount("jill","gulshan","51",18000);
        BankAccount acc3=new BankAccount("jake","banani","12",1500);
        acc1.addInterest();
        acc3.addInterest();
        String a=acc1.getName()+","+acc1.getAddress()+","+acc1.getAccountID()+","+acc1.getBalance();
        String b=acc2.getName()+","+acc2.getAddress()+","+acc2.getAccountID()+","+acc2.getBalance();
        String c=acc3.getName()+","+acc3.getAddress()+","+acc3.getAccountID()+","+acc3.getBalance();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}