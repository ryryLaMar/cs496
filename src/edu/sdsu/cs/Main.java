package edu.sdsu.cs;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            String attribute = args[0].toLowerCase();
            String filename = args[1];
            CSVReader readFile = new CSVReader();
            ArrayList<String[]> rawData = readFile.getRawData("FullData.csv");
            List<Player> players = new ArrayList<>();
            List<List<Player>> playersByPosition = new ArrayList<>();
            Team bestTeamByAttribute = new Team(filename);
            List<Player> RS = new ArrayList<>();playersByPosition.add(RS);
            List<Player> LS = new ArrayList<>();playersByPosition.add(LS);
            List<Player> RCM = new ArrayList<>();playersByPosition.add(RCM);
            List<Player> CAM = new ArrayList<>();playersByPosition.add(CAM);
            List<Player> LCM = new ArrayList<>();playersByPosition.add(LCM);
            List<Player> RWB = new ArrayList<>();playersByPosition.add(RWB);
            List<Player> RCB = new ArrayList<>();playersByPosition.add(RCB);
            List<Player> CB = new ArrayList<>();playersByPosition.add(CB);
            List<Player> LCB = new ArrayList<>();playersByPosition.add(LCB);
            List<Player> LWB = new ArrayList<>();playersByPosition.add(LWB);
            List<Player> GK = new ArrayList<>();playersByPosition.add(GK);
            List<Player> SUB = new ArrayList<>();playersByPosition.add(SUB);
            List<Player> RES = new ArrayList<>();playersByPosition.add(RES);
            for (String[] line : rawData) {
                line[5] = line[5].toUpperCase();
                if (line[5].equals("LB")||line[5].equals("LCB")) {
                    line[5] = "Left Center Back";
                    LCB.add(new Player().makePlayer(line));
                } else if (line[5].equals("RB")||line[5].equals("RCB")) {
                    line[5] = "Right Center Back";
                    RCB.add(new Player().makePlayer(line));
                } else if (line[5].equals("CDM") || line[5].equals("RDM") || line[5].equals("RM") ||line[5].equals("RCM")) {
                    line[5] = "Right Center Middle";
                    RCM.add(new Player().makePlayer(line));
                } else if (line[5].equals("CF") || line[5].equals("RF") || line[5].equals("RAM") || line[5].equals("CM") ||
                        line[5].equals("LF") || line[5].equals("LAM") || line[5].equals("CAM")) {
                    line[5] = "Center Attacking Middle";
                    CAM.add(new Player().makePlayer(line));
                } else if (line[5].equals("LW")|| line[5].equals("LS")) {
                    line[5] = "Left Striker";
                    LS.add(new Player().makePlayer(line));
                } else if (line[5].equals("RW") || line[5].equals("ST")|| line[5].equals("RS")) {
                    line[5] = "Right Striker";
                    RS.add(new Player().makePlayer(line));
                } else if (line[5].equals("LM") || line[5].equals("LDM")|| line[5].equals("LCM")) {
                    line[5] = "Left Center Middle";
                    LCM.add(new Player().makePlayer(line));
                } else if (line[5].equals("GK")) {
                    line[5] = "GoalKeeper";
                    GK.add(new Player().makePlayer(line));
                } else if (line[5].equals("RES")) {
                    line[5] = "Reserve";
                    RES.add(new Player().makePlayer(line));
                } else if (line[5].equals("SUB")) {
                    line[5] = "Substitute";
                    SUB.add(new Player().makePlayer(line));
                } else if (line[5].equals("LWB")) {
                    line[5] = "Left Wing Back";
                    LWB.add(new Player().makePlayer(line));
                } else if (line[5].equals("RWB")) {
                    line[5] = "Right Wing Back";
                    RWB.add(new Player().makePlayer(line));
                } else {
                    line[5]="Center Back";
                    CB.add(new Player().makePlayer(line));
                }


            }
            bestTeamByAttribute.printBestTeam(playersByPosition, attribute);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

