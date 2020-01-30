import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class RoomWriter {
    public static void writeRoomFile(String fileName, List<Room> roomList){
        // Serialization
        try
        {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            for(Room room : roomList){
                out.writeObject(room);
                //out.writeInt(room.getRoomCount());
            }



            out.close();
            file.close();

            System.out.println("Object has been serialized");

        }catch(FileNotFoundException fn){
            fn.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
