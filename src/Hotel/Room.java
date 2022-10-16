package Hotel;

//Model Layer

public class Room {
    private String RoomNumber;
    private String Floor;
    private String Free;

    public String getRoomNumber(){
        return RoomNumber;
    }
    public void setRoomNumber( String nr){
        this.RoomNumber = nr;
    }

    public String getFloor(){
        return Floor;
    }
    public void setFloor( String floor){
        this.Floor = floor;
    }

    public String getFree(){
        return Free;
    }
    public void setFree( String free){
        this.Free = free;
    }
}
