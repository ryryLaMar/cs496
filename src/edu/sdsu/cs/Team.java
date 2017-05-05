package edu.sdsu.cs;

import java.util.Collections;
import java.util.List;

/**
 * Created by rlama on 4/29/2017.
 */
public class Team {
    public void getBestPlayer(List p,String a){
        // todo Write this bitch to a file!!!
        List<Player> position = p;
        Collections.sort(position, new ByAttribute(a));
        System.out.print(position.get(position.size()-1).getPosition()+ " ");
        System.out.print(position.get(position.size()-1).getName() + " ");
        System.out.println(position.get(position.size()-1).getAttribute(a));

    }
}
