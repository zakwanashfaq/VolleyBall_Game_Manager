package a4;

public class team {
    // team name
    private String name;
    // array of 12 player
    private String[] playerArray = new String[12];
    // two coaches
    private String coach1 = "Coach1";
    private String coach2 = "Coach2";
    // constructor for team
    public team(String n){
        // giving the team a name
        this.name = n;
        // adding 12 players
        for(int i=0;i<12;i++){
            int x  = i+1;
            playerArray[i] = "player"+x;
        }
    }
    // getters and setters
    public String getTeamName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPlayerArray(int index) {
        return playerArray[index];
    }
    public void changePlayer(String player, int index) {
        this.playerArray[index] = player;
    }
    public String getCoach1() {
        return coach1;
    }
    public void setCoach1(String coach1) {
        this.coach1 = coach1;
    }
    public String getCoach2() {
        return coach2;
    }
    public void setCoach2(String coach2) {
        this.coach2 = coach2;
    }

    void printPlayers(){
        System.out.println(this.name+"(players) :");
        for(int i=0;i<12;i++){
            System.out.print(playerArray[i]+" ");
        }
        System.out.println();
    }

    //getters


    // main method to test team class
    public static void main(String[] args) {
        team t = new team("Zaksan");
        t.printPlayers();
        t.changePlayer("Zakan",0);
        t.printPlayers();

    }
}
