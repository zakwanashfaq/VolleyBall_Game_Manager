/*
 * Zakwan Ashfaq Zian - 201950250 - Wrote the match and division and managed the whole project
 * Fysal Rabbe - 201866571 - Wrote the main and VolleyBall
 * Abdul Shaji - 201956968  - Wrote the team and set
 */
package a4;

public class VolleyBall {
    // Each VolleyBall league gets three divisions
    division division1;
    division division2;
    division division3;

    public VolleyBall(String name1, String name2, String name3) {
        // creating three divisions
        this.division1 = new division(name1);
        this.division2 = new division(name2);
        this.division3 = new division(name3);
    }

    // getting the divisions to add teams and play matches
    public division getDivision1() {
        return division1;
    }

    public division getDivision2() {
        return division2;
    }

    public division getDivision3() {
        return division3;
    }

//    //used to test if all classes are working properly, please check main class
//    public static void main(String[] args) {
//        // a division created with its name as "Division 1"
//        division division1  = new division("Division 1");
//        System.out.println("(Showing what happens in a Division under Normal circumstances)");
//        division1.leagueSetup("Dhaka", "Sylhet", "Chittagong", "Khulna", "Barishal");
//
//        match matchA = division1.initiateMatch();
//        matchA.addMatch("Dhaka",15, "Sylhet", 21);
//        matchA.addMatch("Dhaka",0, "Sylhet", 21);
//        matchA.addMatch("Dhaka",15, "Sylhet", 21); // Sylhet won
//
//        match matchB = division1.initiateMatch();
//        matchB.addMatch("Dhaka",15, "Barishal", 21);
//        matchB.addMatch("Dhaka",5, "Barishal", 21);
//        matchB.addMatch("Dhaka",15, "Barishal", 21); // Barishal Won
//
//        match matchC = division1.initiateMatch();
//        matchC.addMatch("Khulna",21, "Sylhet", 2);
//        matchC.addMatch("Khulna",5, "Sylhet", 21);
//        matchC.addMatch("Khulna",21, "Sylhet", 2);
//        matchC.addMatch("Khulna",5, "Sylhet", 21);
//        // fifth match decided who won as each team won 2 sets
//        matchC.addMatch("Khulna",15, "Sylhet", 21); // Sylhet won
//
//        match matchD = division1.initiateMatch();
//        matchD.addMatch("Dhaka",21, "Chittagong", 10);
//        matchD.addMatch("Dhaka",21, "Chittagong", 15);
//        matchD.addMatch("Dhaka",21, "Chittagong", 4); // Dhaka won
//
//        division1.calculateStandings();
//
//        System.out.println("__________________________________________________________________________");
//        // another division created with its name as "Division 2" to show what happens if points are the same
//        division division2  = new division("Division 2");
//        System.out.println("(Showing what happens if teams Draw)");
//        division2.leagueSetup("Zakwan", "Zian","Ashfaq", "Man","UC");
//
//        match match1 = division2.initiateMatch();
//        match1.addMatch("Zakwan",15, "Zian", 21);
//        match1.addMatch("Zakwan",0, "Zian", 21);
//        match1.addMatch("Zakwan",15, "Zian", 21); // Zian won
//
//        match match2 = division2.initiateMatch();
//        match2.addMatch("Zakwan",15, "UC", 21);
//        match2.addMatch("Zakwan",20, "UC", 21);
//        match2.addMatch("Zakwan",5, "UC", 21); // UC won
//
//        match match3 = division2.initiateMatch();
//        match3.addMatch("Zakwan",5, "Zian", 21);
//        match3.addMatch("Zakwan",21, "Zian", 15);
//        match3.addMatch("Zakwan",5, "Zian", 21);
//        match3.addMatch("Zakwan",21, "Zian", 15);
//        match3.addMatch("Zakwan",5, "Zian", 21); // Zian won
//
//        match match4 = division2.initiateMatch();
//        match4.addMatch("Zakwan",15, "Zian", 0);
//        match4.addMatch("Zakwan",21, "Zian", 0);
//        match4.addMatch("Zakwan",15, "Zian", 0); // Zakwan won
//
//        match match5 = division2.initiateMatch();
//        match5.addMatch("Ashfaq",15, "Zian", 0);
//        match5.addMatch("Ashfaq",21, "Zian", 0);
//        match5.addMatch("Ashfaq",15, "Zian", 0); // Ashfaq won
//
//        match match6 = division2.initiateMatch();
//        match6.addMatch("Zakwan",15, "Man", 21);
//        match6.addMatch("Zakwan",21, "Man", 10);
//        match6.addMatch("Zakwan",15, "Man", 21);
//        match6.addMatch("Zakwan",21, "Man", 10);
//        match6.addMatch("Zakwan",15, "Man", 21); // Man won
//
//        match match7 = division2.initiateMatch();
//        match7.addMatch("Ashfaq",15, "Man", 0);
//        match7.addMatch("Ashfaq",21, "Man", 0);
//        match7.addMatch("Ashfaq",15, "Man", 0); // Ashfaq won
//
//        match match8 = division2.initiateMatch();
//        match8.addMatch("Zakwan",15, "UC", 21);
//        match8.addMatch("Zakwan",16, "UC", 21);
//        match8.addMatch("Zakwan",15, "UC", 21); // UC won
//
//        division2.calculateStandings();
//
//        System.out.println("__________________________________________________________________________");
//
//        division division3 = new division("Division 3");
//        System.out.println("(Showing what happens when matches are added in real time)");
//        division3.leagueSetup("Newfoundland", "Alberta", "Nova Scotia", "Ottawa", "BC");
//
//        match matchV = division3.initiateMatch();
//        matchV.addMatch("Ottawa",21,"Newfoundland", 13);
//        matchV.addMatch("Ottawa",21,"Newfoundland", 12);
//        matchV.addMatch("Ottawa",21,"Newfoundland", 5); // Ottawa
//
//        match matchW = division3.initiateMatch();
//        matchW.addMatch("BC",21,"Newfoundland", 10);
//        matchW.addMatch("BC",21,"Newfoundland", 0);
//        matchW.addMatch("BC",21,"Newfoundland", 15); // BC won
//
//        match matchX = division3.initiateMatch();
//        matchX.addMatch("Newfoundland", 21, "Nova Scotia", 7);
//        matchX.addMatch("Newfoundland", 8, "Nova Scotia", 21);
//        matchX.addMatch("Newfoundland", 21, "Nova Scotia", 5);
//        matchX.addMatch("Newfoundland", 21, "Nova Scotia", 15); // Newfoundland Won
//
//        match matchY = division3.initiateMatch();
//        matchY.addMatch("Alberta", 21, "BC", 15);
//        matchY.addMatch("Alberta", 21, "BC", 10);
//        matchY.addMatch("Alberta", 21, "BC", 20); // Alberta won
//
//        System.out.println("Scenerio: 5th set of the match. Who wins this set, wins the match.");
//        System.out.println("          Also wins the entire Division. (If Draw Newfoundland Wins :D)");
//        match matchZ = division3.initiateMatch();
//        matchZ.addMatch("Newfoundland",21,"Alberta",15);
//        matchZ.addMatch("Newfoundland",10,"Alberta",21);
//        matchZ.addMatch("Newfoundland",21,"Alberta",16);
//        matchZ.addMatch("Newfoundland",20,"Alberta",21);
//        matchZ.addLiveMatch("Newfoundland","Alberta");
//
//        division3.calculateStandings();


//        }
}
