package a4;

public class match {
    // array to hold five sets of game
    private set[] matchSetArr  = {null, null, null, null, null};
    // array of 5 teams
    private team[] divisionArr;
    // win count for each team by index
    private int[] winCount = {0, 0, 0, 0, 0};
    // flag to see if matches should be added
    private boolean flag = true;
    // flag to see if matche is a draw
    private boolean draw = false;

    // Match constructor
    public  match(team [] divArr){
        this.divisionArr = divArr;
    }
    // addMatch method creates a match object and stores the teams that played and their scores,
    // it also calculates who won, if match cannot be added it will return false
    public boolean addMatch(String team1, int score1, String team2, int score2){
        // temporay holders for team object
        team tempTeam1 = null;
        team tempTeam2 = null;
        if (flag){
            for (int i = 0; i < 5; i++) {
                if (this.divisionArr[i].getTeamName() == team1) {
                    tempTeam1 = this.divisionArr[i];
                } else if (this.divisionArr[i].getTeamName() == team2) {
                    tempTeam2 = this.divisionArr[i];
                }
            }
            // case if given teams do not exists
            // program will terminate
            if ((tempTeam1 == null) || (tempTeam2 == null)) {
                System.out.println("Teams are not present in this division.");
                return false;
            }
            // making a match object
            set aMatch = new set(tempTeam1, score1, tempTeam2, score2);
            // adding the match object to matchSetArr
            for (int i = 0; i < 5; i++) {
                if (matchSetArr[i] == null) {
                    matchSetArr[i] = aMatch;
                    checkMatchStatus(i);
                    return true;
                }
            }
            System.out.println("Already 5 sets played for this match!");
            return false;
        }
        System.out.println("Already 5 sets played for this match or a team won!");
        return false;
    }
    // figures out if any team won the whole match after a game
    private void checkMatchStatus(int index){
        // getting winning team
        team winner = matchSetArr[index].getWinner();
        // adding point to total for team
        for(int i=0; i<5; i++){
            if (divisionArr[i] == winner){
                this.winCount[i]++;
                break;
            }
        }
        // checking if any team won
        for(int i=0; i<5; i++){
            if (this.winCount[i] > 2){
                this.flag = false;
                break;
            }
        }
        // checking for draw
        int draw=0;
        for(int i=0; i<5; i++){
            if (this.winCount[i] == 2){
                draw++;
            }
        }
        if (draw == 2){
            this.draw = true;
        }
    }
    // figures out which team won if any
    public team getWinner(){
        // code executed if draw
        if (this.draw){
            return this.matchSetArr[4].getWinner();
        }
        // code executed if not draw
        int highestPoint = this.winCount[0];
        team winner = this.divisionArr[0];
        // finding if any team
        for(int i=0; i<5; i++){
            if (winCount[i] > highestPoint){
                highestPoint = this.winCount[i];
                winner = this.divisionArr[i];
            }
        }
        return winner;
    }

    public void calculateStandings(){
        int[] numOfSetWon = {0, 0, 0, 0, 0};
        int[] numOfMatchesWon = {0, 0, 0, 0, 0};
        // looping through match set to get number of wins for each team
        for(int i=0; i<5; i++){
            if (this.matchSetArr[i].getWinner() == divisionArr[0]){
                numOfSetWon[0]++;
            }
            if (this.matchSetArr[i].getWinner() == divisionArr[1]){
                numOfSetWon[1]++;
            }
            if (this.matchSetArr[i].getWinner() == divisionArr[2]){
                numOfSetWon[2]++;
            }
            if (this.matchSetArr[i].getWinner() == divisionArr[3]){
                numOfSetWon[3]++;
            }
            if (this.matchSetArr[i].getWinner() == divisionArr[4]){
                numOfSetWon[4]++;
            }
        }
        for(int i=0; i<5; i++){
            numOfMatchesWon[i] = numOfSetWon[i]/3;
        }
        System.out.println("Standings:");
        for(int i=0; i<5; i++){
            System.out.println(this.divisionArr[i].getTeamName()
                    + " won "+ numOfMatchesWon[i] +" matches.");
        }
        System.out.println();
        System.out.print("Winner: ");
        int highest = 0;
        int index = 0;
        for(int i=0; i<5; i++){
            if (numOfSetWon[i]>highest){
                highest = numOfSetWon[i];
                index = i;
            }
        }
        System.out.print(this.divisionArr[index].getTeamName());
        System.out.println();
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    // tst code to check if match class is working properly
    public static void main(String[] args) {
        team t1 = new team("team1");
        team t2 = new team("team2");
        team t3 = new team("team3");
        team t4 = new team("team4");
        team t5 = new team("team5");
        team[] arr = {t1,t2, t3, t4, t5};
        match m1 = new match(arr);
        m1.addMatch("team1", 15, "team2", 25); // t2 won
        m1.addMatch("team1", 25, "team2", 35); // t2
        m1.addMatch("team1", 95, "team2", 45); // t1
        m1.addMatch("team1", 51, "team2", 50); // t1
        m1.addMatch("team1", 195, "team2", 105);  // t1
//        m1.addMatch("team1", 5, "team3", 50); // t3

        System.out.println(m1.getWinner().getTeamName()+" won.");



    }
}
