import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.List;

public class RoomReader {
    public static List<Room> readRoomFile(String fileName) {
        List<Room> rooms = new ArrayList<>();


        // Deserialization
        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);

            Object obj = null;

            try{
                while((obj = in.readObject()) != null) {
                    // Method for deserialization of object
                    rooms.add((Room) obj);
                }
            }catch(EOFException e){
                Room.roomCount = rooms.size();
            }


            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
        }

        /*catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }*/

        catch(ClassNotFoundException | IOException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
        return rooms;
    }
}
