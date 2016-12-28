package rpg;


import java.util.Scanner;
/**
 * Write a description of class Character here.
 * 
 * @author mrh2 
 * @version 2.0
 */
public class Character
{
    private int strength;
    private int dexterity;
    private int agility;
    private int endurance;
    private int intelligence;
    private int wisdom;
    private int perception;
    private int luck;
    private int charisma;
    private int vitality;

    private double modStr;
    private double modDex;
    private double modAgi;
    private double modEnd;
    private double modInt;
    private double modWis;
    private double modPer;
    private double modLuc;
    private double modCha;
    private double modVit;

    private double moddedStr;
    private double moddedDex;
    private double moddedAgi;
    private double moddedEnd;
    private double moddedInt;
    private double moddedWis;
    private double moddedPer;
    private double moddedLuc;
    private double moddedCha;
    private double moddedVit;

    private double totalHealth;
    private double totalStamina;
    private double totalMana;

    private double health;
    private double stamina;
    private double mana;

    private double healthRegen;
    private double staminaRegen;
    private double manaRegen;

    private Race race;
    private Background story;

    private Weapon hand1;
    private Weapon hand2;
    private Armor head;
    private Armor chest;
    private Armor arms;
    private Armor legs;
    private Armor feet;

    private WeaponStyle style;

    private double armorWeight;
    private double weaponWeight;

    private Magic primaryMagic;
    private Magic secondaryMagic;
    private Magic magic;

    private double weaponDamage;
    private double weaponSpeed;
    private double parryChance;
    private double dodgeChance;
    private double blockDefense;
    private double armor;
    private double critChance;
    private double moveSpeed;

    private double magicPower;
    private double castSpeed;
    private double magicDefense;
    private double magicControl;
    private double magicSupport;
    private double magicMobility;

    private double npcInfluence;

