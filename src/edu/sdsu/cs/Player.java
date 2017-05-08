package edu.sdsu.cs;

import java.util.HashMap;
import java.util.Map;

/***
 * Player Class makes each line in the CSV file a Player with fields being the players ratings for their attributes
 * name, nationality, position, and preferred foot won't be used for comparison. They will be used for
 * providing a detailed description of the player when producing output
 * Created by rlama on 4/24/2017.
 */
public class Player {
    String name = "";
    String nationality = "";
    String position = "";
    String preferredFoot;
    int overallRating;
    int age;
    int ballControl;
    int dribbling;
    int marking;
    int slideTackling;
    int standingTackle;
    int aggression;
    int reactions;
    int attacking_position;
    int interceptions;
    int vision;
    int composure;
    int crossing;
    int shortPass;
    int longPass;
    int acceleration;
    int speed;
    int stamina;
    int strength;
    int balance;
    int agility;
    int jumping;
    int heading;
    int shotPower;
    int finishing;
    int longShots;
    int curve;
    int freekickAccuracy;
    int penalties;
    int volley;
    int gkPositioning;
    int gkDiving;
    int gkKicking;
    int gkHandling;
    int gkReflexes;

    /**
     * all the getters and setters.
     * Setters aren't necessary, but they were generated and deleting them doesn't seem necessary. They could
     * be useful for other projects
     * @param name
     */
    public void setName(String name) {this.name = name;}
    public String getName(){ return name;}

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPosition() {
        return position;
    }

    public void setPostion(String position) {
        this.position = position;
    }

    public String getPreferredFoot() {
        return preferredFoot;
    }

    public void setPreferredFoot(String preferredFoot) {
        this.preferredFoot = preferredFoot;
    }

