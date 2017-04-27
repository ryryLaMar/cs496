package edu.sdsu.cs;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        try {
            String attribute = args[0];


            CSVReader readFile = new CSVReader();
            ArrayList<String[]> rawData = readFile.getRawData("FullData.csv");
            List<Player> players = new ArrayList<>();
            Set<String> positionalSet = new HashSet<>();

            for (String[] line : rawData) {
               line[5] = line[5].toUpperCase();
                if (line[5].equals("LB")) {
                    line[5] = "LCB";
                    players.add(new Player().makePlayer(line));
                    positionalSet.add(line[5]);
                } else if (line[5].equals("RB")) {
                    line[5] = "RCB";
                    players.add(new PlayerSorts().makePlayer(line));
                    positionalSet.add(line[5]);
                } else if (line[5].equals("CDM") || line[5].equals("RDM") || line[5].equals("RM")) {
                    line[5] = "RCM";
                    players.add(new PlayerSorts().makePlayer(line));
                    positionalSet.add(line[5]);
                } else if (line[5].equals("CF") || line[5].equals("RF") || line[5].equals("RAM") || line[5].equals("CM") ||
                        line[5].equals("LF") || line[5].equals("LAM")) {
                    line[5] = "CAM";
                    players.add(new PlayerSorts().makePlayer(line));
                    positionalSet.add(line[5]);
                } else if (line[5].equals("LW")) {
                    line[5] = "LS";
                    players.add(new PlayerSorts().makePlayer(line));
                    positionalSet.add(line[5]);
                } else if (line[5].equals("RW") || line[5].equals("ST")) {
                    line[5] = "RS";
                    players.add(new PlayerSorts().makePlayer(line));
                    positionalSet.add(line[5]);
                } else if (line[5].equals("LM") || line[5].equals("LDM")) {
                    line[5] = "LCM";
                    players.add(new PlayerSorts().makePlayer(line));
                    positionalSet.add(line[5]);
                } else {
                    players.add(new PlayerSorts().makePlayer(line));
                    positionalSet.add(line[5]);
                }
            }
            // System.out.println(line[5]);
            for (String position: positionalSet) {

                System.out.println(position);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
