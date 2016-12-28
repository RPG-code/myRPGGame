package rpg;

import java.util.ArrayList;
import java.util.Random;
public class Chest{
    private ArrayList<Weapon> weapons;
    private ArrayList<Armor> armor;
    private Random rgen;
    public Chest(String location, int level){
        weapons = new ArrayList<>();
        armor = new ArrayList<>();
        rgen = new Random();
        if(location.equals("Blacksmith")){
            for(int i = 0; i < rgen.nextInt(8); i++){
                weapons.add(new Weapon(1 + rgen.nextInt(2)));
            }
            for(int i = 0; i < rgen.nextInt(10); i++){
                armor.add(new Armor(1 + rgen.nextInt(2)));
            }
        }
        if(location.equals("Merchant Shop")){
            for(int i = 0; i < rgen.nextInt(6); i++){
                weapons.add(new Weapon(1 + rgen.nextInt(1)));
            }
            for(int i = 0; i < rgen.nextInt(6); i++){
                armor.add(new Armor(1 + rgen.nextInt(1)));
            }
        }
        if(location.equals("Armory")){
            for(int i = 0; i < rgen.nextInt(11); i++){
                weapons.add(new Weapon(level));
            }
            for(int i = 0; i < rgen.nextInt(16); i++){
                armor.add(new Armor(level));
            }
        }
        if(location.equals("Guard Room")){
            for(int i = 0; i < rgen.nextInt(5); i++){
                weapons.add(new Weapon(level));
            }
            for(int i = 0; i < rgen.nextInt(5); i++){
                armor.add(new Armor(level));
            }
        }
        if(location.equals("Barracks")){
            for(int i = 0; i < rgen.nextInt(3); i++){
                weapons.add(new Weapon(level));
            }
            for(int i = 0; i < rgen.nextInt(6); i++){
                armor.add(new Armor(level));
            }
        }
    }

    public ArrayList<Weapon> getWeapons(){
        return weapons;
    }

    public ArrayList<Armor> getArmor(){
        return armor;
    }
}
