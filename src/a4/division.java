package a4;

public class division {
    // team name
    private String divisionName;
    // array of 5 teams
    private team[] divisionArr = new team[5];
    // array of 5 match sets initialized with null
    private set[] matchSetArr = {null, null, null, null, null};
    // array of 5 match sets initialized with null
    private match[] matchArr = {null, null, null, null, null};
    // creating match object
    match matchObj = new match(this.divisionArr);
    // constructor that takes in division name
    public division(String name){
        this.divisionName = name;
    }
    // getters and setters for division name
    public String getDivisionName() {
        return divisionName;
    }
    public void setDivisionName(String name) {
        this.divisionName = name;
    }
    // league setup method creates 5 teams and adds them to this division
    // by default 12 players and 2 coaches are automatically generated for each team
    // which can be modified later
    public void leagueSetup(String team1, String team2, String team3,
                            String team4, String team5){
        this.divisionArr[0] = new team(team1);
        this.divisionArr[1] = new team(team2);
        this.divisionArr[2] = new team(team3);
        this.divisionArr[3] = new team(team4);
        this.divisionArr[4] = new team(team5);
    }
    // method to change team name
    public void changeTeamName(String oldName, String newName){
        for(int i=0; i<5; i++){
            if (this.divisionArr[i].getTeamName() == oldName){
                this.divisionArr[i].setName(newName);
            }
        }
    }
    // initiating a match
    public match initiateMatch(){
        match initMatch = new match(this.divisionArr);
        // hold matches in array to calculate standings
        // need to add arrayList here
        for(int i=0; i<5; i++){
            if (matchArr[i] == null){
                matchArr[i] = initMatch;
                return initMatch;
            }
        }
        return null;
    }
    // calculates matches won by each team
    public void addMatch(String team1, int score1, String team2, int score2){
        // temporary holders for team object
//        team tempTeam1 = null;
//        team tempTeam2 = null;
//        for(int i=0; i<5; i++){
//            if (this.divisionArr[i].getTeamName() == team1){
//                tempTeam1 = this.divisionArr[i];
//            }
//            else if(this.divisionArr[i].getTeamName() == team2){
//                tempTeam2 = this.divisionArr[i];
//            }
//        }
//        // case if given teams do not exists
//        // program will terminate
//        if ((tempTeam1 == null)||(tempTeam2 == null)){
//            System.out.println("Teams are not present in this division.");
//            return;
//        }
        matchObj.addMatch(team1, score1, team2, score2);
    }

    public void calculateStandings(){
        matchObj.calculateStandings();
    }

    // calculates standings of teams in this division and its points
    public void calculateStandings2(){
        int[] numOfSetWon = {0, 0, 0, 0, 0};
        // looping through match set to get number of wins for each team
        for(int i=0; i<5; i++){
            if (this.matchArr[i].getWinner() == divisionArr[0]){
                numOfSetWon[0]++;
            }
            if (this.matchArr[i].getWinner() == divisionArr[1]){
                numOfSetWon[1]++;
            }
            if (this.matchArr[i].getWinner() == divisionArr[2]){
                numOfSetWon[2]++;
            }
            if (this.matchArr[i].getWinner() == divisionArr[3]){
                numOfSetWon[3]++;
            }
            if (this.matchArr[i].getWinner() == divisionArr[4]){
                numOfSetWon[4]++;
            }
        }
        System.out.println("Standings for " + this.divisionName + ":");
        for(int i=0; i<5; i++){
            System.out.println(this.divisionArr[i].getTeamName()
                    + " won "+ numOfSetWon[i] +" matches.");
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
// addMatch method creates a match object and stores the teams that played and their scores,
    // it also calculates who won, if match cannot be added it will return false
//    public boolean addMatch(String team1, int score1, String team2, int score2){
//        // temporay holders for team object
//        team tempTeam1 = null;
//        team tempTeam2 = null;
//        for(int i=0; i<5; i++){
//            if (this.divisionArr[i].getTeamName() == team1){
//                tempTeam1 = this.divisionArr[i];
//            }
//            else if(this.divisionArr[i].getTeamName() == team2){
//                tempTeam2 = this.divisionArr[i];
//            }
//        }
//        // case if given teams do not exists
//        // program will terminate
//        if ((tempTeam1 == null)||(tempTeam2 == null)){
//            System.out.println("Teams are not present in this division.");
//            return false;
//        }
//        // making a match object
//        set aMatch = new set(tempTeam1, score1, tempTeam2, score2);
//        // adding the match object to matchSetArr
//        for(int i=0; i<5; i++){
//            if (matchSetArr[i] == null){
//                matchSetArr[i] = aMatch;
//                return true;
//            }
//        }
//        System.out.println("Already 5 matches played for "+ this.divisionName);
//        return false;
//    }
    // initiate Match method that holds five sets of game


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //testing methods(please ignore)
    void tst(){
        for(int i=0; i<5; i++){
//            String x = this.divisionArr[i].getTeamName();
//            System.out.println(x);
            this.divisionArr[i].printPlayers();
        }
    }
    public static void main(String[] args) {
        division d = new division("divName");
        d.tst();
    }
    //        automatic team making loop(test code)
//        for(int i=0; i<5; i++){
//            int x = i+1;
//            team t = new team("team"+x);
//            this.divisionArr[i] = t;
//        }
}
