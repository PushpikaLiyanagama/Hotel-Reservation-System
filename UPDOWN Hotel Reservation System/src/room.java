import java.util.ArrayList;


public class room {
    public int roomNumber = 1;
    public ArrayList<String> availabilityRooms = new ArrayList<>();

    public room() {
        for (int i = 0; i < 10; i++) {
            availabilityRooms.add("Available");
        }
    }

    public void available() {
        System.out.println("View Available Rooms");

        do {
            System.out.println("Room Number : " + roomNumber + " [" + availabilityRooms.get(roomNumber - 1) + "]");
            roomNumber++;
        } while (roomNumber <= 10);
    }

    public static void main(String[] args) {
        room room = new room();
        room.available();
    }
}
