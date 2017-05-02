package edu.sdsu.cs;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        try {
            String attribute = args[0];

            if(args.length>1){
                attribute =attribute +  " "  + (args[1]);
            }
            CSVReader readFile = new CSVReader();
            ArrayList<String[]> rawData = readFile.getRawData("FullData.csv");
            List<Player> players = new ArrayList<>();
            List<List<Player>> playersByPosition = new ArrayList<>();
            Set<String> positionalSet = new HashSet<>();
            Team bestTeam = new Team();
            List<Player> GK = new ArrayList<>(); playersByPosition.add(GK); // todo order this list better. Make GUI?
            List<Player> LCB = new ArrayList<>(); playersByPosition.add(LCB);
            List<Player> RES = new ArrayList<>(); playersByPosition.add(RES);
            List<Player> SUB = new ArrayList<>(); playersByPosition.add(SUB);
            List<Player> RS = new ArrayList<>(); playersByPosition.add(RS);
            List<Player> LS = new ArrayList<>(); playersByPosition.add(LS);
            List<Player> RCM = new ArrayList<>(); playersByPosition.add(RCM);
            List<Player> CAM = new ArrayList<>(); playersByPosition.add(CAM);
            List<Player> LCM = new ArrayList<>(); playersByPosition.add(LCM);
            List<Player> LWB = new ArrayList<>(); playersByPosition.add(LWB);
            List<Player> RWB = new ArrayList<>(); playersByPosition.add(RWB);
            List<Player> RCB = new ArrayList<>(); playersByPosition.add(RCB);
            List<Player> CB = new ArrayList<>(); playersByPosition.add(CB);
            for (String[] line : rawData) {
               line[5] = line[5].toUpperCase();
                if (line[5].equals("LB")) {
                    line[5] = "LCB";
                    LCB.add(new Player().makePlayer(line));
                } else if (line[5].equals("RB")) {
                    line[5] = "RCB";
                    RCB.add(new Player().makePlayer(line));
                } else if (line[5].equals("CDM") || line[5].equals("RDM") || line[5].equals("RM")) {
                    line[5] = "RCM";
                    RCM.add(new Player().makePlayer(line));
                } else if (line[5].equals("CF") || line[5].equals("RF") || line[5].equals("RAM") || line[5].equals("CM") ||
                        line[5].equals("LF") || line[5].equals("LAM")) {
                    line[5] = "CAM";
                    CAM.add(new Player().makePlayer(line));
                } else if (line[5].equals("LW")) {
                    line[5] = "LS";
                    LS.add(new Player().makePlayer(line));
                } else if (line[5].equals("RW") || line[5].equals("ST")) {
                    line[5] = "RS";
                    RS.add(new Player().makePlayer(line));
                } else if (line[5].equals("LM") || line[5].equals("LDM")) {
                    line[5] = "LCM";
                    LCM.add(new Player().makePlayer(line));
                } else if (line[5].equals("GK")) {
                    GK.add(new Player().makePlayer(line));
                } else if(line[5].equals("RES")) {
                    RES.add(new Player().makePlayer(line));
                } else if(line[5].equals("SUB")) {
                    SUB.add(new Player().makePlayer(line));
                } else if(line[5].equals("LWB")) {
                    LWB.add(new Player().makePlayer(line));
                } else if(line[5].equals("RWB")){
                    RWB.add(new Player().makePlayer(line));
                } else {
                    CB.add(new Player().makePlayer(line));
                }


            }
            for(List position: playersByPosition) {
                bestTeam.getBestPlayer(position, attribute);
           }
           System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
