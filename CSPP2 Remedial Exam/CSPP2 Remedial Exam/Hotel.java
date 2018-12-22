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
		if (rooms[roomNum - 1] == null) {
			reserveObj = new Reservation(person, roomNum);
			rooms[roomNum  - 1] = reserveObj;
			rnum++;
			size++;
			return true;
		} else {
			System.out.println("Already reserved");
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
	public void cancelReservation(String person) {
		for (int i = 0; i < size; i++ ) {
			if (rooms[i] != null) {
				if (rooms[i].getName().equals(person)) {
					rooms[i] = null;
				}
			}

		}
	}
	public void buildRoom(int num) {
		if (num < 0) {
			return;
		}
		rooms = Arrays.copyOf(rooms, size + num);
		for (int i = 0; i < num; i++) {
			rooms[size++] = null;
		}

	}
}