import java.util.ArrayList;
public class Area{
    private ArrayList<Room> rooms;
    private FileRead reader;
    public Area(int level){
        rooms = new ArrayList<>();
        reader = new FileRead();
        String[] roomTypes = reader.areaReader(level);
        for(int i = 0; i < Integer.parseInt(roomTypes[1]); i++){
            rooms.add(new Room(level, "Armory"));
        }
        for(int i = 0; i < Integer.parseInt(roomTypes[2]); i++){
            rooms.add(new Room(level, "Barracks"));
        }
        for(int i = 0; i < Integer.parseInt(roomTypes[3]); i++){
            rooms.add(new Room(level, "Guard Room"));
        }
        for(int i = 0; i < Integer.parseInt(roomTypes[4]); i++){
            rooms.add(new Room(level, "Council Room"));
        }
        for(int i = 0; i < Integer.parseInt(roomTypes[5]); i++){
            rooms.add(new Room(level, "Training Room"));
        }
        for(int i = 0; i < Integer.parseInt(roomTypes[6]); i++){
            rooms.add(new Room(level, "Entrance Hall"));
        }
        for(int i = 0; i < Integer.parseInt(roomTypes[7]); i++){
            rooms.add(new Room(level, "Throne Room"));
        }
    }

    public ArrayList<Room> getRooms(){
        return rooms;
    }
}
