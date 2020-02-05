
import java.io.Serializable;
import java.util.ArrayList;

public class Room implements Serializable {

    private ArrayList<Wall> wallList;
    public static int roomCount = 0;
    public int roomNum;

    public Room(double length, double width, double height) throws BadWidthException, BadHeightException {
        wallList = new ArrayList<Wall>();

        Wall wallA = new Wall(length, height);
        wallList.add(wallA);
        Wall wallB = new Wall(length, height);
        wallList.add(wallB);
        Wall wallC = new Wall(width, height);
        wallList.add(wallC);
        Wall wallD = new Wall(width, height);
        wallList.add(wallD);
        roomCount += 1;
        roomNum = roomCount;
    }

    public double getArea() {
        double area = 0;

        for (int i = 0; i < wallList.size(); i++) {
            Wall w = wallList.get(i);
            area += w.getArea();
        }

        return area;
    }
    public int getRoomCount(){
        return roomCount;
        //yes
    }

    @Override
    public String toString() {
        return "Room #" + roomNum + " has an area of " + this.getArea() + ". \nWall 1 and 2: "
                + wallList.get(0) + "\nWall 3 and 4: " + wallList.get(2) + "\nThere are " + roomCount + " rooms.";
    }
}
