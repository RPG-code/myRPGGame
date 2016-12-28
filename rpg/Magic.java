package rpg;


/**
 * Write a description of class Magic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Magic
{
    private String type;
    private double offensive;
    private double defensive;
    private double mobility;
    private double control;
    private double support;
    private double speed;
    public Magic(String[] magic){
        type = magic[0];
        offensive = Double.parseDouble(magic[1]);
        defensive = Double.parseDouble(magic[2]);
        mobility = Double.parseDouble(magic[3]);
        support = Double.parseDouble(magic[4]);
        control = Double.parseDouble(magic[5]);
        speed = Double.parseDouble(magic[6]);
    }

    public Magic(Magic first, Magic second){
        type = first.getType() + " " + second.getType();
        offensive = first.getOffense() + second.getOffense() / 2;
        defensive = first.getDefense() + second.getDefense() / 2;
        mobility = first.getMobile() + second.getMobile() / 2;
        control = first.getControl() + second.getControl() / 2;
        support = first.getSupport() + second.getSupport() / 2;
        speed = first.getSpeed() + second.getSpeed() / 2;
    }

    public String getType(){
        return type;
    }

    public double getOffense(){
        return offensive;
    }

    public double getDefense(){
        return defensive;
    }

    public double getMobile(){
        return mobility;
    }

    public double getControl(){
        return control;
    }

    public double getSupport(){
        return support;
    }

    public double getSpeed(){
        return speed;
    }
}
