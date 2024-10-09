package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;
    Team team2;

    @BeforeEach
    public void setup() {
        team = new Team("test-team"); 
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_same_obj() {
        assertTrue(team.equals(team));
    }

    @Test
    public void equals_not_same_obj() {
        Object o = new Object();
        assertFalse(team.equals(o));
    }

    @Test
    public void equals_same_name_diff_members() {
        team2 = new Team("test-team");
        team2.addMember("diff_member");
        assertFalse(team.equals(team2));
    }

    @Test
    public void equals_same_name_same_members() {
        team2 = new Team("test-team");
        team2.setMembers(team.getMembers());
        assertTrue(team.equals(team2));
    }

    @Test
    public void equals_diff_name_same_members() {
        team2 = new Team("test-name-2");
        team2.setMembers(team.getMembers());
        assertFalse(team.equals(team2));
    }

    @Test
    public void equals_diff_name_diff_members() {
        team2 = new Team("test-name-2");
        team2.addMember("diff_member");
        assertFalse(team.equals(team2));
    }

}
