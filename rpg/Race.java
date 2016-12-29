
/**
 * Write a description of class Race here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Race
{
    private String race;
    private String primaryBuff;
    private String secondaryBuff;
    private String tertiaryBuff;
    private String primaryDeBuff;
    private String secondaryDeBuff;
    public Race(String[] species)
    {
        race = species[0];
        primaryBuff = species[1];
        secondaryBuff = species[2];
        tertiaryBuff = species[3];
        primaryDeBuff = species[4];
        secondaryDeBuff = species[5];
    }

    public String getRace(){
        return race;
    }

    public String getPrimaryBuff(){
        return primaryBuff;
    }

    public String getSecondaryBuff(){
        return secondaryBuff;
    }

    public String getTertiaryBuff(){
        return tertiaryBuff;
    }

    public String getPrimaryDeBuff(){
        return primaryDeBuff;
    }

    public String getSecondaryDeBuff(){
        return secondaryDeBuff;
    }
}
