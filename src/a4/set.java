package a4;

public class set {
    // instance variables for team object
    team team1;
    team team2;
    // instance variables for scores
    int score1;
    int score2;
    // used to store point difference in each game
    int pointDifference = 0;

    // constructor for match, initializes instance variables
    public set(team t1, int score1, team t2, int score2){
        this.team1 = t1;
        this.team2 = t2;
        this.score1 = score1;
        this.score2 = score2;
    }
    // returns the winning team
    public team getWinner(){
        if (score1>score2){
            // addding points if a set is won
            team1.addPoint();
            //calculating point difference
            this.pointDifference = score1 - score2;
            return team1;
        }
        else if (score1<score2){
            // adding points if a set is won
            team2.addPoint();
            //calculating point difference
            this.pointDifference = score2 - score1;
            return team2;
        }
        // returns null if match draw
        else return null;
    }
    // returns the winning team
    public team getDrawResult(){
        if (score1>score2){
            //calculating point difference
            this.pointDifference = score1 - score2;
            return team1;
        }
        else if (score1<score2){
            //calculating point difference
            this.pointDifference = score2 - score1;
            return team2;
        }
        // returns null if match draw
        else return null;
    }
}
