import java.util.Random;
import java.util.ArrayList;
public class Weapon
{
    private String type;
    private double offensive;
    private double defensive;
    private double weight;
    private int hands;
    private String quality;
    private String name;
    private Random rgen;
    private int weapon;
    private ArrayList<String> posNames;
    private ArrayList<String> weapons;
    public Weapon(int level){
        rgen = new Random();
        weapons = new ArrayList<>();
        weapons.add("Sword");
        weapons.add("Axe");
        weapons.add("Mace");
        weapons.add("Dagger");
        weapons.add("Shortspear");
        weapons.add("Greatsword");
        weapons.add("Great Axe");
        weapons.add("Warhammer");
        weapons.add("Spear");
        weapons.add("Staff");
        weapons.add("Bow");
        weapons.add("Crossbow");
        weapons.add("Shield");
        weapon = rgen.nextInt(13);
        if(level == 1){
            int posQuality = 1 + rgen.nextInt(100);
            if(posQuality >= 1 && posQuality <= 40){
                quality = "Apprentice";
            }else if(posQuality >= 41 && posQuality <= 70){
                quality = "Craftsman";
            }else if(posQuality >= 71 && posQuality <= 90){
                quality = "Guild";
            }else if(posQuality >= 91 && posQuality <= 96){
                quality = "Expert";
            }else if(posQuality >= 97 && posQuality <= 99){
                quality = "Master";
            }else if(posQuality == 100){
                quality = "Legendary";
            }
        }else if(level == 2){
            int posQuality = 1 + rgen.nextInt(80);
            if(posQuality >= 1 && posQuality <= 20){
                quality = "Apprentice";
            }else if(posQuality >= 21 && posQuality <= 55){
                quality = "Craftsman";
            }else if(posQuality >= 56 && posQuality <= 70){
                quality = "Guild";
            }else if(posQuality >= 71 && posQuality <= 76){
                quality = "Expert";
            }else if(posQuality >= 77 && posQuality <= 79){
                quality = "Master";
            }else if(posQuality == 80){
                quality = "Legendary";
            }
        }else if(level == 3){
            int posQuality = 1 + rgen.nextInt(60);
            if(posQuality >= 1 && posQuality <= 15){
                quality = "Apprentice";
            }else if(posQuality >= 16 && posQuality <= 30){
                quality = "Craftsman";
            }else if(posQuality >= 31 && posQuality <= 50){
                quality = "Guild";
            }else if(posQuality >= 51 && posQuality <= 56){
                quality = "Expert";
            }else if(posQuality >= 57 && posQuality <= 59){
                quality = "Master";
            }else if(posQuality == 60){
                quality = "Legendary";
            }
        }else if(level == 4){
            int posQuality = 1 + rgen.nextInt(40);
            if(posQuality >= 1 && posQuality <= 8){
                quality = "Apprentice";
            }else if(posQuality >= 9 && posQuality <= 20){
                quality = "Craftsman";
            }else if(posQuality >= 21 && posQuality <= 30){
                quality = "Guild";
            }else if(posQuality >= 31 && posQuality <= 36){
                quality = "Expert";
            }else if(posQuality >= 37 && posQuality <= 39){
                quality = "Master";
            }else if(posQuality == 40){
                quality = "Legendary";
            }
        }else if(level == 5){
            int posQuality = 1 + rgen.nextInt(30);
            if(posQuality >= 1 && posQuality <= 4){
                quality = "Apprentice";
            }else if(posQuality >= 5 && posQuality <= 10){
                quality = "Craftsman";
            }else if(posQuality >= 11 && posQuality <= 18){
                quality = "Guild";
            }else if(posQuality >= 19 && posQuality <= 25){
                quality = "Expert";
            }else if(posQuality >= 26 && posQuality <= 29){
                quality = "Master";
            }else if(posQuality == 30){
                quality = "Legendary";
            }
        }else if(level == 6){
            int posQuality = 1 + rgen.nextInt(20);
            if(posQuality >= 1 && posQuality <= 2){
                quality = "Apprentice";
            }else if(posQuality >= 3 && posQuality <= 4){
                quality = "Craftsman";
            }else if(posQuality >= 5 && posQuality <= 6){
                quality = "Guild";
            }else if(posQuality >= 7 && posQuality <= 10){
                quality = "Expert";
            }else if(posQuality >= 11 && posQuality <= 18){
                quality = "Master";
            }else if(posQuality >= 19 && posQuality <= 20){
                quality = "Legendary";
            }
        }
        if(weapon == 0){
            type = weapons.get(weapon);
            posNames = new ArrayList<>();
            posNames.add("Arming Sword");
            posNames.add("Gladius");
            posNames.add("Xiphos");
            posNames.add("Jian");
            posNames.add("Rapier");
            posNames.add("Kopis");
            posNames.add("Cutlass");
            posNames.add("Sabre");
            posNames.add("Scimitar");
            posNames.add("Shotel");
            posNames.add("Khopesh");
            name = quality + " " + posNames.get(rgen.nextInt(11));
            offensive = 25 + (-10 + rgen.nextInt(21));
            defensive = 20 + (-5 + rgen.nextInt(11));
            weight = 2 + rgen.nextInt(4);
            hands = 1;
            if(quality.equals("Craftsman")){
                offensive += 30 + (-10 + rgen.nextInt(21));
                defensive += 20 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Guild")){
                offensive += 65 + (-10 + rgen.nextInt(21));
                defensive += 40 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Expert")){
                offensive += 105 + (-20 + rgen.nextInt(41));
                defensive += 60 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Master")){
                offensive += 150 + (-20 + rgen.nextInt(41));
                defensive += 80 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Legendary")){
                offensive += 200 + (-30 + rgen.nextInt(61));
                defensive += 100 + (-5 + rgen.nextInt(11));
            }
        }
        if(weapon == 1){
            type = weapons.get(weapon);
            posNames = new ArrayList<>();
            posNames.add("Ono");
            posNames.add("Dane Axe");
            posNames.add("Tomahawk");
            posNames.add("Sagaris");;
            name = quality + " " + posNames.get(rgen.nextInt(4));
            offensive = 30 + (-10 + rgen.nextInt(21));
            defensive = 17 + (-5 + rgen.nextInt(11));
            weight = 3 + rgen.nextInt(5);
            hands = 1;
            if(quality.equals("Craftsman")){
                offensive += 36 + (-10 + rgen.nextInt(21));
                defensive += 17 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Guild")){
                offensive += 78 + (-10 + rgen.nextInt(21));
                defensive += 34 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Expert")){
                offensive += 126 + (-20 + rgen.nextInt(41));
                defensive += 51 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Master")){
                offensive += 180 + (-20 + rgen.nextInt(41));
                defensive += 68 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Legendary")){
                offensive += 240 + (-30 + rgen.nextInt(61));
                defensive += 85 + (-5 + rgen.nextInt(11));
            }
        }
        if(weapon == 2){
            type = weapons.get(weapon);
            posNames = new ArrayList<>();
            posNames.add("Gada");
            posNames.add("Flanged Mace");
            posNames.add("Pernach");
            posNames.add("Shishpar");
            posNames.add("War Hammer");
            name = quality + " " + posNames.get(rgen.nextInt(5));
            offensive = 35 + (-10 + rgen.nextInt(21));
            defensive = 15 + (-5 + rgen.nextInt(11));
            weight = 4 + rgen.nextInt(5);
            hands = 1;
            if(quality.equals("Craftsman")){
                offensive += 42 + (-10 + rgen.nextInt(21));
                defensive += 15 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Guild")){
                offensive += 91 + (-10 + rgen.nextInt(21));
                defensive += 30 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Expert")){
                offensive += 147 + (-20 + rgen.nextInt(41));
                defensive += 45 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Master")){
                offensive += 210 + (-30 + rgen.nextInt(61));
                defensive += 60 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Legendary")){
                offensive += 280 + (-30 + rgen.nextInt(61));
                defensive += 75 + (-5 + rgen.nextInt(11));
            }
        }
        if(weapon == 3){
            type = weapons.get(weapon);
            posNames = new ArrayList<>();
            posNames.add("Kris");
            posNames.add("Dirk");
            posNames.add("Seax");
            posNames.add("Stiletto");
            posNames.add("Tanto");
            posNames.add("Kukri");
            posNames.add("Bowie Knife");
            posNames.add("Rondel");
            posNames.add("Corvo");
            name = quality + " " + posNames.get(rgen.nextInt(9));
            offensive = 12 + (-5 + rgen.nextInt(11));
            defensive = 7 + (-3 + rgen.nextInt(7));
            weight = 1 + rgen.nextInt(3);
            hands = 1;
            if(quality.equals("Craftsman")){
                offensive = 14 + (-5 + rgen.nextInt(11));
                defensive += 7 + (-3 + rgen.nextInt(7));
            }
            if(quality.equals("Guild")){
                offensive = 30 + (-5 + rgen.nextInt(11));
                defensive += 14 + (-3 + rgen.nextInt(7));
            }
            if(quality.equals("Expert")){
                offensive = 48 + (-10 + rgen.nextInt(21));
                defensive += 21 + (-3 + rgen.nextInt(7));
            }
            if(quality.equals("Master")){
                offensive = 68 + (-10 + rgen.nextInt(21));
                defensive += 28 + (-3 + rgen.nextInt(7));
            }
            if(quality.equals("Legendary")){
                offensive = 100 + (-20 + rgen.nextInt(41));
                defensive += 35 + (-3 + rgen.nextInt(7));
            }
        }
        if(weapon == 4){
            type = weapons.get(weapon);
            posNames = new ArrayList<>();
            posNames.add("Iklwa");
            posNames.add("Dory");
            posNames.add("Hasta");
            posNames.add("Qiang");
            posNames.add("Sibat");
            name = quality + " " + posNames.get(rgen.nextInt(5));
            offensive = 27 + (-10 + rgen.nextInt(21));
            defensive = 15 + (-5 + rgen.nextInt(11));
            weight = 2 + rgen.nextInt(5);
            hands = 1;
            if(quality.equals("Craftsman")){
                offensive += 32 + (-10 + rgen.nextInt(21));
                defensive += 15 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Guild")){
                offensive += 69 + (-10 + rgen.nextInt(21));
                defensive += 30 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Expert")){
                offensive += 112 + (-20 + rgen.nextInt(41));
                defensive += 45 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Master")){
                offensive += 161 + (-20 + rgen.nextInt(41));
                defensive += 60 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Legendary")){
                offensive += 213 + (-30 + rgen.nextInt(61));
                defensive += 75 + (-5 + rgen.nextInt(11));
            }
        }
        if(weapon == 5){
            type = weapons.get(weapon);
            posNames = new ArrayList<>();
            posNames.add("Claymore");
            posNames.add("Longsword");
            posNames.add("Zweihander");
            posNames.add("Katana");
            posNames.add("Macuahuitl");
            name = quality + " " + posNames.get(rgen.nextInt(5));
            offensive = 35 + (-10 + rgen.nextInt(21));
            defensive = 20 + (-5 + rgen.nextInt(11));
            weight = 4 + rgen.nextInt(8);
            hands = 2;
            if(quality.equals("Craftsman")){
                offensive += 42 + (-10 + rgen.nextInt(21));
                defensive += 20 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Guild")){
                offensive += 91 + (-10 + rgen.nextInt(21));
                defensive += 40 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Expert")){
                offensive += 147 + (-20 + rgen.nextInt(41));
                defensive += 60 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Master")){
                offensive += 210 + (-30 + rgen.nextInt(61));
                defensive += 80 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Legendary")){
                offensive += 280 + (-30 + rgen.nextInt(61));
                defensive += 100 + (-5 + rgen.nextInt(11));
            }
        }
        if(weapon == 6){
            type = weapons.get(weapon);
            posNames = new ArrayList<>();
            posNames.add("Poleaxe");
            posNames.add("Parashu");
            posNames.add("Sparth Axe");
            posNames.add("Long Bearded Axe");
            name = quality + " " + posNames.get(rgen.nextInt(4));
            offensive = 40 + (-10 + rgen.nextInt(21));
            defensive = 14 + (-5 + rgen.nextInt(11));
            weight = 5 + rgen.nextInt(9);
            hands = 2;
            if(quality.equals("Craftsman")){
                offensive += 48 + (-10 + rgen.nextInt(41));
                defensive += 15 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Guild")){
                offensive += 104 + (-20 + rgen.nextInt(41));
                defensive += 30 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Expert")){
                offensive += 168 + (-20 + rgen.nextInt(41));
                defensive += 45 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Master")){
                offensive += 240 + (-30 + rgen.nextInt(61));
                defensive += 60 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Legendary")){
                offensive += 320 + (-40 + rgen.nextInt(81));
                defensive += 75 + (-5 + rgen.nextInt(11));
            }
        }
        if(weapon == 7){
            type = weapons.get(weapon);
            posNames = new ArrayList<>();
            posNames.add("Maul");
            posNames.add("Two Handed Mace");
            name = quality + " " + posNames.get(rgen.nextInt(2));
            offensive = 45 + (-10 + rgen.nextInt(21));
            defensive = 10 + (-3 + rgen.nextInt(7));
            weight = 6 + rgen.nextInt(9);
            hands = 2;
            if(quality.equals("Craftsman")){
                offensive += 54 + (-10 + rgen.nextInt(41));
                defensive += 10 + (-3 + rgen.nextInt(7));
            }
            if(quality.equals("Guild")){
                offensive += 137 + (-20 + rgen.nextInt(41));
                defensive += 20 + (-3 + rgen.nextInt(7));
            }
            if(quality.equals("Expert")){
                offensive += 209 + (-30 + rgen.nextInt(61));
                defensive += 30 + (-3 + rgen.nextInt(7));
            }
            if(quality.equals("Master")){
                offensive += 290 + (-30 + rgen.nextInt(61));
                defensive += 40 + (-3 + rgen.nextInt(7));
            }
            if(quality.equals("Legendary")){
                offensive += 380 + (-40 + rgen.nextInt(81));
                defensive += 50 + (-3 + rgen.nextInt(7));
            }
        }
        if(weapon == 8){
            type = weapons.get(weapon);
            posNames = new ArrayList<>();
            posNames.add("Winged Spear");
            posNames.add("Naginata");
            posNames.add("Tepoztopilli");
            posNames.add("Halberd");
            posNames.add("Trident");
            posNames.add("Glaive");
            name = quality + " " + posNames.get(rgen.nextInt(6));
            offensive = 32 + (-10 + rgen.nextInt(21));
            defensive = 17 + (-5 + rgen.nextInt(11));
            weight = 4 + rgen.nextInt(6);
            hands = 2;
            if(quality.equals("Craftsman")){
                offensive += 38 + (-10 + rgen.nextInt(21));
                defensive += 17 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Guild")){
                offensive += 82 + (-10 + rgen.nextInt(21));
                defensive += 34 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Expert")){
                offensive += 132 + (-20 + rgen.nextInt(41));
                defensive += 51 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Master")){
                offensive += 188 + (-20 + rgen.nextInt(41));
                defensive += 68 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Legendary")){
                offensive += 250 + (-30 + rgen.nextInt(61));
                defensive += 85 + (-5 + rgen.nextInt(11));
            }
        }
        if(weapon == 9){
            type = weapons.get(weapon);
            posNames = new ArrayList<>();
            posNames.add("Bo Staff");
            posNames.add("Quarterstaff");
            name = quality + " " + posNames.get(rgen.nextInt(2));
            offensive = 15 + (-5 + rgen.nextInt(11));
            defensive = 15 + (-5 + rgen.nextInt(11));
            weight = 2 + rgen.nextInt(4);
            hands = 2;
            if(quality.equals("Craftsman")){
                offensive += 18 + (-5 + rgen.nextInt(11));
                defensive += 15 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Guild")){
                offensive += 39 + (-10 + rgen.nextInt(21));
                defensive += 30 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Expert")){
                offensive += 63 + (-10 + rgen.nextInt(21));
                defensive += 45 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Master")){
                offensive += 90 + (-10 + rgen.nextInt(21));
                defensive += 60 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Legendary")){
                offensive += 120 + (-20 + rgen.nextInt(41));
                defensive += 75 + (-5 + rgen.nextInt(11));
            }
        }
        if(weapon == 10){
            type = weapons.get(weapon);
            posNames = new ArrayList<>();
            posNames.add("Longbow");
            posNames.add("Recurve Bow");
            posNames.add("Reflex Bow");
            posNames.add("Flatbow");
            name = quality + " " + posNames.get(rgen.nextInt(4));
            offensive = 20 + (-10 + rgen.nextInt(21));
            defensive = 0;
            weight = 2 + rgen.nextInt(5);
            hands = 2;
            if(quality.equals("Craftsman")){
                offensive += 24 + (-10 + rgen.nextInt(21));
                defensive = 0;
            }
            if(quality.equals("Guild")){
                offensive += 52 + (-10 + rgen.nextInt(21));
                defensive = 0;
            }
            if(quality.equals("Expert")){
                offensive += 84 + (-10 + rgen.nextInt(21));
                defensive = 0;
            }
            if(quality.equals("Master")){
                offensive += 120 + (-20 + rgen.nextInt(41));
                defensive = 0;
            }
            if(quality.equals("Legendary")){
                offensive += 160 + (-20 + rgen.nextInt(41));
                defensive = 0;
            }
        }
        if(weapon == 11){
            type = weapons.get(weapon);
            posNames = new ArrayList<>();
            posNames.add("Recurve Crossbow");
            posNames.add("Compound Crossbow");
            name = quality + " " + posNames.get(rgen.nextInt(2));
            offensive = 25 + (-10 + rgen.nextInt(21));
            defensive = 0;
            weight = 3 + rgen.nextInt(5);
            hands = 2;
            if(quality.equals("Craftsman")){
                offensive += 30 + (-10 + rgen.nextInt(21));
                defensive = 0;
            }
            if(quality.equals("Guild")){
                offensive += 65 + (-10 + rgen.nextInt(21));
                defensive = 0;
            }
            if(quality.equals("Expert")){
                offensive += 105 + (-20 + rgen.nextInt(41));
                defensive = 0;
            }
            if(quality.equals("Master")){
                offensive += 150 + (-20 + rgen.nextInt(41));
                defensive = 0;
            }
            if(quality.equals("Legendary")){
                offensive += 200 + (-30 + rgen.nextInt(61));
                defensive = 0;
            }
        }
        if(weapon == 12){
            type = weapons.get(weapon);
            posNames = new ArrayList<>();
            posNames.add("Hoplon");
            posNames.add("Scuda");
            posNames.add("Heater Shield");
            posNames.add("Kite Shield");
            posNames.add("Round Shield");
            posNames.add("Buckler");
            name = quality + " " + posNames.get(rgen.nextInt(6));
            offensive = 0;
            defensive = 30 + (-5 + rgen.nextInt(11));
            weight = 2 + rgen.nextInt(8);
            hands = 1;
            if(quality.equals("Craftsman")){
                offensive = 0;
                defensive += 30 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Guild")){
                offensive = 0;
                defensive += 60 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Expert")){
                offensive = 0;
                defensive += 90 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Master")){
                offensive = 0;
                defensive += 120 + (-5 + rgen.nextInt(11));
            }
            if(quality.equals("Legendary")){
                offensive = 0;
                defensive += 150 + (-5 + rgen.nextInt(11));
            }
        }
    }

