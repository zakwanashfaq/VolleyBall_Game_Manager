package a4;

public class VollyBall {
    public static void main(String[] args) {
        division division1  = new division("Division 1(Test)");
        division1.leagueSetup("Zakwan", "Zian","Ashfaq", "Man","UC");
        match match1 = division1.initiateMatch();
        match1.addMatch("Zakwan",15, "Zian", 25);
        match1.addMatch("Zakwan",35, "Zian", 25);
        match1.addMatch("Zakwan",15, "Zian", 25);
        match1.addMatch("Zakwan",35, "Zian", 25);
        match1.addMatch("Zakwan",15, "Zian", 25); // t2 won

        match match2 = division1.initiateMatch();
        match1.addMatch("Zakwan",15, "Zian", 25);
        match1.addMatch("Zakwan",35, "Zian", 25);
        match1.addMatch("Zakwan",15, "Zian", 25);
        match1.addMatch("Zakwan",35, "Zian", 25);
        match1.addMatch("Zakwan",15, "Zian", 25); // t2 won

        match match3 = division1.initiateMatch();
        match1.addMatch("Zakwan",15, "Zian", 25);
        match1.addMatch("Zakwan",35, "Zian", 25);
        match1.addMatch("Zakwan",15, "Zian", 25);
        match1.addMatch("Zakwan",35, "Zian", 25);
        match1.addMatch("Zakwan",15, "Zian", 25); // t2 won

        match match4 = division1.initiateMatch();
        match1.addMatch("Zakwan",15, "Zian", 0);
        match1.addMatch("Zakwan",35, "Zian", 0);
        match1.addMatch("Zakwan",15, "Zian", 0); // t1 won

        match match5 = division1.initiateMatch();
        match1.addMatch("Zakwan",15, "Zian", 0);
        match1.addMatch("Zakwan",35, "Zian", 0);
        match1.addMatch("Zakwan",15, "Zian", 0); // t1 won

        division1.calculateStandings();

    }
}
