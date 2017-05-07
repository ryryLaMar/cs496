package edu.sdsu.cs;

import java.util.Comparator;

/**
 * Created by rlama on 4/23/2017.
 */
public class ByAttribute implements Comparator<Player> {
    String att;
    public int compare(Player p1, Player p2){
        return p1.getAttribute(att).compareTo(p2.getAttribute(att));
    }
  //  public String[] fastestPlayer();

    /**
     * This Constructor is so it's possible to pass into the Comparator the Attribute the user wants to compare
     * @param attribute
     */
  public ByAttribute(String attribute){
       att = attribute;
  }


}


