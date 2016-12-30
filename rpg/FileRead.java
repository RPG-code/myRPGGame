package rpg;

import java.io.*;
import java.util.ArrayList;

class FileRead{
	
	/* Instead of storing the information as Buffered readers, and then reading the data later on, 
	 * We're going to read all of the data right away and store it in ArrayLists
	 */
	
	private BufferedReader raceRead;
//	private BufferedReader magicRead;
	private BufferedReader storyRead;
	private BufferedReader styleRead;
	private BufferedReader roomRead;
	private BufferedReader areaRead;

	private ArrayList<String> magicData = new ArrayList<String>(); //store all of the magic data here
	private ArrayList<String> raceData = new ArrayList<String>();
	private ArrayList<String> storyData = new ArrayList<String>();
	private ArrayList<String> styleData = new ArrayList<String>();
	private ArrayList<String> roomData = new ArrayList<String>();
	private ArrayList<String> areaData = new ArrayList<String>();
	
	/* Location of data files:
	   The data files are in a subdirectory called "data", one level below where the source code is.
	   Thus, theoretically one could just use the path "./data".
	   However, since this is in a package called "rpg", 
	   the code must be compiled and run from one level above where the source code is.
	   Thus the path name must be "package.folder", or "./rpg/data/"

	 */
	private String path = "./rpg/data/";

	FileRead(){    	
		raceRead = readme("race.txt");
		//magicRead = readme("magic.txt");
		storyRead = readme("story.txt");
		styleRead = readme("weaponstyle.txt");
		roomRead = readme("rooms.txt");
		areaRead = readme("areas.txt");

		//store data in an arraylist of Strings
		magicData = readData("magic.txt");
		
		readRaceData("race.txt");
		
		
	}

	ArrayList<String> getMagicData() {
		return magicData;
	}

	
	ArrayList<String> readData(String fname) {
		BufferedReader br = null;
		ArrayList<String> dataArray = new ArrayList<String>();
		
		try{
			br = new BufferedReader(new FileReader(new File(path + fname)));
		}
		catch (FileNotFoundException fnfe)
		{
			System.out.println(path + fname + " file not found");
			System.exit(0);
		}
		
		try {
			String text = null;
			while ((text = br.readLine()) != null){
				if (text.charAt(0) == ';' || text.charAt(0) == '#') continue;				
				dataArray.add(text);  
			}
			br.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.exit(0);
		}
		return dataArray;
	}
	
