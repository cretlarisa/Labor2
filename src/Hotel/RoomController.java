package Hotel;

//Controller Layer

public class RoomController {
    private Room model;
    private RoomView view;

    public RoomController( Room model, RoomView view){
        this.model = model;
        this.view = view;
    }

    public void setRoomNumber(String new_nr){
        model.setRoomNumber(new_nr);
    }

    public void getRoomNumber(){
        model.getRoomNumber();
    }

    public void setRoomFloor(String new_nr){
        model.setFloor(new_nr);
    }

    public void getRoomFloor(){
        model.getFloor();
    }

    public void setRoomFree(String new_free){
        model.setFree(new_free);
    }

    public void getRoomFree(){
        model.getFree();
    }

    public void updateView(){
        view.printRoomDetails(model.getRoomNumber(), model.getFloor(), model.getFree());
    }

}