    private String name;
    private int level;
    private FileRead filereader;
    public Character(){
        filereader = new FileRead();
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the name of this character?");
        name = sc.nextLine();
        //TODO: put this long text into a text file.
        System.out.println("The races of this world are: \n Gox: A race of turtle-like peoples.  "
        		+ "They can be found living in either \n small rural communities along the southern coast lines.  "
        		+ "However, many tend \n to move away to the cities in order to pursue research at universities.  \n "
        		+ "They can also be found wandering the wilds in search of ruins to explore.  \n "
        		+ "They are long lived, but not very agile.  \n"
        		+ " +30% Vitality, +20% Intelligence, +10% Endurance, -20% Agility, -10% Dexterity \n \n Valdar: A race of horned, mammalian people.  They are extremely powerful and \n large in stature. They mostly live in large clans in the southern plains and \n in the shadows of the volcanos in that region.  Their clans are always at war \n as combat prowess is viewed with respect in their society.  \n +30% Strength, +20% Dexterity, +10% Vitality, -20% Charsima, -10% Intelligence \n \n Eona: A race of refined human-like people.  Their hair is often brightly colored.  \n They are mostly city dwelling people who are intelligent and charismatic.  Many \n are merchants or scholars.  They hate to leave things to luck.  \n +30% Intelligence, +20% Charisma, +10 Perception, -20% Luck, -10% Strength \n \n Kroll: A race of nomadic cat-like people.  They can be found throughout the world \n as they travel.  They have a few permanent settlements in the forests of the world.  \n They are not always trusted by others.  They are also very agile.  \n +30% Agility, +20% Endurance, +10% Wisdom, -20% Vitality, -10% Charisma \n \n Surmeli: A humanoid race of small stature.  They are quick, but weak.  They are \n known for somehow getting out of tough situations.  They have villages in forests \n and the hillier regions of the world.  \n +30% Luck, +20% Agility, +10% Dexterity, -20% Strength, -10% Vitality \n \n Zem: A race of lizard-like people who mainly dwell in the mountains.  They \n are a warrior race who looks to the gods for wisdom.  Many become mercenaries \n for foreign armies.  \n +30% Dexterity, +20% Wisdom, +10% Strength, -20% Perception, -10% Luck \n \n Criffon: A race of barbaric humanoids who dwell on the plains of the world.  \n They often shurk modern education for the wisdom of their gods.  They live in \n small hunter-gatherer villages.  \n +30% Wisdom, +20% Perception, +10% Agility, -20% Intelligence, -10% Endurance \n \n Eldrizi: A race of large humanoids from the north.  They have incredible endurance.  \n They mostly live in cities in order to guard from the elements.  \n +30% Endurance, +20% Vitality, +10% Charisma, -20% Dexterity, -10% Perception \n \n Elassi: They are an elven race who often are found in cities of other races.  \n They are great merchants.  They have founded cities along the trade routes of the \n world.  \n +30% Charisma, +20% Luck, +10% Intelligence, -20% Endurance, -10% Wisdom \n \n Clovis: A race of humans who have developed extraordinary perception in response \n to the harsh desert wilderness.  They live in walled cities for protection.  \n +30% Perception, +20% Strength, +10% Luck, -20% Wisdom, -10% Agility \n \n");
        System.out.println("What is " + name + "'s race?");
        String tempRace = sc.nextLine();
        while((tempRace.equals("Gox") || tempRace.equals("Valdar") || tempRace.equals("Eona") || tempRace.equals("Kroll") || tempRace.equals("Surmeli") || tempRace.equals("Eldrizi") || tempRace.equals("Criffon") || tempRace.equals("Elassi") || tempRace.equals("Clovis") || tempRace.equals("Zem")) == false){
            System.out.println("That is not one of the possible races");
            System.out.println("Please pick a race.");
            tempRace = sc.nextLine();
        }
        race = new Race(filereader.raceReader(tempRace));
        System.out.println("The possible backgrounds are: \n Wealthy: +20% Charisma, +10% Wisdom, -10% Strength \n Barbaric: +20% Strength, +10% Dexterity, -10% Charisma \n Rebel: +20% Perception, +10% Charisma, -10% Luck \n Ranger: +20% Perception, +10% Dexterity, -10% Vitality \n Scout: +20% Agility, +10% Perception, -10% Vitality \n Scholar: +20 Intelligence, +10% Wisdom, -10% Endurance \n Wanderer: +20% Vitality, +10% Agility, -10% Wisdom \n Explorer: +20% Endurance, +10% Luck, -10% Intelligence \n Loner: +20% Dexterity, +10% Vitality, -10% Charisma \n Thief: +20% Luck, +10% Agility, -10% Strength \n Assassin: +20% Dexterity, +10% Luck, -10% Vitality \n Soldier: +20% Endurance, +10% Strength, -10% Wisdom \n Bard: +20% Charisma, +10% Intelligence, -10% Strength \n Blacksmith: +20% Strength, +10% Endurance, -10% Agility \n Carpenter: +20% Endurance, +10% Intelligence, -10% Charisma \n Clothier: +20% Dexterity, +10% Wisdom, -10% Endurance \n Merchant: +20% Charisma, +10% Luck, -10% Dexterity \n Spy: +20% Intelligence, +10% Perception, -10% Wisdom \n Religious: +20% Wisdom, +10% Endurance, -10% Perception \n Survivor: +20% Luck, +10% Vitality, -10% Endurance \n Acrobat: +20% Agility, +10% Strength, -10% Intelligence \n Monk: +20% Wisdom, +10% Agility, -10% Luck \n Commander: +20% Strength, +10% Charisma, -10% Agility \n Strategist: +20% Intelligence, +10 Perception, -10% Dexterity \n Flag-Bearer: +20% Vitality, +10% Endurance, -10% Luck \n Farmer: +20% Vitality, +10% Strength, -10% Perception \n Guard: +20% Perception, +10% Vitality, -10% Intelligence \n Priest: +20% Wisdom, +10% Charisma, -10% Agility \n Rogue: +20% Agility, +10% Dexterity, -10% Perception \n Researcher: +20% Luck, +10% Intelligence, -10% Dexterity");
        System.out.println("What is " + name + "'s background?");
        String tempStory = sc.nextLine();
        while((tempStory.equals("Wealthy") || tempStory.equals("Barbaric") || tempStory.equals("Rebel") || tempStory.equals("Ranger") || tempStory.equals("Scout") || tempStory.equals("Scholar") || tempStory.equals("Wanderer") || tempStory.equals("Explorer") || tempStory.equals("Loner") || tempStory.equals("Thief") || tempStory.equals("Assassin") || tempStory.equals("Soldier") || tempStory.equals("Bard") || tempStory.equals("Blacksmith") || tempStory.equals("Carpenter") || tempStory.equals("Clothier") || tempStory.equals("Merchant") || tempStory.equals("Spy") || tempStory.equals("Religious") || tempStory.equals("Survivor") || tempStory.equals("Acrobat") || tempStory.equals("Monk") || tempStory.equals("Commander") || tempStory.equals("Strategist") || tempStory.equals("Flag-Bearer") || tempStory.equals("Farmer") || tempStory.equals("Guard") || tempStory.equals("Priest") || tempStory.equals("Rogue") || tempStory.equals("Researcher")) == false){
            System.out.println("That is not one of the possible backgrounds");
            System.out.println("Please pick a background.");
            tempStory = sc.nextLine();
        }
        story = new Background(filereader.storyReader(tempStory));
        System.out.println("The possible magics of this world are: \n Fire \n Water \n Earth \n Air \n Lightning \n Shadow \n Healing \n Summoning \n Illusion");
        System.out.println("What is " + name + "'s primary magic?");
        String tempFirst = sc.nextLine();
        while((tempFirst.equals("Fire") || tempFirst.equals("Water") || tempFirst.equals("Earth") || tempFirst.equals("Air") || tempFirst.equals("Lightning") || tempFirst.equals("Shadow") || tempFirst.equals("Healing") || tempFirst.equals("Summoning") || tempFirst.equals("Illusion")) == false){
            System.out.println("That is not one of the possible magics");
            System.out.println("Please pick a magic.");
            tempFirst = sc.nextLine();
        }
        primaryMagic = new Magic(filereader.firstMagicReader(tempFirst));
        System.out.println("What is " + name + "'s secondary magic?");
        String tempSecond = sc.nextLine();
        while(((tempSecond.equals("Fire") || tempSecond.equals("Water") || tempSecond.equals("Earth") || tempSecond.equals("Air") || tempSecond.equals("Lightning") || tempSecond.equals("Shadow") || tempSecond.equals("Healing") || tempSecond.equals("Summoning") || tempSecond.equals("Illusion")) && tempSecond.equals(tempFirst) == false) == false){
            System.out.println("That is not a possible secondary magic");
            System.out.println("Please pick a magic.");
            tempSecond = sc.nextLine();
        }
        secondaryMagic = new Magic(filereader.secondMagicReader(tempSecond));
        magic = new Magic(primaryMagic, secondaryMagic);

        modStr = 1;
        if(race.getPrimaryBuff().equals("Strength")){
            modStr += .3;
        }else if(race.getSecondaryBuff().equals("Strength")){
            modStr += .2;
        }else if(race.getTertiaryBuff().equals("Strength")){
            modStr += .1;
        }else if(race.getPrimaryDeBuff().equals("Strength")){
            modStr -= .2;
        }else if(race.getSecondaryDeBuff().equals("Strength")){
            modStr -= .1;
        }
        if(story.getPrimaryBuff().equals("Strength")){
            modStr += .2;
        }else if(story.getSecondaryBuff().equals("Strength")){
            modStr += .1;
        }else if(story.getPrimaryDeBuff().equals("Strength")){
            modStr -= .1;
        }
        modDex = 1;
        if(race.getPrimaryBuff().equals("Dexterity")){
            modDex += .3;
        }else if(race.getSecondaryBuff().equals("Dexterity")){
            modDex += .2;
        }else if(race.getTertiaryBuff().equals("Dexterity")){
            modDex += .1;
        }else if(race.getPrimaryDeBuff().equals("Dexterity")){
            modDex -= .2;
        }else if(race.getSecondaryDeBuff().equals("Dexterity")){
            modDex -= .1;
        }
        if(story.getPrimaryBuff().equals("Dexterity")){
            modDex += .2;
        }else if(story.getSecondaryBuff().equals("Dexterity")){
            modDex += .1;
        }else if(story.getPrimaryDeBuff().equals("Dexterity")){
            modDex -= .1;
        }
        modAgi = 1;
        if(race.getPrimaryBuff().equals("Agility")){
            modAgi += .3;
        }else if(race.getSecondaryBuff().equals("Agility")){
            modAgi += .2;
        }else if(race.getTertiaryBuff().equals("Agility")){
            modAgi += .1;
        }else if(race.getPrimaryDeBuff().equals("Agility")){
            modAgi -= .2;
        }else if(race.getSecondaryDeBuff().equals("Agility")){
            modAgi -= .1;
        }
        if(story.getPrimaryBuff().equals("Agility")){
            modAgi += .2;
        }else if(story.getSecondaryBuff().equals("Agility")){
            modAgi += .1;
        }else if(story.getPrimaryDeBuff().equals("Agility")){
            modAgi -= .1;
        }
        modEnd = 1;
        if(race.getPrimaryBuff().equals("Endurance")){
            modEnd += .3;
        }else if(race.getSecondaryBuff().equals("Endurance")){
            modEnd += .2;
        }else if(race.getTertiaryBuff().equals("Endurance")){
            modEnd += .1;
        }else if(race.getPrimaryDeBuff().equals("Endurance")){
            modEnd -= .2;
        }else if(race.getSecondaryDeBuff().equals("Endurance")){
            modEnd -= .1;
        }
        if(story.getPrimaryBuff().equals("Endurance")){
            modEnd += .2;
        }else if(story.getSecondaryBuff().equals("Endurance")){
            modEnd += .1;
        }else if(story.getPrimaryDeBuff().equals("Endurance")){
            modEnd -= .1;
        }
        modInt = 1;
        if(race.getPrimaryBuff().equals("Intelligence")){
            modInt += .3;
        }else if(race.getSecondaryBuff().equals("Intelligence")){
            modInt += .2;
        }else if(race.getTertiaryBuff().equals("Intelligence")){
            modInt += .1;
        }else if(race.getPrimaryDeBuff().equals("Intelligence")){
            modInt -= .2;
        }else if(race.getSecondaryDeBuff().equals("Intelligence")){
            modInt -= .1;
        }
        if(story.getPrimaryBuff().equals("Intelligence")){
            modInt += .2;
        }else if(story.getSecondaryBuff().equals("Intelligence")){
            modInt += .1;
        }else if(story.getPrimaryDeBuff().equals("Intelligence")){
            modInt -= .1;
        }
        modWis = 1;
        if(race.getPrimaryBuff().equals("Wisdom")){
            modWis += .3;
        }else if(race.getSecondaryBuff().equals("Wisdom")){
            modWis += .2;
        }else if(race.getTertiaryBuff().equals("Wisdom")){
            modWis += .1;
        }else if(race.getPrimaryDeBuff().equals("Wisdom")){
            modWis -= .2;
        }else if(race.getSecondaryDeBuff().equals("Wisdom")){
            modWis -= .1;
        }
        if(story.getPrimaryBuff().equals("Wisdom")){
            modWis += .2;
        }else if(story.getSecondaryBuff().equals("Wisdom")){
            modWis += .1;
        }else if(story.getPrimaryDeBuff().equals("Wisdom")){
            modWis -= .1;
        }
        modPer = 1;
        if(race.getPrimaryBuff().equals("Perception")){
            modPer += .3;
        }else if(race.getSecondaryBuff().equals("Perception")){
            modPer += .2;
        }else if(race.getTertiaryBuff().equals("Perception")){
            modPer += .1;
        }else if(race.getPrimaryDeBuff().equals("Perception")){
            modPer -= .2;
        }else if(race.getSecondaryDeBuff().equals("Perception")){
            modPer -= .1;
        }
        if(story.getPrimaryBuff().equals("Perception")){
            modPer += .2;
        }else if(story.getSecondaryBuff().equals("Perception")){
            modPer += .1;
        }else if(story.getPrimaryDeBuff().equals("Perception")){
            modPer -= .1;
        }
        modLuc = 1;
        if(race.getPrimaryBuff().equals("Luck")){
            modLuc += .3;
        }else if(race.getSecondaryBuff().equals("Luck")){
            modLuc += .2;
        }else if(race.getTertiaryBuff().equals("Luck")){
            modLuc += .1;
        }else if(race.getPrimaryDeBuff().equals("Luck")){
            modLuc -= .2;
        }else if(race.getSecondaryDeBuff().equals("Luck")){
            modLuc -= .1;
        }
        if(story.getPrimaryBuff().equals("Luck")){
            modLuc += .2;
        }else if(story.getSecondaryBuff().equals("Luck")){
            modLuc += .1;
        }else if(story.getPrimaryDeBuff().equals("Luck")){
            modLuc -= .1;
        }
        modCha = 1;
        if(race.getPrimaryBuff().equals("Charisma")){
            modCha += .3;
        }else if(race.getSecondaryBuff().equals("Charisma")){
            modCha += .2;
        }else if(race.getTertiaryBuff().equals("Charisma")){
            modCha += .1;
        }else if(race.getPrimaryDeBuff().equals("Charisma")){
            modCha -= .2;
        }else if(race.getSecondaryDeBuff().equals("Charisma")){
            modCha -= .1;
        }
        if(story.getPrimaryBuff().equals("Charisma")){
            modCha += .2;
        }else if(story.getSecondaryBuff().equals("Charisma")){
            modCha += .1;
        }else if(story.getPrimaryDeBuff().equals("Charisma")){
            modCha -= .1;
        }
        modVit = 1;
        if(race.getPrimaryBuff().equals("Vitality")){
            modVit += .3;
        }else if(race.getSecondaryBuff().equals("Vitality")){
            modVit += .2;
        }else if(race.getTertiaryBuff().equals("Vitality")){
            modVit += .1;
        }else if(race.getPrimaryDeBuff().equals("Vitality")){
            modVit -= .2;
        }else if(race.getSecondaryDeBuff().equals("Vitality")){
            modVit -= .1;
        }
        if(story.getPrimaryBuff().equals("Vitality")){
            modVit += .2;
        }else if(story.getSecondaryBuff().equals("Vitality")){
            modVit += .1;
        }else if(story.getPrimaryDeBuff().equals("Vitality")){
            modVit -= .1;
        }
        strength = 8;
        dexterity = 8;
        agility = 8;
        endurance = 8;
        intelligence = 8;
        wisdom = 8;
        perception = 8;
        luck = 8;
        charisma = 8;
        vitality = 8;
        moddedStr = strength * modStr;
        moddedDex = dexterity * modDex;
        moddedAgi = agility * modAgi;
        moddedEnd = endurance * modEnd;
        moddedInt = intelligence * modInt;
        moddedWis = wisdom * modWis;
        moddedPer = perception * modPer;
        moddedLuc = luck * modLuc;
        moddedCha = charisma * modCha;
        moddedVit = vitality * modVit;

        level = 1;
        System.out.println("The possible attributes are: \n Strength \n Dexterity \n Agility \n Endurance \n Intelligence \n Wisdom \n Perception \n Luck \n Charisma \n Vitality");
        for(int i = 0; i < 20; i++){
            System.out.println(name + " has " + (20 - i) + " attributes left to assign.");
            System.out.println("Please select which attribute " + name + " wishes to increase.");
            String attribute = sc.nextLine();
            while((attribute.equals("Strength") || attribute.equals("Dexterity") || attribute.equals("Agility") || attribute.equals("Endurance") || attribute.equals("Intelligence") || attribute.equals("Wisdom") || attribute.equals("Perception") || attribute.equals("Charisma") || attribute.equals("Luck") || attribute.equals("Vitality")) == false){
                System.out.println("That is not one of the attributes");
                System.out.println("Please pick an attribute.");
                attribute = sc.nextLine();
            }
            if(attribute.equals("Strength")){
                strength++;
            }
            if(attribute.equals("Dexterity")){
                dexterity++;
            }
            if(attribute.equals("Agility")){
                agility++;
            }
            if(attribute.equals("Endurance")){
                endurance++;
            }
            if(attribute.equals("Intelligence")){
                intelligence++;
            }
            if(attribute.equals("Wisdom")){
                wisdom++;
            }
            if(attribute.equals("Perception")){
                perception++;
            }
            if(attribute.equals("Luck")){
                luck++;
            }
            if(attribute.equals("Charisma")){
                charisma++;
            }
            if(attribute.equals("Vitality")){
                vitality++;
            }
        }
        chest = story.getChest();
        head = story.getHead();
        legs = story.getLegs();
        arms = story.getArms();
        feet = story.getFeet();
        hand1 = story.getWeapon1();
        hand2 = story.getWeapon2();

        totalHealth = (getVitality() * 50) + (getStrength() * 10);
        totalStamina = (getEndurance() * 50) + (getAgility() * 10);
        totalMana = (getIntelligence() * 50) + (getWisdom() * 10);
        health = totalHealth;
        stamina = totalStamina;
        mana = totalMana;
        healthRegen = (getStrength() * 8) + (getVitality() * 4);
        staminaRegen = (getAgility() * 8) + (getEndurance() * 4);
        manaRegen = (getWisdom() * 8) + (getIntelligence() * 4);
        getStyle();
        getWeaponDamage();
        getArmor();
        getMoveSpeed();
        getWeaponSpeed();
        getBlockDefense();
        getDodgeChance();
        getParryChance();
        getCritChance();
        getInfluence();
        getMagicPower();
        getCastSpeed();
        getMagicDefense();
        getMagicControl();
        getMagicSupport();
        getMagicMobility();
    }

