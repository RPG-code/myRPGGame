package rpg;

import java.util.Random;
import java.util.ArrayList;
public class Armor{
    private String type;
    private double defensive;
    private double weight;
    private String part;
    private String quality;
    private String name;
    private Random rgen;
    private ArrayList<String> pieces;
    private ArrayList<String> posTypes;
    private int piece;
    public Armor(int level){
        rgen = new Random();
        pieces = new ArrayList<>();
        pieces.add("Chest");
        pieces.add("Head");
        pieces.add("Legs");
        pieces.add("Arms");
        pieces.add("Feet");
        piece = rgen.nextInt(5);
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
        if(piece == 0){
            part = pieces.get(piece);
            posTypes = new ArrayList<>();
            posTypes.add("Heavy");
            posTypes.add("Medium");
            posTypes.add("Light");
            int posWeight = rgen.nextInt(3);
            if(posWeight == 0){
                type = "Heavy";
                name = quality + " " + "Cuirasse";
                defensive = 10 + (-3 + rgen.nextInt(7));
                weight = 10 + rgen.nextInt(11);
                if(quality.equals("Craftsman")){
                    defensive += 20 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Guild")){
                    defensive += 40 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Expert")){
                    defensive += 60 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Master")){
                    defensive += 80 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Legendary")){
                    defensive += 100 + (-10 + rgen.nextInt(21));
                }
            }
            if(posWeight == 1){
                type = "Medium";
                name = quality + " " + "Jack";
                defensive = 7 + (-3 + rgen.nextInt(7));
                weight = 7 + rgen.nextInt(6);
                if(quality.equals("Craftsman")){
                    defensive += 14 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Guild")){
                    defensive += 28 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Expert")){
                    defensive += 42 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Master")){
                    defensive += 56 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Legendary")){
                    defensive += 70 + (-10 + rgen.nextInt(21));
                }
            }
            if(posWeight == 2){
                type = "Light";
                name = quality + " " + "Jerkin";
                defensive = 4 + (-2 + rgen.nextInt(5));
                weight = 4 + rgen.nextInt(5);
                if(quality.equals("Craftsman")){
                    defensive += 8 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Guild")){
                    defensive += 16 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Expert")){
                    defensive += 24 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Master")){
                    defensive += 32 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Legendary")){
                    defensive += 40 + (-10 + rgen.nextInt(21));
                }
            }
        }
        if(piece == 1){
            part = pieces.get(piece);
            posTypes = new ArrayList<>();
            posTypes.add("Heavy");
            posTypes.add("Medium");
            posTypes.add("Light");             
            int posWeight = rgen.nextInt(3);
            if(posWeight == 0){
                type = "Heavy";
                name = quality + " " + "Helm";
                defensive = 5 + (-2 + rgen.nextInt(5));
                weight = 5 + rgen.nextInt(4);
                if(quality.equals("Craftsman")){
                    defensive += 10 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Guild")){
                    defensive += 20 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Expert")){
                    defensive += 30 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Master")){
                    defensive += 40 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Legendary")){
                    defensive += 50 + (-10 + rgen.nextInt(21));
                }
            }
            if(posWeight == 1){
                type = "Medium";
                name = quality + " " + "Helmet";
                defensive = 3 + (-2 + rgen.nextInt(5));
                weight = 3 + rgen.nextInt(5);
                if(quality.equals("Craftsman")){
                    defensive += 6 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Guild")){
                    defensive += 12 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Expert")){
                    defensive += 18 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Master")){
                    defensive += 24 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Legendary")){
                    defensive += 30 + (-10 + rgen.nextInt(21));
                }
            }
            if(posWeight == 2){
                type = "Light";
                name = quality + " " + "Hood";
                defensive = 2 + (-1 + rgen.nextInt(3));
                weight = 1 + rgen.nextInt(3);
                if(quality.equals("Craftsman")){
                    defensive += 4 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Guild")){
                    defensive += 8 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Expert")){
                    defensive += 12 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Master")){
                    defensive += 16 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Legendary")){
                    defensive += 20 + (-10 + rgen.nextInt(21));
                }
            }
        }
        if(piece == 2){
            part = pieces.get(piece);
            posTypes = new ArrayList<>();
            posTypes.add("Heavy");
            posTypes.add("Medium");
            posTypes.add("Light");             
            int posWeight = rgen.nextInt(3);
            if(posWeight == 0){
                type = "Heavy";
                name = quality + " " + "Greaves";
                defensive = 8 + (-3 + rgen.nextInt(7));
                weight = 6 + rgen.nextInt(8);
                if(quality.equals("Craftsman")){
                    defensive += 16 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Guild")){
                    defensive += 32 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Expert")){
                    defensive += 48 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Master")){
                    defensive += 64 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Legendary")){
                    defensive += 80 + (-10 + rgen.nextInt(21));
                }
            }
            if(posWeight == 1){
                type = "Medium";
                name = quality + " " + "Guards";
                defensive = 5 + (-2 + rgen.nextInt(5));
                weight = 4 + rgen.nextInt(5);
                if(quality.equals("Craftsman")){
                    defensive += 10 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Guild")){
                    defensive += 20 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Expert")){
                    defensive += 30 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Master")){
                    defensive += 40 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Legendary")){
                    defensive += 50 + (-10 + rgen.nextInt(21));
                }
            }
            if(posWeight == 2){
                type = "Light";
                name = quality + " " + "Breeches";
                defensive = 3 + (-2 + rgen.nextInt(5));
                weight = 3 + rgen.nextInt(4);
                if(quality.equals("Craftsman")){
                    defensive += 6 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Guild")){
                    defensive += 12 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Expert")){
                    defensive += 18 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Master")){
                    defensive += 24 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Legendary")){
                    defensive += 30 + (-10 + rgen.nextInt(21));
                }
            }
        }
        if(piece == 3){
            part = pieces.get(piece);
            posTypes = new ArrayList<>();
            posTypes.add("Heavy");
            posTypes.add("Medium");
            posTypes.add("Light");            
            int posWeight = rgen.nextInt(3);
            if(posWeight == 0){
                type = "Heavy";
                name = quality + " " + "Gauntlets";
                defensive = 3 + (-2 + rgen.nextInt(5));
                weight = 4 + rgen.nextInt(4);
                if(quality.equals("Craftsman")){
                    defensive += 6 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Guild")){
                    defensive += 12 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Expert")){
                    defensive += 18 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Master")){
                    defensive += 24 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Legendary")){
                    defensive += 30 + (-10 + rgen.nextInt(21));
                }
            }
            if(posWeight == 1){
                type = "Medium";
                name = quality + " " + "Bracers";
                defensive = 2 + (-1 + rgen.nextInt(3));
                weight = 2 + rgen.nextInt(4);
                if(quality.equals("Craftsman")){
                    defensive += 4 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Guild")){
                    defensive += 8 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Expert")){
                    defensive += 12 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Master")){
                    defensive += 16 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Legendary")){
                    defensive += 20 + (-10 + rgen.nextInt(21));
                }
            }
            if(posWeight == 2){
                type = "Light";
                name = quality + " " + "Gloves";
                defensive = 1 + (rgen.nextInt(3));
                weight = 1 + rgen.nextInt(3);
                if(quality.equals("Craftsman")){
                    defensive += 2 + (-1 + rgen.nextInt(3));
                }
                if(quality.equals("Guild")){
                    defensive += 4 + (-2 + rgen.nextInt(5));
                }
                if(quality.equals("Expert")){
                    defensive += 6 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Master")){
                    defensive += 8 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Legendary")){
                    defensive += 10 + (-5 + rgen.nextInt(11));
                }
            }
        }
        if(piece == 4){
            part = pieces.get(piece);
            posTypes = new ArrayList<>();
            posTypes.add("Heavy");
            posTypes.add("Medium");
            posTypes.add("Light");          
            int posWeight = rgen.nextInt(3);
            if(posWeight == 0){
                type = "Heavy";
                name = quality + " " + "Sabatons";
                defensive = 3 + (-2 + rgen.nextInt(5));
                weight = 4 + rgen.nextInt(4);
                if(quality.equals("Craftsman")){
                    defensive += 6 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Guild")){
                    defensive += 12 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Expert")){
                    defensive += 18 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Master")){
                    defensive += 24 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Legendary")){
                    defensive += 30 + (-10 + rgen.nextInt(21));
                }
            }
            if(posWeight == 1){
                type = "Medium";
                name = quality + " " + "Boots";
                defensive = 2 + (-1 + rgen.nextInt(3));
                weight = 2 + rgen.nextInt(4);
                if(quality.equals("Craftsman")){
                    defensive += 4 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Guild")){
                    defensive += 8 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Expert")){
                    defensive += 12 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Master")){
                    defensive += 16 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Legendary")){
                    defensive += 20 + (-10 + rgen.nextInt(21));
                }
            }
            if(posWeight == 2){
                type = "Light";
                name = quality + " " + "Shoes";
                defensive = 1 + (rgen.nextInt(3));
                weight = 1 + rgen.nextInt(3);
                if(quality.equals("Craftsman")){
                    defensive += 2 + (-1 + rgen.nextInt(3));
                }
                if(quality.equals("Guild")){
                    defensive += 4 + (-2 + rgen.nextInt(5));
                }
                if(quality.equals("Expert")){
                    defensive += 6 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Master")){
                    defensive += 8 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Legendary")){
                    defensive += 10 + (-5 + rgen.nextInt(11));
                }
            }
        }
    }

