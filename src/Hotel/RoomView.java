package Hotel;

// View Layer

public class RoomView {
    public void printRoomDetails( String RoomNumber, String Floor, String Free){
        System.out.println("Room details");
        System.out.println("Room number: " + RoomNumber);
        System.out.println("Floor: " + Floor);
        System.out.println("Is this room free?(yes/no): " + Free);
    }
}
