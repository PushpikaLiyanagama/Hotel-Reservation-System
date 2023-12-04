public class allocateRoom extends room {
    public void allocate(int roomNumber) {

        System.out.println("Allocate a Room for Guest");
        System.out.println("==========================");
        System.out.println(" ");
        if (roomNumber >= 1 && roomNumber <= 10) {
            if (availabilityRooms.get(roomNumber - 1).equals("Available")) {
                availabilityRooms.set(roomNumber - 1, "Allocated");
                System.out.println("Room Number " + roomNumber + " has been allocated.");
            } else {
                System.out.println("Room Number " + roomNumber + " is already allocated.");
            }
        } else {
            System.out.println("Invalid room number");
        }
    }
}
