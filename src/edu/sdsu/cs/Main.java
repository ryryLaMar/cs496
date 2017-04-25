package edu.sdsu.cs;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String [] args) {
            CSVReader readFile = new CSVReader();
            ArrayList<String[]> rawData = readFile.getRawData("FullData.csv");
            List<Player> players = new ArrayList<>();
            Set<String> positionalSet = new HashSet<>();

            for(String[] line: rawData){
                if(line[4].equals("LB")){
                players.add(new PlayerSorts().makePlayer(line));
                // System.out.println(line[5]);
            }
           for(String line: positionalSet){
                // Return a list of those positions, then sort that list according to whatever index
                //speed is at
               System.out.println(line);
            }

    }
}
