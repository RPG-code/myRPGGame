package rpg;

public class WeaponStyle{
    private String style;
    private int offense;
    private int defense;
    private int speed;
    private int range;
    private int mobility;
    public WeaponStyle(String[] weapon){
        style = weapon[0];
        offense = Integer.parseInt(weapon[1]);
        defense = Integer.parseInt(weapon[2]);
        speed = Integer.parseInt(weapon[3]);
        range = Integer.parseInt(weapon[4]);
        mobility = Integer.parseInt(weapon[5]);
    }

    public String getStyle(){
        return style;
    }

    public int getOffense(){
        return offense;
    }

    public int getDefense(){
        return defense;
    }

    public int getSpeed(){
        return speed;
    }

    public int getRange(){
        return range;
    }

    public int getMobility(){
        return mobility;
    }
}
