package edu.sdsu.cs;

import edu.sdsu.cs.Player;

/**
 * Created by rlama on 4/24/2017.
 */
public class PlayerSorts {
    public Player makePlayer(String[] currentPlayer){
        String name = currentPlayer[0];
        String nationality = currentPlayer[1];
        String position = currentPlayer[5];
        String preferredFoot = currentPlayer[12];
        int overallRating = Integer.parseInt(currentPlayer[9]);
        int age = Integer.parseInt(currentPlayer[14]);
        int ballControl = Integer.parseInt(currentPlayer[19]);
        int dribbling = Integer.parseInt(currentPlayer[20]);
        int marking = Integer.parseInt(currentPlayer[21]);
        int slideTackling = Integer.parseInt(currentPlayer[22]);
        int standingTackle = Integer.parseInt(currentPlayer[23]);
        int aggression = Integer.parseInt(currentPlayer[24]);
        int reactions = Integer.parseInt(currentPlayer[25]);
        int attacking_position = Integer.parseInt(currentPlayer[26]);
        int interceptions = Integer.parseInt(currentPlayer[27]);
        int vision = Integer.parseInt(currentPlayer[28]);
        int composure = Integer.parseInt(currentPlayer[29]);
        int crossing = Integer.parseInt(currentPlayer[30]);
        int shortPass =Integer.parseInt(currentPlayer[31]);
        int longPass = Integer.parseInt(currentPlayer[32]);
        int acceleration= Integer.parseInt(currentPlayer[33]);
        int speed=Integer.parseInt(currentPlayer[34]);
        int stamina=Integer.parseInt(currentPlayer[35]);
        int strength=Integer.parseInt(currentPlayer[36]);
        int balance=Integer.parseInt(currentPlayer[37]);
        int agility=Integer.parseInt(currentPlayer[38]);
        int jumping=Integer.parseInt(currentPlayer[39]);
        int heading=Integer.parseInt(currentPlayer[40]);
        int shotPower=Integer.parseInt(currentPlayer[41]);
        int finishing=Integer.parseInt(currentPlayer[42]);
        int longShots=Integer.parseInt(currentPlayer[43]);
        int curve=Integer.parseInt(currentPlayer[44]);
        int freekickAccuracy=Integer.parseInt(currentPlayer[45]);
        int penalties=Integer.parseInt(currentPlayer[46]);
        int volley=Integer.parseInt(currentPlayer[47]);
        int gkPositioning=Integer.parseInt(currentPlayer[48]);
        int gkDiving=Integer.parseInt(currentPlayer[49]);
        int gkKicking=Integer.parseInt(currentPlayer[50]);
        int gkHandling=Integer.parseInt(currentPlayer[51]);
        int gkReflexes=Integer.parseInt(currentPlayer[52]);
        return new Player(name,nationality, position, preferredFoot,overallRating
        , age, ballControl, dribbling, marking, slideTackling, standingTackle,
                aggression, reactions, attacking_position, interceptions, vision,
                composure, crossing, shortPass, longPass, acceleration, speed, stamina,
                strength, balance, agility, jumping, heading, shotPower, finishing,
                longShots, curve, freekickAccuracy, penalties, volley, gkPositioning,
                gkDiving, gkKicking, gkHandling, gkReflexes);
    }
}
