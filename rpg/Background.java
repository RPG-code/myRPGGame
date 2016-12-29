
/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background
{
    private String story;
    private String primaryBuff;
    private String secondaryBuff;
    private String primaryDeBuff;
    private Armor chest;
    private Armor head;
    private Armor legs;
    private Armor arms;
    private Armor feet;
    private Weapon weapon1;
    private Weapon weapon2;
    public Background(String[] life)
    {
        story = life[0];
        primaryBuff = life[1];
        secondaryBuff = life[2];
        primaryDeBuff = life[3];
        chest = new Armor(life[4], life[5]);
        head = new Armor(life[6], life[7]);
        legs = new Armor(life[8], life[9]);
        arms = new Armor(life[10], life[11]);
        feet = new Armor(life[12], life[13]);
        weapon1 = new Weapon(life[14]);
        if(life[15].equals("null")){
            weapon2 = null;
        }else{
            weapon2 = new Weapon(life[15]);
        }
    }

    public String getStory(){
        return story;
    }

    public String getPrimaryBuff(){
        return primaryBuff;
    }

    public String getSecondaryBuff(){
        return secondaryBuff;
    }

    public String getPrimaryDeBuff(){
        return primaryDeBuff;
    }

    public Armor getChest(){
        return chest;
    }

    public Armor getHead(){
        return head;
    }

    public Armor getLegs(){
        return legs;
    }

    public Armor getArms(){
        return arms;
    }

    public Armor getFeet(){
        return feet;
    }

    public Weapon getWeapon1(){
        return weapon1;
    }

    public Weapon getWeapon2(){
        return weapon2;
    }
}