    public String getName(){
        return name;
    }

    public double getStrength(){
        moddedStr = strength * modStr;
        return moddedStr;
    }

    public double getDexterity(){
        moddedDex = dexterity * modDex;
        return moddedDex;
    }

    public double getAgility(){
        moddedAgi = agility * modAgi;
        return moddedAgi;
    }

    public double getEndurance(){
        moddedEnd = endurance * modEnd;
        return moddedEnd;
    }

    public double getIntelligence(){
        moddedInt = intelligence * modInt;
        return moddedInt;
    }

    public double getWisdom(){
        moddedWis = wisdom * modWis;
        return moddedWis;
    }

    public double getPerception(){
        moddedPer = perception * modPer;
        return moddedPer;
    }

    public double getLuck(){
        moddedLuc = luck * modLuc;
        return moddedLuc;
    }

    public double getCharisma(){
        moddedCha = charisma * modCha;
        return moddedCha;
    }

    public double getVitality(){
        moddedVit = vitality * modVit;
        return moddedVit;
    }

    public String getRace(){
        return race.getRace();
    }

    public String getBackground(){
        return story.getStory();
    }

    public String getMagic(){
        return magic.getType();
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
        return hand1;
    }

    public Weapon getWeapon2(){
        return hand2;
    }

    public double getHealth(){
        return health;
    }

