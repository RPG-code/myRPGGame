package rpg;

import java.util.ArrayList;
public class Room{
    private String name;
    private ArrayList<Chest> chests;
    private ArrayList<WeaponRack> racks;
    private ArrayList<WeaponDisplay> displays;
    private ArrayList<Mannequin> mannequins;
    private FileRead reader;
    public Room(int level, String type){
        name = type;
        chests = new ArrayList<>();
        racks = new ArrayList<>();
        displays = new ArrayList<>();
        mannequins = new ArrayList<>();
        reader = new FileRead();
        String[] roomInfo = reader.roomReader(type);
        for(int i = 0; i < Integer.parseInt(roomInfo[1]); i++){
            chests.add(new Chest(type, level));
        }
        for(int i = 0; i < Integer.parseInt(roomInfo[2]); i++){
            racks.add(new WeaponRack(level));
        }
        for(int i = 0; i < Integer.parseInt(roomInfo[3]); i++){
            displays.add(new WeaponDisplay(level));
        }
        for(int i = 0; i < Integer.parseInt(roomInfo[4]); i++){
            mannequins.add(new Mannequin(level));
        }
    }

    public ArrayList<Chest> getChests(){
        return chests;
    }

    public ArrayList<WeaponDisplay> getDisplays(){
        return displays;
    }

    public ArrayList<WeaponRack> getRacks(){
        return racks;
    }

    public ArrayList<Mannequin> getMannequins(){
        return mannequins;
    }

    public String getName(){
        return name;
    }
}
