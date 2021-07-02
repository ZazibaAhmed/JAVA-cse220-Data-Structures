public class FootBallTeam extends Team{  
    
    public FootBallTeam(String x){
        super(x);
    }
    public String toString(){
        System.out.println("our name is "+super.name);
        return "we play Football";
    }
}