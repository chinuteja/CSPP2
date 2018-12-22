import java.util.*;
class Hotel {
	private Reservation[] rooms;
	private int rnum = 1;
	private int size;
	Reservation reserveObj;
	Hotel() {
		rooms = new Reservation[5];
		size = 0;
	}
	public int reserveRoom(String person) {
		if (size == rooms.length) {
			System.out.println("All Rooms are reserved");
		}
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] == null) {
				reserveObj = new Reservation(person);
				reserveObj.setRoom(i + 1);
				rooms[i] = reserveObj;
				// rnum++;
				size++;
				return i + 1;
			}
		}
		return -1;
	}
	public boolean reserveRoom(String person, int roomNum) {
		if (size == rooms.length) {
			System.out.println("All Rooms are reserved");
		}
		else if (rooms[roomNum - 1] == null) {
			reserveObj = new Reservation(person, roomNum);
			rooms[roomNum  - 1] = reserveObj;
			rnum++;
			size++;
			return true;
		}
		else if (rooms[roomNum-1] != null) {
			System.out.println("Room is already reserved");
		}

		return false;
	}
	public void printReservations() {

		for (int i = 0; i < size; i++) {
			if (rooms[i] != null) {
				System.out.println(rooms[i].getName() + " " + rooms[i].getRoom());
			}
		}
	}
	public void cancelReservations(String person) {
		for (int i = 0; i < size; i++ ) {
			if (rooms[i] != null) {
				if (rooms[i].getName().equals(person)) {
					rooms[i] = null;
				}
			}

		} 
	}
	public boolean buildRooms(int num) {
		// if (num < 0) {
		// 	return;
		// }
		// System.out.println("Added"+ num + "more rooms");
		// System.out.println("helllllllll");
		rooms = Arrays.copyOf(rooms, size + num);

		for (int i = 0; i < num; i++) {
			rooms[size++] = null;
		}
		size = size + num;
		return true;

	}
}