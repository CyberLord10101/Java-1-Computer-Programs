import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;


public class Bowling {
    HashMap<String, Integer> players;
    Bowling(){
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p){
        players.put(name, p);
    }
    public String getWinner(){
        Integer max = Collections.max(players.values());
        String winner = "";
        for(Entry<String, Integer> entry: players.entrySet()){

            if(entry.getValue() == max){
                winner = entry.getKey();
            }

        }
        return "The winner is " + winner + "!!! Congrats!!";
    }
}
