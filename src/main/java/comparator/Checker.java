package comparator;

import java.util.Comparator;

/**
 * Created by vallus on 10/05/17.
 */
public class Checker implements Comparator<Player> {

    public int compare(Player p1, Player p2) {
        int diff = p1.getScore() - p2.getScore();
        if(diff==0) {
            return p1.getName().compareTo(p2.getName());
        }
        else {
            return diff;
        }
    }
}
