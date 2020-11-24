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
        match2.addMatch("Zakwan",15, "UC", 225);
        match2.addMatch("Zakwan",35, "UC", 225);
        match2.addMatch("Zakwan",15, "UC", 225);

        match match3 = division1.initiateMatch();
        match3.addMatch("Zakwan",15, "Zian", 25);
        match3.addMatch("Zakwan",35, "Zian", 25);
        match3.addMatch("Zakwan",15, "Zian", 25);
        match3.addMatch("Zakwan",35, "Zian", 25);
        match3.addMatch("Zakwan",15, "Zian", 25); // t2 won

        match match4 = division1.initiateMatch();
        match4.addMatch("Zakwan",15, "Zian", 0);
        match4.addMatch("Zakwan",35, "Zian", 0);
        match4.addMatch("Zakwan",15, "Zian", 0); // t1 won

        match match5 = division1.initiateMatch();
        match5.addMatch("Ashfaq",15, "Zian", 0);
        match5.addMatch("Ashfaq",35, "Zian", 0);
        match5.addMatch("Ashfaq",15, "Zian", 0); // t1 won

        match match6 = division1.initiateMatch();
        match6.addMatch("Zakwan",15, "Man", 25);
        match6.addMatch("Zakwan",35, "Man", 25);
        match6.addMatch("Zakwan",15, "Man", 25);
        match6.addMatch("Zakwan",35, "Man", 25);
        match6.addMatch("Zakwan",15, "Man", 25); // t2 won

        match match7 = division1.initiateMatch();
        match7.addMatch("Zakwan",15, "Man", 0);
        match7.addMatch("Zakwan",35, "Man", 0);
        match7.addMatch("Zakwan",15, "Man", 0); // t1 won

        match match8 = division1.initiateMatch();
        match8.addMatch("Ashfaq",15, "Man", 0);
        match8.addMatch("Ashfaq",35, "Man", 0);
        match8.addMatch("Ashfaq",15, "Man", 0); // t1 won

        match match9 = division1.initiateMatch();
        match9.addMatch("Zakwan",15, "UC", 100);
        match9.addMatch("Zakwan",35, "UC", 100);
        match9.addMatch("Zakwan",15, "UC", 100); // t1 won

        division1.calculateStandings();

    }
}
