package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Oscar";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "obenedek20";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f24-08");
        team.addMember("Christy");
        team.addMember("Mike");
        team.addMember("Caleb");
        team.addMember("Divyani");
        team.addMember("Amber");
        team.addMember("Oscar");
        return team;
    }
}
