import java.util.*;
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
// class Hotel {
//     private Reservation[] rooms;
//     private int rnum = 1;
//     private int size;
//     Reservation reserveObj;
//     Hotel() {
//         rooms = new Reservation[5];
//         for (int i=0; i<5 ;i++) {
//             rooms[i] = null;
//             size++;
//         }
//         // size = 0;

//     }
    
//     private int size() {
//         return size;
//     }
//     // public void resize() {
//     //     res = Arrays.copyOf(res, 2 * res.length);
//     // }
//     public int reserveRoom(String person) {
//         for (int i = 0; i < size(); i++) {
//             if (rooms[i] == null) {
//                 reserveObj = new Reservation(person);
//                 reserveObj.setRoom(rnum);
//                 rooms[i] = reserveObj;
//                 rnum++;
//                 return rnum - 1;
//             }
//         }
//         return -1;
//     }
//     public boolean reserveRoom(String person, int roomNum) {
//         try {
//             if (rooms[roomNum - 1] == null) {
//                 reserveObj = new Reservation(person, roomNum);
//                 rooms[roomNum  - 1] = reserveObj;
//                 rnum++;
//                 return true;
//             }
//         } catch (Exception vb) {
//             return false;
//         }
//         return false;

//     }
//     public void printReservations() {
//         for (int i = 0; i < size; i++) {
//             if (rooms[i]!= null) {
//                 System.out.println(rooms[i].getName() + " " + rooms[i].getRoom());
//             } else {
//                 System.out.println((i + 1) + " is not reserved");
//             }
//         }
//     }
// }
