import java.util.Arrays;
/*
  Reservation class, stores the person and room number in the Hotel
*/

public class Reservation {
    //instance variables
    private String name;
    private int roomNumber;

    //constructors, must supply the name, and optionally a room
    public Reservation(String person) {
        this.name = person;


    }
    public Reservation(String person, int room) {
        this.name = person;
        this.roomNumber = room;


    }

    //mutators, set the room number or name
    public void setRoom(int newroom) {
        this.roomNumber = newroom;
    }

    public void setName(String newname) {
        this.name = newname;

    }

    //accessors, return the room number or name
    public int getRoom() {
        return this.roomNumber;

    }

    public String getName() {
        return this.name;
    }
}
class Hotel {
    Reservation[] res;
    int size;
    Reservation resObj;
    private int roomnumber = 1;
    Hotel() {
        res = new Reservation[5];
        size = 0;
    }
    public void resize() {
        res = Arrays.copyOf(res, 2 * res.length);
    }
    public int reserveRoom(String person) {
        for (int i = 0; i <= size; i++) {
            if (res[i] == null) {
                resObj = new Reservation(person);
                resObj.setName(person);
                resObj.setRoom(roomnumber);
                res[i] = resObj;
                roomnumber++;
                size++;
                return roomnumber-1;
            }
        }
        return -1;
    }
    public boolean reserveRoom(String person, int roomNum) {
        if (res[roomNum - 1] == null) {
            resObj = new Reservation(person, roomNum);
            res[roomNum - 1] = resObj;
            roomNum++;
            size++;
            return true;
        }
        return false;

    }
    public void printReservations() {
        String str = "";
        for (int i = 0; i < size; i++) {
            if (res[i] != null) {
                System.out.println(res[i].getName() + " " +res[i].getRoom());
                
            }
            else
                System.out.println("Not reserved");
        }
    }
}