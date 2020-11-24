package a4;
import java.util.ArrayList;

public class division {
    // team name
    private String divisionName;
    // array of 5 teams
    private team[] divisionArr = new team[5];
    // array of 5 match sets initialized with null
//    private set[] matchSetArr = {null, null, null, null, null};
    // array of 5 match sets initialized with null
//    private match[] matchArray = {null, null, null, null, null};
    ArrayList<match> matchArray = new ArrayList<match>();
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
    // initiate Match method that holds five sets of game
    public match initiateMatch(){
        match initMatch = new match(this.divisionArr);
        // hold matches in array to calculate standings
        // need to add arrayList here
       matchArray.add(initMatch);
        return initMatch;
    }
    // calculates matches won by each team
    public void matchWins(){

    }
    // calculates standings of teams in this division and its points
    public void calculateStandings(){
        int[] numOfMatchesWon = {0, 0, 0, 0, 0};
        int[] numOfPoints = {0, 0, 0, 0, 0};
        // looping through match set to get number of matches wins for each team
        for(int i=0; i<this.matchArray.size(); i++){
            if (this.matchArray.get(i).getWinner() == divisionArr[0]){
                numOfMatchesWon[0]++;
            }
            if (this.matchArray.get(i).getWinner() == divisionArr[1]){
                numOfMatchesWon[1]++;
            }
            if (this.matchArray.get(i).getWinner() == divisionArr[2]){
                numOfMatchesWon[2]++;
            }
            if (this.matchArray.get(i).getWinner() == divisionArr[3]){
                numOfMatchesWon[3]++;
            }
            if (this.matchArray.get(i).getWinner() == divisionArr[4]){
                numOfMatchesWon[4]++;
            }
        }
        // looping through teams set to get number of sets wins for each team
        for(int i=0; i<5; i++){
            numOfPoints[i] = this.divisionArr[i].points + numOfMatchesWon[i];
        }
        System.out.println("Standings for " + this.divisionName + ":");
        for(int i=0; i<5; i++){
            System.out.println(this.divisionArr[i].getTeamName()
                    + " won "+ numOfMatchesWon[i] +" matches. Total points(set wins included): " + (numOfPoints[i]));
        }
        System.out.println();
        System.out.print("Winner: ");
        int highest = 0;
        int index = 0;
        for(int i=0; i<5; i++){
            if (numOfPoints[i]>highest){
                highest = numOfPoints[i];
                index = i;
            }
        }
        ArrayList<team> teamArrayForCalculatingDraw = new ArrayList<team>();
        // calculating winner for draw points
        for(int i=0; i<5; i++){
            if (numOfPoints[i]==highest){
                teamArrayForCalculatingDraw.add(this.divisionArr[i]);
            }
        }
        // int array to hold pointDifference for each team drawing
        int[] differnece = new int[teamArrayForCalculatingDraw.size()];
        // initiating with zero
        for(int i=0; i<differnece.length; i++){
            differnece[i] = 0;
        }
        if(teamArrayForCalculatingDraw.size()>1){
            ArrayList<match> matchArrayForCalculatingDraw = new ArrayList<match>();
            for(int i=0; i<teamArrayForCalculatingDraw.size(); i++){
                for(int j=0; j<matchArray.size(); j++){
                    if (matchArray.get(j).getWinner() == teamArrayForCalculatingDraw.get(i)){
                        differnece[i] = differnece[i] + matchArray.get(j).wonByDifference();
                    }
                }
            }
            int highestDrawSet = 0;
            int indexSet = 0;
            for(int i=0; i<differnece.length; i++){
                if (differnece[i] > highestDrawSet){
                    highestDrawSet = differnece[i];
                    indexSet = i;
                }
            }
            System.out.print(teamArrayForCalculatingDraw.get(indexSet).getTeamName()+". ");
            System.out.print("With a highest point difference of "+ differnece[indexSet]);
            System.out.println();
            return;
        }


        System.out.print(this.divisionArr[index].getTeamName());
        System.out.println();
    }



///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // tst code to check if division class is working properly
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
