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
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] == null) {
				reserveObj = new Reservation(person);
				reserveObj.setRoom(i+1);
				rooms[i] = reserveObj;
				// rnum++;
				size++;
				return i+1;
			}
		}
		return -1;
	}
	public boolean reserveRoom(String person, int roomNum) {
		if (rooms[roomNum - 1] == null) {
			reserveObj = new Reservation(person, roomNum);
			rooms[roomNum  - 1] = reserveObj;
			rnum++;
			size++;
			return true;
		}

		return false;
	}
	public void printReservations() {
		for (int i = 0; i < size; i++) {
			if (rooms[i] != null) {
				System.out.println(rooms[i].getName() + " " + rooms[i].getRoom());
			} else {
				System.out.println((i + 1) + " is not reserved");
			}
		}
	}
}