    public int getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(int overallRating) {
        this.overallRating = overallRating;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBallControl() {
        return ballControl;
    }

    public void setBallControl(int ballControl) {
        this.ballControl = ballControl;
    }

    public int getDribbling() {
        return dribbling;
    }

    public void setDribbling(int dribbling) {
        this.dribbling = dribbling;
    }

    public int getMarking() {
        return marking;
    }

    public void setMarking(int marking) {
        this.marking = marking;
    }

    public int getSlideTackling() {
        return slideTackling;
    }

    public void setSlideTackling(int slideTackling) {
        this.slideTackling = slideTackling;
    }

    public int getStandingTackle() {
        return standingTackle;
    }

    public void setStandingTackle(int standingTackle) {
        this.standingTackle = standingTackle;
    }

    public int getAggression() {
        return aggression;
    }

    public void setAggression(int aggression) {
        this.aggression = aggression;
    }

    public int getReactions() {
        return reactions;
    }

    public void setReactions(int reactions) {
        this.reactions = reactions;
    }

    public int getAttacking_position() {
        return attacking_position;
    }

    public void setAttacking_position(int attacking_position) {
        this.attacking_position = attacking_position;
    }

    public int getInterceptions() {
        return interceptions;
    }

    public void setInterceptions(int interceptions) {
        this.interceptions = interceptions;
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }

    public int getComposure() {
        return composure;
    }

    public void setComposure(int composure) {
        this.composure = composure;
    }

    public int getCrossing() {
        return crossing;
    }

    public void setCrossing(int crossing) {
        this.crossing = crossing;
    }

    public int getShortPass() {
        return shortPass;
    }

    public void setShortPass(int shortPass) {
        this.shortPass = shortPass;
    }

    public int getLongPass() {
        return longPass;
    }

    public void setLongPass(int longPass) {
        this.longPass = longPass;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getJumping() {
        return jumping;
    }

    public void setJumping(int jumping) {
        this.jumping = jumping;
    }

    public int getHeading() {
        return heading;
    }

    public void setHeading(int heading) {
        this.heading = heading;
    }

    public int getShotPower() {
        return shotPower;
    }

    public void setShotPower(int shotPower) {
        this.shotPower = shotPower;
    }

    public int getFinishing() {
        return finishing;
    }

    public void setFinishing(int finishing) {
        this.finishing = finishing;
    }

    public int getLongShots() {
        return longShots;
    }

    public void setLongShots(int longShots) {
        this.longShots = longShots;
    }

    public int getCurve() {
        return curve;
    }

    public void setCurve(int curve) {
        this.curve = curve;
    }

    public int getFreekickAccuracy() {
        return freekickAccuracy;
    }

    public void setFreekickAccuracy(int freekickAccuracy) {
        this.freekickAccuracy = freekickAccuracy;
    }

    public int getPenalties() {
        return penalties;
    }

    public void setPenalties(int penalties) {
        this.penalties = penalties;
    }

    public int getVolley() {
        return volley;
    }

    public void setVolley(int volley) {
        this.volley = volley;
    }

    public int getGkPositioning() {
        return gkPositioning;
    }

    public void setGkPositioning(int gkPositioning) {
        this.gkPositioning = gkPositioning;
    }

    public int getGkDiving() {
        return gkDiving;
    }

    public void setGkDiving(int gkDiving) {
        this.gkDiving = gkDiving;
    }

    public int getGkKicking() {
        return gkKicking;
    }

    public void setGkKicking(int gkKicking) {
        this.gkKicking = gkKicking;
    }

    public int getGkHandling() {
        return gkHandling;
    }

    public void setGkHandling(int gkHandling) {
        this.gkHandling = gkHandling;
    }

    public int getGkReflexes() {
        return gkReflexes;
    }

    public void setGkReflexes(int gkReflexes) {
        this.gkReflexes = gkReflexes;
    }

    /**
     * Constructor
     * @param name
     * @param nation
     * @param foot
     * @param position
     * @param overallRating
     * @param age
     * @param ballControl
     * @param dribbling
     * @param marking
     * @param slideTackle
     * @param standingTackle
     * @param aggression
     * @param reactions
     * @param attacking_position
     * @param interceptions
     * @param vision
     * @param composure
     * @param crossing
     * @param shortPass
     * @param longPass
     * @param acceleration
     * @param speed
     * @param stamina
     * @param strength
     * @param balance
     * @param agility
     * @param jumping
     * @param heading
     * @param shotPower
     * @param finishing
     * @param longShots
     * @param curve
     * @param freekickAccuracy
     * @param penalties
     * @param volley
     * @param gkPositioning
     * @param gkDiving
     * @param gkKicking
     * @param gkHandling
     * @param gkReflexes
     */
    public Player(String name, String nation, String foot, String position, int overallRating, int age, int ballControl,
                  int dribbling, int marking, int slideTackle, int standingTackle, int aggression, int reactions,
                  int attacking_position, int interceptions, int vision, int composure, int crossing, int shortPass,
                  int longPass, int acceleration, int speed, int stamina, int strength, int balance, int agility,
                  int jumping, int heading, int shotPower, int finishing, int longShots, int curve, int freekickAccuracy,
                  int penalties, int volley, int gkPositioning, int gkDiving, int gkKicking, int gkHandling, int gkReflexes) {

        this.name = name;
        this.position = position;
        this.nationality = nation;
        this.preferredFoot = foot;
        this.overallRating = overallRating;
        this.age = age;
        this.ballControl = ballControl;
        this.dribbling = dribbling;
        this.marking = marking;
        this.slideTackling = slideTackle;
        this.standingTackle = standingTackle;
        this.aggression = aggression;
        this.reactions = reactions;
        this.attacking_position = attacking_position;
        this.interceptions = interceptions;
        this.vision = vision;
        this.composure = composure;
        this.crossing = crossing;
        this.shortPass = shortPass;
        this.longPass = longPass;
        this.acceleration = acceleration;
        this.speed = speed;
        this.stamina = stamina;
        this.strength = strength;
        this.balance = balance;
        this.agility = agility;
        this.jumping = jumping;
        this.heading = heading;
        this.shotPower = shotPower;
        this.finishing = finishing;
        this.longShots = longShots;
        this.curve = curve;
        this.freekickAccuracy = freekickAccuracy;
        this.penalties = penalties;
        this.volley = volley;
        this.gkPositioning = gkPositioning;
        this.gkDiving = gkDiving;
        this.gkKicking = gkKicking;
        this.gkHandling = gkHandling;
        this.gkReflexes = gkReflexes;

    }
    public Player(){}

    /**
     * Make player is responsible for returning a Player with all necessary attributes.
     * return calls the constructor that assigns all attributes.
     * @param currentPlayer
     * @return
     */
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
        return new Player(name,nationality, preferredFoot, position,overallRating
                , age, ballControl, dribbling, marking, slideTackling, standingTackle,
                aggression, reactions, attacking_position, interceptions, vision,
                composure, crossing, shortPass, longPass, acceleration, speed, stamina,
                strength, balance, agility, jumping, heading, shotPower, finishing,
                longShots, curve, freekickAccuracy, penalties, volley, gkPositioning,
                gkDiving, gkKicking, gkHandling, gkReflexes);

    }

    /**
     * Map associates the string with the integer value, so comparisons are made easy
     * @param att
     * @return
     */
    public Integer getAttribute(String att){
        // todo finish this map
        Map<String, Integer> playerAttributes = new HashMap<>();
        playerAttributes.put("speed", getSpeed());
        playerAttributes.put("interceptions", getInterceptions());
        playerAttributes.put("agility", getAgility());
        playerAttributes.put("vision", getVision());
        playerAttributes.put("overall rating", getOverallRating());
        playerAttributes.put("composure", getComposure());
        playerAttributes.put("age", getAge());
        playerAttributes.put("crossing", getCrossing());
        playerAttributes.put("ball control", getBallControl());
        playerAttributes.put("short pass", getShortPass());
        playerAttributes.put("dribbling", getDribbling());
        playerAttributes.put("long pass", getLongPass());
        playerAttributes.put("marking", getMarking());
        playerAttributes.put("acceleration", getAcceleration());
        playerAttributes.put("slide tackling", getSlideTackling());
        playerAttributes.put("stamina", getStamina());
        playerAttributes.put("standing tackle", getStandingTackle());
        playerAttributes.put("strength", getStrength());
        playerAttributes.put("aggression", getAggression());
        playerAttributes.put("balance", getBalance());
        playerAttributes.put("reactions", getReactions());
        playerAttributes.put("jumping", getJumping());
        playerAttributes.put("attacking position", getAttacking_position());
        playerAttributes.put("heading", getHeading());
        playerAttributes.put("shot power", getShotPower());
        playerAttributes.put("finishing", getFinishing());
        playerAttributes.put("long shots", getLongShots());
        playerAttributes.put("curve", getCurve());
        playerAttributes.put("free kick accuracy", getFreekickAccuracy());
        playerAttributes.put("penalties", getPenalties());
        playerAttributes.put("volley", getVolley());
        playerAttributes.put("gk positioning", getGkPositioning());
        playerAttributes.put("gk diving", getGkDiving());
        playerAttributes.put("gk kicking", getGkKicking());
        playerAttributes.put("gk handling", getGkHandling());
        playerAttributes.put("gk reflexes", getGkReflexes());
        return playerAttributes.get(att);
    }
}
