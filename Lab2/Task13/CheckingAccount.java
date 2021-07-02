public class CheckingAccount extends Account{
    public static int numberOfAccount;
    public CheckingAccount(){
        numberOfAccount+=1;
        
    }
    public CheckingAccount(double x){
        super(x);
        numberOfAccount+=1;
    }
   
}