    public double getStamina(){
        return stamina;
    }

    public double getMana(){
        return mana;
    }

    public double getTotalHealth(){
        totalHealth = (getVitality() * 50) + (getStrength() * 10);
        return totalHealth;
    }

    public double getTotalStamina(){
        totalStamina = (getEndurance() * 50) + (getAgility() * 10);
        return totalStamina;
    }

    public double getTotalMana(){
        totalMana = (getIntelligence() * 50) + (getWisdom() * 10);
        return totalMana;
    }

    public double getHealthRegen(){
        healthRegen = (getStrength() * 5) + (getVitality() * 2);
        return healthRegen;
    }

    public double getStaminaRegen(){
        staminaRegen = (getAgility() * 5) + (getEndurance() * 2);
        return staminaRegen;
    }

    public double getManaRegen(){
        manaRegen = (getWisdom() * 5) + (getIntelligence() * 2);
        return manaRegen;
    }

    public void printInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Race: " + getRace());
        System.out.println("Background: " + getBackground());
        System.out.println("Magic: " + getMagic());
        System.out.println("Weapon Style: " + getStyle().getStyle());
        System.out.println("Current Health: " + getHealth() + "\t Total Health: " + getTotalHealth() + "\t Health Regen: " + getHealthRegen());
        System.out.println("Current Stamina: " + getStamina() + "\t Total Stamina: " + getTotalStamina() + "\t Stamina Regen: " + getStaminaRegen());
        System.out.println("Current Mana: " + getMana() + "\t Total Mana: " + getTotalMana() + "\t Mana Regen: " + getManaRegen());
        System.out.println("Head Armor: " + getHead().getName());
        System.out.println("Chest Armor: " + getChest().getName());
        System.out.println("Leg Armor: " + getLegs().getName());
        System.out.println("Arm Armor: " + getArms().getName());
        System.out.println("Feet Armor: " + getFeet().getName());
        System.out.println("Main Weapon: " + getWeapon1().getName());
        if(getWeapon2() != null){
            System.out.println("Off Weapon: " + getWeapon2().getName());
        }
        System.out.println("Weapon Damage: " + getWeaponDamage());
        System.out.println("Armor Rating: " + getArmor());
        System.out.println("Movement Speed: " + getMoveSpeed());
        System.out.println("Weapon Speed: " + getWeaponSpeed());
        System.out.println("Block Defense: " + getBlockDefense());
        System.out.println("Dodge Chance: " + getDodgeChance());
        System.out.println("Parry Chance: " + getParryChance());
        System.out.println("Critical Chance: " + getCritChance());
        System.out.println("NPC Influence: " + getInfluence());
        System.out.println("Magic Power: " + getMagicPower());
        System.out.println("Cast Speed: " + getCastSpeed());
        System.out.println("Magic Defense: " + getMagicDefense());
        System.out.println("Magic Control: " + getMagicControl());
        System.out.println("Magic Support: " + getMagicSupport());
        System.out.println("Magic Mobility: " + getMagicMobility());
        System.out.println("Strength: " + getStrength());
        System.out.println("Dexterity: " + getDexterity());
        System.out.println("Agility: " + getAgility());
        System.out.println("Endurance: " + getEndurance());
        System.out.println("Intelligence: " + getIntelligence());
        System.out.println("Wisdom: " + getWisdom());
        System.out.println("Perception: " + getPerception());
        System.out.println("Luck: " + getLuck());
        System.out.println("Charisma: " + getCharisma());
        System.out.println("Vitality: " + getVitality());
    }

    public WeaponStyle getStyle(){
        style = new WeaponStyle(filereader.styleReader(hand1,hand2));
        return style;
    }

    public double getWeaponDamage(){
        if(getStyle().getStyle().equals("Bow") || getStyle().getStyle().equals("Crossbow")){
            weaponDamage = hand1.getOffense() + getStyle().getOffense() + (getDexterity() / 3) + (getStrength() / 5);
        }else if(getStyle().getStyle().equals("DW Sword") || getStyle().getStyle().equals("DW Axe") || getStyle().getStyle().equals("DW Mace") || getStyle().getStyle().equals("DW Dagger")){
            weaponDamage = ((hand1.getOffense() + hand2.getOffense()) / 2)+ getStyle().getOffense() + (getDexterity() / 5) + (getStrength() / 3);
        }else{
            weaponDamage = hand1.getOffense() + getStyle().getOffense() + (getDexterity() / 5) + (getStrength() / 3);
        }
        return weaponDamage;
    }

    public double getArmorWeight(){
        armorWeight = chest.getWeight() + head.getWeight() + legs.getWeight() + arms.getWeight() + feet.getWeight();
        return armorWeight;
    }

    public double getWeaponWeight(){
        weaponWeight = hand1.getWeight();
        if(hand2 != null){
            weaponWeight += hand2.getWeight();
        }
        return weaponWeight;
    }

    public double getWeaponDefense(){
        double weaponDefense = hand1.getDefense();
        if(hand2 != null){
            weaponDefense += hand2.getDefense();
        }
        return weaponDefense;
    }

    public double getWeaponSpeed(){
        weaponSpeed = getDexterity() * .01 + getStrength() * .005;
        if(hand2 != null){
            weaponSpeed += .05 * getStyle().getSpeed() / (getWeaponWeight() / 2);
        }else{
            weaponSpeed += .05 * getStyle().getSpeed() / hand1.getWeight();
        }
        return weaponSpeed;
    }

    public double getMoveSpeed(){
        moveSpeed = getAgility() / 15 + (getStrength() + getEndurance()) / 30 + (getStyle().getMobility() / (getArmorWeight() + getWeaponWeight()));
        return moveSpeed;
    }

    public double getDodgeChance(){
        dodgeChance = ((getAgility() / 2 + getLuck() / 6 + getStyle().getMobility() / 5) - (getArmorWeight() + getWeaponWeight())) / 3;
        return dodgeChance;
    }

    public double getParryChance(){
        parryChance = getDexterity() / 2 + getPerception() / 6 + getStyle().getSpeed() / 5;
        if(hand2 != null){
            parryChance -=  (arms.getWeight() + (getWeaponWeight() / 2));
        }else{
            parryChance -=  (arms.getWeight() + hand1.getWeight());
        }
        return parryChance;
    }

    public double getBlockDefense(){
        blockDefense = getStrength() / 2 + getEndurance() / 6;
        if(hand2 != null){
            blockDefense += (hand1.getDefense() + hand2.getDefense() + getStyle().getDefense()) / 3;
        }else{
            blockDefense += (hand1.getDefense() + getStyle().getDefense()) / 3;
        }
        return blockDefense;
    }

    public double getArmor(){
        armor = ((getStrength() + getEndurance() + getVitality()) / 3) + chest.getDefense() + head.getDefense() + arms.getDefense() + legs.getDefense() + feet.getDefense();
        return armor;
    }

    public double getCritChance(){
        critChance = (getDexterity() + getPerception() + getLuck() + getStyle().getMobility()) / 3;
        return critChance;
    }

    public double getMagicPower(){
        magicPower = magic.getOffense() + getIntelligence() / 2 + getWisdom() / 4;
        return magicPower;
    }

    public double getCastSpeed(){
        castSpeed = (getWisdom() * .001 + getIntelligence() * .0006) * magic.getSpeed();
        return castSpeed;
    }

    public double getMagicDefense(){
        magicDefense = ((getIntelligence() + getWisdom() + getVitality()) / 3) + magic.getDefense();
        return magicDefense;
    }

    public double getMagicControl(){
        magicControl = ((getIntelligence() + getWisdom()) / 3) + magic.getControl();
        return magicControl;
    }

    public double getMagicSupport(){
        magicSupport = getIntelligence() / 2 + magic.getSupport();
        return magicControl;
    }

    public double getMagicMobility(){
        magicMobility = ((getAgility() + getIntelligence()) / 4) + magic.getSupport();
        return magicSupport;
    }

    public double getInfluence(){
        npcInfluence = (getCharisma() + getWisdom() / 2 + getPerception() / 3 + getLuck() / 5) / 3;
        return npcInfluence;
    }
}