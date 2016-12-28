package rpg;

import java.util.ArrayList;
import java.util.Random;
public class WeaponDisplay{
    private Weapon weapon;
    private Random rgen;
    public WeaponDisplay(int level){
        rgen = new Random();
        if(rgen.nextInt(5) < 3){
            weapon = new Weapon(level);
        }else{
            weapon = null;
        }
    }

    public Weapon getWeapon(){
        return weapon;
    }
}
