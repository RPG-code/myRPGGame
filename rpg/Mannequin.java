import java.util.ArrayList;
import java.util.Random;
public class Mannequin{
    private Armor head;
    private Armor chest;
    private Armor arms;
    private Armor legs;
    private Armor feet;
    private Random rgen;
    private int quality;
    public Mannequin(int level){
        rgen = new Random();
        if(level == 1){
            int posQuality = 1 + rgen.nextInt(100);
            if(posQuality >= 1 && posQuality <= 40){
                quality = 1;
            }else if(posQuality >= 41 && posQuality <= 70){
                quality = 2;
            }else if(posQuality >= 71 && posQuality <= 90){
                quality = 3;
            }else if(posQuality >= 91 && posQuality <= 96){
                quality = 4;
            }else if(posQuality >= 97 && posQuality <= 99){
                quality = 5;
            }else if(posQuality == 100){
                quality = 6;
            }
        }else if(level == 2){
            int posQuality = 1 + rgen.nextInt(80);
            if(posQuality >= 1 && posQuality <= 20){
                quality = 1;
            }else if(posQuality >= 21 && posQuality <= 55){
                quality = 2;
            }else if(posQuality >= 56 && posQuality <= 70){
                quality = 3;
            }else if(posQuality >= 71 && posQuality <= 76){
                quality = 4;
            }else if(posQuality >= 77 && posQuality <= 79){
                quality = 5;
            }else if(posQuality == 80){
                quality = 6;
            }
        }else if(level == 3){
            int posQuality = 1 + rgen.nextInt(60);
            if(posQuality >= 1 && posQuality <= 15){
                quality = 1;
            }else if(posQuality >= 16 && posQuality <= 30){
                quality = 2;
            }else if(posQuality >= 31 && posQuality <= 50){
                quality = 3;
            }else if(posQuality >= 51 && posQuality <= 56){
                quality = 4;
            }else if(posQuality >= 97 && posQuality <= 59){
                quality = 5;
            }else if(posQuality == 60){
                quality = 6;
            }
        }else if(level == 4){
            int posQuality = 1 + rgen.nextInt(40);
            if(posQuality >= 1 && posQuality <= 8){
                quality = 1;
            }else if(posQuality >= 9 && posQuality <= 20){
                quality = 2;
            }else if(posQuality >= 21 && posQuality <= 30){
                quality = 3;
            }else if(posQuality >= 31 && posQuality <= 36){
                quality = 4;
            }else if(posQuality >= 37 && posQuality <= 39){
                quality = 5;
            }else if(posQuality == 40){
                quality = 6;
            }
        }else if(level == 5){
            int posQuality = 1 + rgen.nextInt(30);
            if(posQuality >= 1 && posQuality <= 4){
                quality = 1;
            }else if(posQuality >= 5 && posQuality <= 10){
                quality = 2;
            }else if(posQuality >= 11 && posQuality <= 18){
                quality = 3;
            }else if(posQuality >= 19 && posQuality <= 25){
                quality = 4;
            }else if(posQuality >= 26 && posQuality <= 29){
                quality = 5;
            }else if(posQuality == 30){
                quality = 6;
            }
        }else if(level == 6){
            int posQuality = 1 + rgen.nextInt(20);
            if(posQuality >= 1 && posQuality <= 2){
                quality = 1;
            }else if(posQuality >= 3 && posQuality <= 4){
                quality = 2;
            }else if(posQuality >= 5 && posQuality <= 6){
                quality = 3;
            }else if(posQuality >= 7 && posQuality <= 10){
                quality = 4;
            }else if(posQuality >= 11 && posQuality <= 18){
                quality = 5;
            }else if(posQuality >= 19 && posQuality <= 20){
                quality = 6;
            }
        }
        if(rgen.nextInt(5) < 3){
            chest = new Armor("Chest", quality);
        }else{
            chest = null;
        }
        if(rgen.nextInt(5) < 3){
            head = new Armor("Head", quality);
        }else{
            head = null;
        }
        if(rgen.nextInt(5) < 3){
            legs = new Armor("Legs", quality);
        }else{
            legs = null;
        }
        if(rgen.nextInt(5) < 3){
            arms = new Armor("Arms", quality);
        }else{
            arms = null;
        }
        if(rgen.nextInt(5) < 3){
            feet = new Armor("Feet", quality);
        }else{
            feet = null;
        }
    }

    public Armor getHead(){
        return head;
    }

    public Armor getChest(){
        return chest;
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
}
