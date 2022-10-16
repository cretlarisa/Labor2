import Hotel.Room;
import Hotel.RoomController;
import Hotel.RoomView;

public class Main {
    public static void main(String[] args) {
        RoomView view = new RoomView();
        Room model = new Room();
        RoomController controller = new RoomController(model,view);
        controller.updateView();

        System.out.println("\nNachdem die Details eingefugt wurden!");
        controller.setRoomNumber("23");
        controller.setRoomFloor("1");
        controller.setRoomFree("yes");
        controller.updateView();
    }
}