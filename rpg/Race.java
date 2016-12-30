package rpg;

import java.util.ArrayList;

class Race
{
	//master list containing all of the races. Not Private
	//this array list is loaded in FileRead.
	static final ArrayList<Race> raceList = new ArrayList<Race>();
	
	private String race;
	private String primaryBuff;
	private String secondaryBuff;
	private String tertiaryBuff;
	private String primaryDeBuff;
	private String secondaryDeBuff;
	private String description;

	Race(String[] species)
	{
		race = species[0];
		primaryBuff = species[1];
		secondaryBuff = species[2];
		tertiaryBuff = species[3];
		primaryDeBuff = species[4];
		secondaryDeBuff = species[5];
	}
	
	void setDesc(String text) {
		description = text;
	}
	
	String getDesc() {
		return description;
	}

	String getRace(){
		return race;
	}

	String getPrimaryBuff(){
		return primaryBuff;
	}

	String getSecondaryBuff(){
		return secondaryBuff;
	}

	String getTertiaryBuff(){
		return tertiaryBuff;
	}

	String getPrimaryDeBuff(){
		return primaryDeBuff;
	}

	String getSecondaryDeBuff(){
		return secondaryDeBuff;
	}
}