	//special case for reaading Race data due to unusual data format
	void readRaceData(String fname) {
		//open file
		BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader(new File(path + fname)));
		}
		catch (FileNotFoundException fnfe)
		{
			System.out.println(path + fname + " file not found");
			System.exit(0);
		}
		
		//read line and create race object
		try {
			String text = null;
			while ((text = br.readLine()) != null){
				if (text.charAt(0) == ';' || text.charAt(0) == '#') continue;				
				
				String[] tokenize = text.split(",");
				String raceName = tokenize[0];
				//check for correct format. The first line should not have :
				if (raceName.contains(":")) {
					System.out.println("Error in race.txt file format!");
					System.exit(0);
				}
				Race r = new Race(tokenize);
				
				//now read second line, the description.
				text = br.readLine();
				if (text == null ){	//no description
					Race.raceList.add(r);
					continue;
				}
				char colon = text.charAt(raceName.length());
				if (colon == ':') {
					r.setDesc(text);
				}
				Race.raceList.add(r);				
			}
			
			br.close();
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.exit(0);
		}
	}
	
	
	BufferedReader readme(String fname) {
		BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader(new File(path + fname)));
		}
		catch (FileNotFoundException fnfe)
		{
			System.out.println(path + fname + " file not found");
		}
		return br;
	}




	public String[] raceReader(String race){
		try{
			String fileRead = raceRead.readLine();
			// loop until all lines are read
			while (fileRead != null){
				// use string.split to load a string array with the values from each line of
				// the file, using a comma as the delimiter
				String[] tokenize = fileRead.split(",");
				// assume file is made correctly
				String tempRace = tokenize[0];
				if(tempRace.equals(race)){
					raceRead.close();
					return tokenize;
				}
				fileRead = raceRead.readLine();
			}
			// close file stream
			raceRead.close();
			return null;
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
			return null;
		}
	}

	public String[] storyReader(String story){
		try{
			String fileRead = storyRead.readLine();
			// loop until all lines are read
			while (fileRead != null){
				// use string.split to load a string array with the values from each line of
				// the file, using a comma as the delimiter
				String[] tokenize = fileRead.split(",");
				// assume file is made correctly
				String tempStory = tokenize[0];
				if(tempStory.equals(story)){
					storyRead.close();
					return tokenize;
				}
				fileRead = storyRead.readLine();
			}
			// close file stream
			storyRead.close();
			return null;
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
			return null;
		}
	}



	public String[] styleReader(Weapon weapon1,Weapon weapon2){
		try{
		    styleRead = new BufferedReader(new FileReader(path + "weaponstyle.txt"));
		}
		catch (FileNotFoundException fnfe)
		{
		   System.out.println("file not found");
		}
		try{
			String style = null;
			if(weapon1.getType().equals("Sword")){
				if(weapon2 != null && weapon2.getType().equals("Sword")){
					style = "DW Sword";
				}else if(weapon2 != null && weapon2.getType().equals("Shield")){
					style = "Sword+Shield";
				}else{
					style = "Sword";
				}
			}
			if(weapon1.getType().equals("Axe")){
				if(weapon2 != null && weapon2.getType().equals("Axe")){
					style = "DW Axe";
				}else if(weapon2 != null && weapon2.getType().equals("Shield")){
					style = "Axe+Shield";
				}else{
					style = "Axe";
				}
			}
			if(weapon1.getType().equals("Mace")){
				if(weapon2 != null && weapon2.getType().equals("Mace")){
					style = "DW Mace";
				}else if(weapon2 != null && weapon2.getType().equals("Shield")){
					style = "Mace+Shield";
				}else{
					style = "Mace";
				}
			}
			if(weapon1.getType().equals("Dagger")){
				if(weapon2 != null && weapon2.getType().equals("Dagger")){
					style = "DW Dagger";
				}else{
					style = "Dagger";
				}
			}
			if(weapon1.getType().equals("Shortspear")){
				if(weapon2 != null && weapon2.getType().equals("Shield")){
					style = "Shortspear+Shield";
				}else{
					style = "Shortspear";
				}
			}
			if(weapon1.getType().equals("Greatsword")){
				style = "Greatsword";
			}
			if(weapon1.getType().equals("Great Axe")){
				style = "Great Axe";
			}
			if(weapon1.getType().equals("Warhammer")){
				style = "Warhammer";
			}
			if(weapon1.getType().equals("Spear")){
				style = "Spear";
			}
			if(weapon1.getType().equals("Staff")){
				style = "Staff";
			}
			if(weapon1.getType().equals("Bow")){
				style = "Bow";
			}
			if(weapon1.getType().equals("Crossbow")){
				style = "Crossbow";
			}
			String fileRead = styleRead.readLine();
			// loop until all lines are read
			while (fileRead != null){
				// use string.split to load a string array with the values from each line of
				// the file, using a comma as the delimiter
				String[] tokenize = fileRead.split(",");
				// assume file is made correctly
				String tempStyle = tokenize[0];
				if(tempStyle.equals(style)){
					styleRead.close();
					return tokenize;
				}
				fileRead = styleRead.readLine();
			}
			// close file stream
			styleRead.close();
			return null;
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
			return null;
		}
	}

	public String[] roomReader(String room){
		try{
			String fileRead = roomRead.readLine();
			// loop until all lines are read
			while (fileRead != null){
				// use string.split to load a string array with the values from each line of
				// the file, using a comma as the delimiter
				String[] tokenize = fileRead.split(",");
				// assume file is made correctly
				String tempRoom = tokenize[0];
				if(tempRoom.equals(room)){
					roomRead.close();
					return tokenize;
				}
				fileRead = roomRead.readLine();
			}
			// close file stream
			roomRead.close();
			return null;
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
			return null;
		}
	}
	public String[] areaReader(int level){
		try{
			String fileRead = areaRead.readLine();
			// loop until all lines are read
			while (fileRead != null){
				// use string.split to load a string array with the values from each line of
				// the file, using a comma as the delimiter
				String[] tokenize = fileRead.split(",");
				// assume file is made correctly
				String tempArea = tokenize[0];
				if(Integer.parseInt(tempArea) == level){
					areaRead.close();
					return tokenize;
				}
				fileRead = areaRead.readLine();
			}
			// close file stream
			areaRead.close();
			return null;
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
			return null;
		}
	}
}
