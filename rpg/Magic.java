package rpg;


class Magic
{
    private String type;
    private double offensive;
    private double defensive;
    private double mobility;
    private double control;
    private double support;
    private double speed;
    
    Magic(String[] magic){
        type = magic[0];
        offensive = Double.parseDouble(magic[1]);
        defensive = Double.parseDouble(magic[2]);
        mobility = Double.parseDouble(magic[3]);
        support = Double.parseDouble(magic[4]);
        control = Double.parseDouble(magic[5]);
        speed = Double.parseDouble(magic[6]);
    }

    Magic(Magic first, Magic second){
        type = first.getType() + " " + second.getType();
        offensive = first.getOffense() + second.getOffense() / 2;
        defensive = first.getDefense() + second.getDefense() / 2;
        mobility = first.getMobile() + second.getMobile() / 2;
        control = first.getControl() + second.getControl() / 2;
        support = first.getSupport() + second.getSupport() / 2;
        speed = first.getSpeed() + second.getSpeed() / 2;
    }

    String getType(){
        return type;
    }

    double getOffense(){
        return offensive;
    }

    double getDefense(){
        return defensive;
    }

    double getMobile(){
        return mobility;
    }

    double getControl(){
        return control;
    }

    double getSupport(){
        return support;
    }

    double getSpeed(){
        return speed;
    }
}
