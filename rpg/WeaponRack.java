package rpg;

import java.util.ArrayList;
import java.util.Random;
public class WeaponRack{
    private ArrayList<Weapon> weapons;
    private Random rgen;
    public WeaponRack(int level){
        rgen = new Random();
        weapons = new ArrayList<>();
        for(int i = 0; i < rgen.nextInt(6); i++){
            weapons.add(new Weapon(level));
        }
    }

    public ArrayList<Weapon> getWeapons(){
        return weapons;
    }
}
