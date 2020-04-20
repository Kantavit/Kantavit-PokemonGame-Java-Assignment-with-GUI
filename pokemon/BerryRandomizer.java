import java.util.*;

public class BerryRandomizer{
    public static ArrayList<Berry> getBerries(int num){
        ArrayList<Berry> berries = new ArrayList<Berry>();
        if(num < 1){
            return berries;
        }

        int berriesNumber = (int)(Math.random() * num) + 1;
        
        for(int i = 0; i < berriesNumber; i++){
            int type = (int)(Math.random() * 3);
            if(type == 0){
                berries.add(new LeppaBerry("Leppa Berry"));
            }else if(type == 1){
                berries.add(new OranBerry("Oran Berry"));
            }else if(type == 2){
                berries.add(new SitrusBerry("Sitrus Berry"));
            }
        }
        return berries;
    }
}