    public Weapon(String type){
        rgen = new Random();
        quality = "Apprentice";
        if(type.equals("Sword")){
            this.type = type;
            posNames = new ArrayList<>();
            posNames.add("Arming Sword");
            posNames.add("Gladius");
            posNames.add("Xiphos");
            posNames.add("Jian");
            posNames.add("Rapier");
            posNames.add("Kopis");
            posNames.add("Cutlass");
            posNames.add("Sabre");
            posNames.add("Scimitar");
            posNames.add("Shotel");
            posNames.add("Khopesh");
            name = quality + " " + posNames.get(rgen.nextInt(11));
            offensive = 25 + (-10 + rgen.nextInt(21));
            defensive = 20 + (-5 + rgen.nextInt(11));
            weight = 2 + rgen.nextInt(4);
            hands = 1;
        }
        if(type.equals("Axe")){
            this.type = type;
            posNames = new ArrayList<>();
            posNames.add("Ono");
            posNames.add("Dane Axe");
            posNames.add("Tomahawk");
            posNames.add("Sagaris");;
            name = quality + " " + posNames.get(rgen.nextInt(4));
            offensive = 30 + (-10 + rgen.nextInt(21));
            defensive = 17 + (-5 + rgen.nextInt(11));
            weight = 3 + rgen.nextInt(5);
            hands = 1;
        }
        if(type.equals("Mace")){
            this.type = type;
            posNames = new ArrayList<>();
            posNames.add("Gada");
            posNames.add("Flanged Mace");
            posNames.add("Pernach");
            posNames.add("Shishpar");
            posNames.add("War Hammer");
            name = quality + " " + posNames.get(rgen.nextInt(5));
            offensive = 35 + (-10 + rgen.nextInt(21));
            defensive = 15 + (-5 + rgen.nextInt(11));
            weight = 4 + rgen.nextInt(5);
            hands = 1;
        }
        if(type.equals("Dagger")){
            this.type = type;
            posNames = new ArrayList<>();
            posNames.add("Kris");
            posNames.add("Dirk");
            posNames.add("Seax");
            posNames.add("Stiletto");
            posNames.add("Tanto");
            posNames.add("Kukri");
            posNames.add("Bowie Knife");
            posNames.add("Rondel");
            posNames.add("Corvo");
            name = quality + " " + posNames.get(rgen.nextInt(9));
            offensive = 12 + (-5 + rgen.nextInt(11));
            defensive = 7 + (-3 + rgen.nextInt(7));
            weight = 1 + rgen.nextInt(3);
            hands = 1;
        }
        if(type.equals("Shortspear")){
            this.type = type;
            posNames = new ArrayList<>();
            posNames.add("Iklwa");
            posNames.add("Dory");
            posNames.add("Hasta");
            posNames.add("Qiang");
            posNames.add("Sibat");
            name = quality + " " + posNames.get(rgen.nextInt(5));
            offensive = 27 + (-10 + rgen.nextInt(21));
            defensive = 15 + (-5 + rgen.nextInt(11));
            weight = 2 + rgen.nextInt(5);
            hands = 1;
        }
        if(type.equals("Greatsword")){
            this.type = type;
            posNames = new ArrayList<>();
            posNames.add("Claymore");
            posNames.add("Longsword");
            posNames.add("Zweihander");
            posNames.add("Katana");
            posNames.add("Macuahuitl");
            name = quality + " " + posNames.get(rgen.nextInt(5));
            offensive = 35 + (-10 + rgen.nextInt(21));
            defensive = 20 + (-5 + rgen.nextInt(11));
            weight = 4 + rgen.nextInt(8);
            hands = 2;
        }
        if(type.equals("Great Axe")){
            this.type = type;
            posNames = new ArrayList<>();
            posNames.add("Poleaxe");
            posNames.add("Parashu");
            posNames.add("Sparth Axe");
            posNames.add("Long Bearded Axe");
            name = quality + " " + posNames.get(rgen.nextInt(4));
            offensive = 40 + (-10 + rgen.nextInt(21));
            defensive = 14 + (-5 + rgen.nextInt(11));
            weight = 5 + rgen.nextInt(9);
            hands = 2;
        }
        if(type.equals("War Hammer")){
            this.type = type;
            posNames = new ArrayList<>();
            posNames.add("Maul");
            posNames.add("Two Handed Mace");
            name = quality + " " + posNames.get(rgen.nextInt(2));
            offensive = 45 + (-10 + rgen.nextInt(21));
            defensive = 10 + (-3 + rgen.nextInt(7));
            weight = 6 + rgen.nextInt(9);
            hands = 2;
        }
        if(type.equals("Spear")){
            this.type = type;
            posNames = new ArrayList<>();
            posNames.add("Winged Spear");
            posNames.add("Naginata");
            posNames.add("Tepoztopilli");
            posNames.add("Halberd");
            posNames.add("Trident");
            posNames.add("Glaive");
            name = quality + " " + posNames.get(rgen.nextInt(6));
            offensive = 32 + (-10 + rgen.nextInt(21));
            defensive = 17 + (-5 + rgen.nextInt(11));
            weight = 4 + rgen.nextInt(6);
            hands = 2;
        }
        if(type.equals("Staff")){
            this.type = type;
            posNames = new ArrayList<>();
            posNames.add("Bo Staff");
            posNames.add("Quarterstaff");
            name = quality + " " + posNames.get(rgen.nextInt(2));
            offensive = 15 + (-5 + rgen.nextInt(11));
            defensive = 15 + (-5 + rgen.nextInt(11));
            weight = 2 + rgen.nextInt(4);
            hands = 2;
        }
        if(type.equals("Bow")){
            this.type = type;
            posNames = new ArrayList<>();
            posNames.add("Longbow");
            posNames.add("Recurve Bow");
            posNames.add("Reflex Bow");
            posNames.add("Flatbow");
            name = quality + " " + posNames.get(rgen.nextInt(4));
            offensive = 20 + (-10 + rgen.nextInt(21));
            defensive = 0;
            weight = 2 + rgen.nextInt(5);
            hands = 2;
        }
        if(type.equals("Crossbow")){
            this.type = type;
            posNames = new ArrayList<>();
            posNames.add("Recurve Crossbow");
            posNames.add("Compound Crossbow");
            name = quality + " " + posNames.get(rgen.nextInt(2));
            offensive = 25 + (-10 + rgen.nextInt(21));
            defensive = 0;
            weight = 3 + rgen.nextInt(5);
            hands = 2;
        }
        if(type.equals("Shield")){
            this.type = type;
            posNames = new ArrayList<>();
            posNames.add("Hoplon");
            posNames.add("Scuda");
            posNames.add("Heater Shield");
            posNames.add("Kite Shield");
            posNames.add("Round Shield");
            posNames.add("Buckler");
            name = quality + " " + posNames.get(rgen.nextInt(6));
            offensive = 0;
            defensive = 30 + (-5 + rgen.nextInt(11));
            weight = 2 + rgen.nextInt(8);
            hands = 1;
        }
    }

    public String getName(){
        return name;
    }

    public double getOffense(){
        return offensive;
    }

    public double getDefense(){
        return defensive;
    }

    public double getWeight(){
        return weight;
    }

    public String getType(){
        return type;
    }

    public int getHands(){
        return hands;
    }

    public String getQuality(){
        return quality;
    }
}
