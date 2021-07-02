public class CricketTeam extends Team{
    
    public CricketTeam(String x){
        super(x);
    }
    public String toString(){
        System.out.println("our name is "+super.name);
        return "we play Cricket";
    }
}