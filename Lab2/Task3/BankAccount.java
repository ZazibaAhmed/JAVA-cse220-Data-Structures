public class BankAccount{
    public String name,address,accountID;
    public double balance;
    public BankAccount(){
    }
    public BankAccount(String n,String a,String i,double b){
        name=n;
        accountID=i;
        address=a;
        balance=b;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public String getAccountID(){
        return accountID;
    }
    public void setAccountID(String i){
        accountID=i;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String a){
        address=a;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double c){
        balance=c;
    }
    public void addInterest(){
        balance+=((7.00/100.00)*balance);
    }
}