import java.util.ArrayList;
public class Map{
    private ArrayList<Area> map;
    public Map(){
        map = new ArrayList<>();
        map.add(new Area(1));
        map.add(new Area(2));
        map.add(new Area(3));
        map.add(new Area(4));
        map.add(new Area(5));
        map.add(new Area(6));
    }

    public ArrayList<Area> getMap(){
        return map;
    }
}
