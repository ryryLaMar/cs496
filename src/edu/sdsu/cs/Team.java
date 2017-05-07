package edu.sdsu.cs;

import java.io.*;
import java.util.Collections;
import java.util.List;

/**
 * Created by rlama on 4/29/2017.
 */
public class Team {
    private String filename;

    /***
     * Purpose of Team class is for writing the resulting output to a file.
     * Takes in the list of Players for each position
     * String a is for attribute
     *
     * @param p
     * @param a
     */

    public void printBestTeam(List<List<Player>> p, String a) {
        try {
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filename)));
        for(List position: p)
        {
            List<Player> positions = position;
            Collections.sort(position, new ByAttribute(a));
            bw.write("Position: ");
            bw.write(String.format("%-25s",positions.get(position.size() - 1).getPosition()));
            bw.write("Name: ");
            bw.write(String.format("%-26s",positions.get(position.size() - 1).getName()));
            bw.write("Country of Origin: ");
            bw.write(String.format("%-20s",positions.get(position.size() - 1).getNationality()));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Enter valid filename. If attribute is two words, type as one with no spaces");
        } catch (IOException e) {
            System.out.println("Enter valid filename. If attribute is two words, type as one with no spaces");
        }

        }
    public Team(String f) {
        filename = f;
    }
}