    public Armor(String type, String part){
        rgen = new Random();
        quality = "Apprentice";
        this.type = type;
        this.part = part;
        if(part.equals("Chest")){
            if(type.equals("Heavy")){
                name = quality + " " + "Cuirasse";
                defensive = 10 + (-3 + rgen.nextInt(7));
                weight = 10 + rgen.nextInt(11);
            }
            if(type.equals("Medium")){
                name = quality + " " + "Jack";
                defensive = 7 + (-3 + rgen.nextInt(7));
                weight = 7 + rgen.nextInt(6);
            }
            if(type.equals("Light")){
                name = quality + " " + "Jerkin";
                defensive = 4 + (-2 + rgen.nextInt(5));
                weight = 4 + rgen.nextInt(5);
            }
        }
        if(part.equals("Head")){
            if(type.equals("Heavy")){
                name = quality + " " + "Helm";
                defensive = 5 + (-2 + rgen.nextInt(5));
                weight = 5 + rgen.nextInt(4);
            }
            if(type.equals("Medium")){
                name = quality + " " + "Helmet";
                defensive = 3 + (-2 + rgen.nextInt(5));
                weight = 3 + rgen.nextInt(5);
            }
            if(type.equals("Light")){
                name = quality + " " + "Hood";
                defensive = 2 + (-1 + rgen.nextInt(3));
                weight = 1 + rgen.nextInt(3);
            }
        }
        if(part.equals("Legs")){
            if(type.equals("Heavy")){
                name = quality + " " + "Greaves";
                defensive = 8 + (-3 + rgen.nextInt(7));
                weight = 6 + rgen.nextInt(8);
            }
            if(type.equals("Medium")){
                name = quality + " " + "Guards";
                defensive = 5 + (-2 + rgen.nextInt(5));
                weight = 4 + rgen.nextInt(5);
            }
            if(type.equals("Light")){
                name = quality + " " + "Breeches";
                defensive = 3 + (-2 + rgen.nextInt(5));
                weight = 3 + rgen.nextInt(4);
            }
        }
        if(part.equals("Arms")){
            if(type.equals("Heavy")){
                name = quality + " " + "Gauntlets";
                defensive = 3 + (-2 + rgen.nextInt(5));
                weight = 4 + rgen.nextInt(4);
            }
            if(type.equals("Medium")){
                name = quality + " " + "Bracers";
                defensive = 2 + (-1 + rgen.nextInt(3));
                weight = 2 + rgen.nextInt(4);
            }
            if(type.equals("Light")){
                name = quality + " " + "Gloves";
                defensive = 1 + (rgen.nextInt(3));
                weight = 1 + rgen.nextInt(3);
            }
        }
        if(part.equals("Feet")){
            if(type.equals("Heavy")){
                name = quality + " " + "Sabatons";
                defensive = 3 + (-2 + rgen.nextInt(5));
                weight = 4 + rgen.nextInt(4);
            }
            if(type.equals("Medium")){
                name = quality + " " + "Boots";
                defensive = 2 + (-1 + rgen.nextInt(3));
                weight = 2 + rgen.nextInt(4);
            }
            if(type.equals("Light")){
                name = quality + " " + "Shoes";
                defensive = 1 + (rgen.nextInt(3));
                weight = 1 + rgen.nextInt(3);
            }
        }
    }

