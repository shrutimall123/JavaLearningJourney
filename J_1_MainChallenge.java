public class J_1_MainChallenge {
    public static void main(String [] args){
        boolean GameOver=false;
        int score=800;
        int level_completed=8;
        int bonus=200;
        int TotalScore=score;
        if(GameOver){
            TotalScore += (level_completed*bonus);
            System.out.println(TotalScore);
        }
        else{
            System.out.println("Game is Still on");
        }

    }
    
}
