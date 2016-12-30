package rpg;


import java.util.ArrayList;
import java.util.Scanner;

//import rpg.Race.raceList;

/**
 * Write a description of class Character here.
 * 
 * @author mrh2 
 * @version 2.0
 */
class Character
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

	private Scanner sc = new Scanner(System.in);

	Character(){
		filereader = new FileRead();

		System.out.println("What is the name of this character?");
		name = sc.nextLine();		
		
		setRace();
		
		System.out.println("The possible backgrounds are: \n Wealthy: +20% Charisma, +10% Wisdom, -10% Strength \n Barbaric: +20% Strength, +10% Dexterity, -10% Charisma \n Rebel: +20% Perception, +10% Charisma, -10% Luck \n Ranger: +20% Perception, +10% Dexterity, -10% Vitality \n Scout: +20% Agility, +10% Perception, -10% Vitality \n Scholar: +20 Intelligence, +10% Wisdom, -10% Endurance \n Wanderer: +20% Vitality, +10% Agility, -10% Wisdom \n Explorer: +20% Endurance, +10% Luck, -10% Intelligence \n Loner: +20% Dexterity, +10% Vitality, -10% Charisma \n Thief: +20% Luck, +10% Agility, -10% Strength \n Assassin: +20% Dexterity, +10% Luck, -10% Vitality \n Soldier: +20% Endurance, +10% Strength, -10% Wisdom \n Bard: +20% Charisma, +10% Intelligence, -10% Strength \n Blacksmith: +20% Strength, +10% Endurance, -10% Agility \n Carpenter: +20% Endurance, +10% Intelligence, -10% Charisma \n Clothier: +20% Dexterity, +10% Wisdom, -10% Endurance \n Merchant: +20% Charisma, +10% Luck, -10% Dexterity \n Spy: +20% Intelligence, +10% Perception, -10% Wisdom \n Religious: +20% Wisdom, +10% Endurance, -10% Perception \n Survivor: +20% Luck, +10% Vitality, -10% Endurance \n Acrobat: +20% Agility, +10% Strength, -10% Intelligence \n Monk: +20% Wisdom, +10% Agility, -10% Luck \n Commander: +20% Strength, +10% Charisma, -10% Agility \n Strategist: +20% Intelligence, +10 Perception, -10% Dexterity \n Flag-Bearer: +20% Vitality, +10% Endurance, -10% Luck \n Farmer: +20% Vitality, +10% Strength, -10% Perception \n Guard: +20% Perception, +10% Vitality, -10% Intelligence \n Priest: +20% Wisdom, +10% Charisma, -10% Agility \n Rogue: +20% Agility, +10% Dexterity, -10% Perception \n Researcher: +20% Luck, +10% Intelligence, -10% Dexterity");
		System.out.println("What is " + name + "'s background?");
		String tempStory = sc.nextLine();
		while((tempStory.equals("Wealthy") || tempStory.equals("Barbaric") || tempStory.equals("Rebel") || tempStory.equals("Ranger") || tempStory.equals("Scout") || tempStory.equals("Scholar") || tempStory.equals("Wanderer") || tempStory.equals("Explorer") || tempStory.equals("Loner") || tempStory.equals("Thief") || tempStory.equals("Assassin") || tempStory.equals("Soldier") || tempStory.equals("Bard") || tempStory.equals("Blacksmith") || tempStory.equals("Carpenter") || tempStory.equals("Clothier") || tempStory.equals("Merchant") || tempStory.equals("Spy") || tempStory.equals("Religious") || tempStory.equals("Survivor") || tempStory.equals("Acrobat") || tempStory.equals("Monk") || tempStory.equals("Commander") || tempStory.equals("Strategist") || tempStory.equals("Flag-Bearer") || tempStory.equals("Farmer") || tempStory.equals("Guard") || tempStory.equals("Priest") || tempStory.equals("Rogue") || tempStory.equals("Researcher")) == false){
			System.out.println("That is not one of the possible backgrounds");
			System.out.println("Please pick a background.");
			tempStory = sc.nextLine();
		}
		story = new Background(filereader.storyReader(tempStory));

		int primary = setPrimaryMagic();
		setSecondaryMagic(primary);

//		System.out.println("What is " + name + "'s secondary magic?");
//		String tempSecond = sc.nextLine();
//		while(((tempSecond.equals("Fire") || tempSecond.equals("Water") || tempSecond.equals("Earth") || tempSecond.equals("Air") || tempSecond.equals("Lightning") || tempSecond.equals("Shadow") || tempSecond.equals("Healing") || tempSecond.equals("Summoning") || tempSecond.equals("Illusion")) && tempSecond.equals(primaryMagic.getType()) == false) == false){
//			System.out.println("That is not a possible secondary magic");
//			System.out.println("Please pick a magic.");
//			tempSecond = sc.nextLine();
//		}
//		secondaryMagic = new Magic(filereader.secondMagicReader(tempSecond));
		
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

	private int setPrimaryMagic() {
		ArrayList<String> dataArray = filereader.getMagicData();
		System.out.println("\nThe possible magics of this world are:");
		for (int i=0; i < dataArray.size(); i++) {
			String s = dataArray.get(i);
			System.out.println((i+1) + ". " + s.substring(0, s.indexOf(',')) );
		}
		System.out.println("What is " + name + "'s PRIMARY magic? (enter number)");

		int answer = sc.nextInt();  //FIXME: what if a non-integer is entered?

		while (answer < 1 || answer > dataArray.size()) {
			System.out.println("That is not one of the possible magics");
			System.out.println("Please pick a magic.");
			answer = sc.nextInt();
		}
		String magicData = dataArray.get(answer-1);
		primaryMagic = new Magic(magicData.split(","));
		sc.nextLine();
		return answer-1;
	}
	
	private void setSecondaryMagic(int primary) {
		ArrayList<String> dataArray = filereader.getMagicData();
		System.out.println("\nThe possible magics of this world are:");
		for (int i=0; i < dataArray.size(); i++) {
			String s = dataArray.get(i);
			if (i==primary) System.out.println("X. " + s.substring(0, s.indexOf(',')));
			else System.out.println((i+1) + ". " + s.substring(0, s.indexOf(',')) );
		}
		System.out.println("What is " + name + "'s SECONDARY magic? (enter number)");

		int answer = sc.nextInt();  //FIXME: what if a non-integer is entered?

		while (answer < 1 || answer > dataArray.size() || answer == primary + 1) {
			System.out.println("That is not one of the possible magics");
			System.out.println("Please pick a magic.");
			answer = sc.nextInt();
		}
		String magicData = dataArray.get(answer-1);
		secondaryMagic = new Magic(magicData.split(","));
		sc.nextLine();
	}
	
	private void setRace() {
		System.out.println("\nThe races of this world are: ");
		
		for (int i=0; i < Race.raceList.size(); i++) {
			Race r = Race.raceList.get(i);
			//Neither of these prints out the \n that is in the text as a new line. I've also tried %n and \r\n in the text.
//			System.out.printf("%d.\t%s%n",i+1,r.getDesc());
//			System.out.println(i+1 + ".\t" + r.getDesc());
			String desc = r.getDesc();
//			String[] lines = desc.split("\\n");	//this does not work either!!!
			String[] lines = desc.split("@");
			for (int j=0; j < lines.length; j++) {
				if (j==0) System.out.println((i+1) + " " + lines[j]);
				else System.out.println("\t" + lines[j]);
			}
			System.out.printf("\t+30%% %s, +20%% %s, +10%% %s, -20%% %s, -10%% %s %n%n",
					r.getPrimaryBuff(), r.getSecondaryBuff(), r.getTertiaryBuff(), r.getPrimaryDeBuff(), r.getSecondaryDeBuff());

//	output like this:
//			 "Eldrizi: A race of large humanoids from the north.  They have incredible endurance.  "
//				+ "\n They mostly live in cities in order to guard from the elements.  \n "
//				+ "+30% Endurance, +20% Vitality, +10% Charisma, -20% Dexterity, -10% Perception \n \n "
			
		}
		System.out.println("What is " + name + "'s race? (enter number)");
		int answer = sc.nextInt();  //FIXME: what if a non-integer is entered?

		while (answer < 1 || answer > Race.raceList.size()) {
			System.out.println("That is not one of the possible races");
			System.out.println("Please pick a race.");
			answer = sc.nextInt();
		}
		this.race = Race.raceList.get(answer-1);
		//DEBUG:
		//System.out.println("You are race " + this.race.getRace());
	}
	

	String getName(){
		return name;
	}

	double getStrength(){
		moddedStr = strength * modStr;
		return moddedStr;
	}

	double getDexterity(){
		moddedDex = dexterity * modDex;
		return moddedDex;
	}

	double getAgility(){
		moddedAgi = agility * modAgi;
		return moddedAgi;
	}

	double getEndurance(){
		moddedEnd = endurance * modEnd;
		return moddedEnd;
	}

	double getIntelligence(){
		moddedInt = intelligence * modInt;
		return moddedInt;
	}

	double getWisdom(){
		moddedWis = wisdom * modWis;
		return moddedWis;
	}

	double getPerception(){
		moddedPer = perception * modPer;
		return moddedPer;
	}

	double getLuck(){
		moddedLuc = luck * modLuc;
		return moddedLuc;
	}

	double getCharisma(){
		moddedCha = charisma * modCha;
		return moddedCha;
	}

	double getVitality(){
		moddedVit = vitality * modVit;
		return moddedVit;
	}

	String getRace(){
		return race.getRace();
	}

	String getBackground(){
		return story.getStory();
	}

	String getMagic(){
		return magic.getType();
	}

	Armor getChest(){
		return chest;
	}

	Armor getHead(){
		return head;
	}

	Armor getLegs(){
		return legs;
	}

	Armor getArms(){
		return arms;
	}

	Armor getFeet(){
		return feet;
	}

	Weapon getWeapon1(){
		return hand1;
	}

	Weapon getWeapon2(){
		return hand2;
	}

	double getHealth(){
		return health;
	}

	double getStamina(){
		return stamina;
	}

	double getMana(){
		return mana;
	}

	double getTotalHealth(){
		totalHealth = (getVitality() * 50) + (getStrength() * 10);
		return totalHealth;
	}

	double getTotalStamina(){
		totalStamina = (getEndurance() * 50) + (getAgility() * 10);
		return totalStamina;
	}

	double getTotalMana(){
		totalMana = (getIntelligence() * 50) + (getWisdom() * 10);
		return totalMana;
	}

	double getHealthRegen(){
		healthRegen = (getStrength() * 5) + (getVitality() * 2);
		return healthRegen;
	}

	double getStaminaRegen(){
		staminaRegen = (getAgility() * 5) + (getEndurance() * 2);
		return staminaRegen;
	}

	double getManaRegen(){
		manaRegen = (getWisdom() * 5) + (getIntelligence() * 2);
		return manaRegen;
	}

	void printInfo(){
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

	WeaponStyle getStyle(){
		style = new WeaponStyle(filereader.styleReader(hand1,hand2));
		return style;
	}

	double getWeaponDamage(){
		if(getStyle().getStyle().equals("Bow") || getStyle().getStyle().equals("Crossbow")){
			weaponDamage = hand1.getOffense() + getStyle().getOffense() + (getDexterity() / 3) + (getStrength() / 5);
		}else if(getStyle().getStyle().equals("DW Sword") || getStyle().getStyle().equals("DW Axe") || getStyle().getStyle().equals("DW Mace") || getStyle().getStyle().equals("DW Dagger")){
			weaponDamage = ((hand1.getOffense() + hand2.getOffense()) / 2)+ getStyle().getOffense() + (getDexterity() / 5) + (getStrength() / 3);
		}else{
			weaponDamage = hand1.getOffense() + getStyle().getOffense() + (getDexterity() / 5) + (getStrength() / 3);
		}
		return weaponDamage;
	}

	double getArmorWeight(){
		armorWeight = chest.getWeight() + head.getWeight() + legs.getWeight() + arms.getWeight() + feet.getWeight();
		return armorWeight;
	}

	double getWeaponWeight(){
		weaponWeight = hand1.getWeight();
		if(hand2 != null){
			weaponWeight += hand2.getWeight();
		}
		return weaponWeight;
	}

	double getWeaponDefense(){
		double weaponDefense = hand1.getDefense();
		if(hand2 != null){
			weaponDefense += hand2.getDefense();
		}
		return weaponDefense;
	}

	double getWeaponSpeed(){
		weaponSpeed = getDexterity() * .01 + getStrength() * .005;
		if(hand2 != null){
			weaponSpeed += .05 * getStyle().getSpeed() / (getWeaponWeight() / 2);
		}else{
			weaponSpeed += .05 * getStyle().getSpeed() / hand1.getWeight();
		}
		return weaponSpeed;
	}

	double getMoveSpeed(){
		moveSpeed = getAgility() / 15 + (getStrength() + getEndurance()) / 30 + (getStyle().getMobility() / (getArmorWeight() + getWeaponWeight()));
		return moveSpeed;
	}

	double getDodgeChance(){
		dodgeChance = ((getAgility() / 2 + getLuck() / 6 + getStyle().getMobility() / 5) - (getArmorWeight() + getWeaponWeight())) / 3;
		return dodgeChance;
	}

	double getParryChance(){
		parryChance = getDexterity() / 2 + getPerception() / 6 + getStyle().getSpeed() / 5;
		if(hand2 != null){
			parryChance -=  (arms.getWeight() + (getWeaponWeight() / 2));
		}else{
			parryChance -=  (arms.getWeight() + hand1.getWeight());
		}
		return parryChance;
	}

	double getBlockDefense(){
		blockDefense = getStrength() / 2 + getEndurance() / 6;
		if(hand2 != null){
			blockDefense += (hand1.getDefense() + hand2.getDefense() + getStyle().getDefense()) / 3;
		}else{
			blockDefense += (hand1.getDefense() + getStyle().getDefense()) / 3;
		}
		return blockDefense;
	}

	double getArmor(){
		armor = ((getStrength() + getEndurance() + getVitality()) / 3) + chest.getDefense() + head.getDefense() + arms.getDefense() + legs.getDefense() + feet.getDefense();
		return armor;
	}

	double getCritChance(){
		critChance = (getDexterity() + getPerception() + getLuck() + getStyle().getMobility()) / 3;
		return critChance;
	}

	double getMagicPower(){
		magicPower = magic.getOffense() + getIntelligence() / 2 + getWisdom() / 4;
		return magicPower;
	}

	double getCastSpeed(){
		castSpeed = (getWisdom() * .001 + getIntelligence() * .0006) * magic.getSpeed();
		return castSpeed;
	}

	double getMagicDefense(){
		magicDefense = ((getIntelligence() + getWisdom() + getVitality()) / 3) + magic.getDefense();
		return magicDefense;
	}

	double getMagicControl(){
		magicControl = ((getIntelligence() + getWisdom()) / 3) + magic.getControl();
		return magicControl;
	}

	double getMagicSupport(){
		magicSupport = getIntelligence() / 2 + magic.getSupport();
		return magicControl;
	}

	double getMagicMobility(){
		magicMobility = ((getAgility() + getIntelligence()) / 4) + magic.getSupport();
		return magicSupport;
	}

	double getInfluence(){
		npcInfluence = (getCharisma() + getWisdom() / 2 + getPerception() / 3 + getLuck() / 5) / 3;
		return npcInfluence;
	}
}