    public Armor(String part, int qualNum){
        rgen = new Random();
        if(qualNum == 1){
            quality = "Apprentice";
        }else if(qualNum == 2){
            quality = "Craftsman";
        }else if(qualNum == 3){
            quality = "Guild";
        }else if(qualNum == 4){
            quality = "Expert";
        }else if(qualNum == 5){
            quality = "Master";
        }else{
            quality = "Legendary";
        }
        this.type = type;
        this.part = part;
        if(this.part.equals("Chest")){
            posTypes = new ArrayList<>();
            posTypes.add("Heavy");
            posTypes.add("Medium");
            posTypes.add("Light");
            int posWeight = rgen.nextInt(3);
            if(posWeight == 0){
                type = "Heavy";
                name = quality + " " + "Cuirasse";
                defensive = 10 + (-3 + rgen.nextInt(7));
                weight = 10 + rgen.nextInt(11);
                if(quality.equals("Craftsman")){
                    defensive += 20 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Guild")){
                    defensive += 40 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Expert")){
                    defensive += 60 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Master")){
                    defensive += 80 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Legendary")){
                    defensive += 100 + (-10 + rgen.nextInt(21));
                }
            }
            if(posWeight == 1){
                type = "Medium";
                name = quality + " " + "Jack";
                defensive = 7 + (-3 + rgen.nextInt(7));
                weight = 7 + rgen.nextInt(6);
                if(quality.equals("Craftsman")){
                    defensive += 14 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Guild")){
                    defensive += 28 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Expert")){
                    defensive += 42 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Master")){
                    defensive += 56 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Legendary")){
                    defensive += 70 + (-10 + rgen.nextInt(21));
                }
            }
            if(posWeight == 2){
                type = "Light";
                name = quality + " " + "Jerkin";
                defensive = 4 + (-2 + rgen.nextInt(5));
                weight = 4 + rgen.nextInt(5);
                if(quality.equals("Craftsman")){
                    defensive += 8 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Guild")){
                    defensive += 16 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Expert")){
                    defensive += 24 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Master")){
                    defensive += 32 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Legendary")){
                    defensive += 40 + (-10 + rgen.nextInt(21));
                }
            }
        }
        if(this.part.equals("Head")){
            posTypes = new ArrayList<>();
            posTypes.add("Heavy");
            posTypes.add("Medium");
            posTypes.add("Light");             
            int posWeight = rgen.nextInt(3);
            if(posWeight == 0){
                type = "Heavy";
                name = quality + " " + "Helm";
                defensive = 5 + (-2 + rgen.nextInt(5));
                weight = 5 + rgen.nextInt(4);
                if(quality.equals("Craftsman")){
                    defensive += 10 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Guild")){
                    defensive += 20 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Expert")){
                    defensive += 30 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Master")){
                    defensive += 40 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Legendary")){
                    defensive += 50 + (-10 + rgen.nextInt(21));
                }
            }
            if(posWeight == 1){
                type = "Medium";
                name = quality + " " + "Helmet";
                defensive = 3 + (-2 + rgen.nextInt(5));
                weight = 3 + rgen.nextInt(5);
                if(quality.equals("Craftsman")){
                    defensive += 6 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Guild")){
                    defensive += 12 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Expert")){
                    defensive += 18 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Master")){
                    defensive += 24 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Legendary")){
                    defensive += 30 + (-10 + rgen.nextInt(21));
                }
            }
            if(posWeight == 2){
                type = "Light";
                name = quality + " " + "Hood";
                defensive = 2 + (-1 + rgen.nextInt(3));
                weight = 1 + rgen.nextInt(3);
                if(quality.equals("Craftsman")){
                    defensive += 4 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Guild")){
                    defensive += 8 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Expert")){
                    defensive += 12 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Master")){
                    defensive += 16 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Legendary")){
                    defensive += 20 + (-10 + rgen.nextInt(21));
                }
            }
        }
        if(this.part.equals("Legs")){
            posTypes = new ArrayList<>();
            posTypes.add("Heavy");
            posTypes.add("Medium");
            posTypes.add("Light");             
            int posWeight = rgen.nextInt(3);
            if(posWeight == 0){
                type = "Heavy";
                name = quality + " " + "Greaves";
                defensive = 8 + (-3 + rgen.nextInt(7));
                weight = 6 + rgen.nextInt(8);
                if(quality.equals("Craftsman")){
                    defensive += 16 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Guild")){
                    defensive += 32 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Expert")){
                    defensive += 48 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Master")){
                    defensive += 64 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Legendary")){
                    defensive += 80 + (-10 + rgen.nextInt(21));
                }
            }
            if(posWeight == 1){
                type = "Medium";
                name = quality + " " + "Guards";
                defensive = 5 + (-2 + rgen.nextInt(5));
                weight = 4 + rgen.nextInt(5);
                if(quality.equals("Craftsman")){
                    defensive += 10 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Guild")){
                    defensive += 20 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Expert")){
                    defensive += 30 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Master")){
                    defensive += 40 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Legendary")){
                    defensive += 50 + (-10 + rgen.nextInt(21));
                }
            }
            if(posWeight == 2){
                type = "Light";
                name = quality + " " + "Breeches";
                defensive = 3 + (-2 + rgen.nextInt(5));
                weight = 3 + rgen.nextInt(4);
                if(quality.equals("Craftsman")){
                    defensive += 6 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Guild")){
                    defensive += 12 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Expert")){
                    defensive += 18 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Master")){
                    defensive += 24 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Legendary")){
                    defensive += 30 + (-10 + rgen.nextInt(21));
                }
            }
        }
        if(this.part.equals("Arms")){
            posTypes = new ArrayList<>();
            posTypes.add("Heavy");
            posTypes.add("Medium");
            posTypes.add("Light");            
            int posWeight = rgen.nextInt(3);
            if(posWeight == 0){
                type = "Heavy";
                name = quality + " " + "Gauntlets";
                defensive = 3 + (-2 + rgen.nextInt(5));
                weight = 4 + rgen.nextInt(4);
                if(quality.equals("Craftsman")){
                    defensive += 6 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Guild")){
                    defensive += 12 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Expert")){
                    defensive += 18 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Master")){
                    defensive += 24 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Legendary")){
                    defensive += 30 + (-10 + rgen.nextInt(21));
                }
            }
            if(posWeight == 1){
                type = "Medium";
                name = quality + " " + "Bracers";
                defensive = 2 + (-1 + rgen.nextInt(3));
                weight = 2 + rgen.nextInt(4);
                if(quality.equals("Craftsman")){
                    defensive += 4 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Guild")){
                    defensive += 8 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Expert")){
                    defensive += 12 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Master")){
                    defensive += 16 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Legendary")){
                    defensive += 20 + (-10 + rgen.nextInt(21));
                }
            }
            if(posWeight == 2){
                type = "Light";
                name = quality + " " + "Gloves";
                defensive = 1 + (rgen.nextInt(3));
                weight = 1 + rgen.nextInt(3);
                if(quality.equals("Craftsman")){
                    defensive += 2 + (-1 + rgen.nextInt(3));
                }
                if(quality.equals("Guild")){
                    defensive += 4 + (-2 + rgen.nextInt(5));
                }
                if(quality.equals("Expert")){
                    defensive += 6 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Master")){
                    defensive += 8 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Legendary")){
                    defensive += 10 + (-5 + rgen.nextInt(11));
                }
            }
        }
        if(this.part.equals("Feet")){
            posTypes = new ArrayList<>();
            posTypes.add("Heavy");
            posTypes.add("Medium");
            posTypes.add("Light");          
            int posWeight = rgen.nextInt(3);
            if(posWeight == 0){
                type = "Heavy";
                name = quality + " " + "Sabatons";
                defensive = 3 + (-2 + rgen.nextInt(5));
                weight = 4 + rgen.nextInt(4);
                if(quality.equals("Craftsman")){
                    defensive += 6 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Guild")){
                    defensive += 12 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Expert")){
                    defensive += 18 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Master")){
                    defensive += 24 + (-10 + rgen.nextInt(21));
                }
                if(quality.equals("Legendary")){
                    defensive += 30 + (-10 + rgen.nextInt(21));
                }
            }
            if(posWeight == 1){
                type = "Medium";
                name = quality + " " + "Boots";
                defensive = 2 + (-1 + rgen.nextInt(3));
                weight = 2 + rgen.nextInt(4);
                if(quality.equals("Craftsman")){
                    defensive += 4 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Guild")){
                    defensive += 8 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Expert")){
                    defensive += 12 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Master")){
                    defensive += 16 + (-5 + rgen.nextInt(11));
                }
                if(quality.equals("Legendary")){
                    defensive += 20 + (-10 + rgen.nextInt(21));
                }
            }
            if(posWeight == 2){
                type = "Light";
                name = quality + " " + "Shoes";
                defensive = 1 + (rgen.nextInt(3));
                weight = 1 + rgen.nextInt(3);
                if(quality.equals("Craftsman")){
                    defensive += 2 + (-1 + rgen.nextInt(3));
                }
                if(quality.equals("Guild")){
                    defensive += 4 + (-2 + rgen.nextInt(5));
                }
                if(quality.equals("Expert")){
                    defensive += 6 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Master")){
                    defensive += 8 + (-3 + rgen.nextInt(7));
                }
                if(quality.equals("Legendary")){
                    defensive += 10 + (-5 + rgen.nextInt(11));
                }
            }
        }
    }

    public String getName(){
        return name;
    }

    public String getPart(){
        return part;
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
}
