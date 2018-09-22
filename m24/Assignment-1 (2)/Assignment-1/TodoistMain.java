import java.util.Scanner;
import java.util.Arrays;

/**
  * write your code below this comment
  */

/**
 * Class for todoist main.
 */
class  Task {
	String title;
	String assignedTo;
	int timeToComplete;
	boolean important;
	boolean urgent;
	String status;
	Task(final String title, final String assignedTo, final int timeToComplete,
	     final boolean important, final boolean urgent, final String status) {
		this.title = title;
		//System.out.println(this.title);
		this.assignedTo = assignedTo;
		//System.out.println(this.assignedTo);
		this.timeToComplete = timeToComplete;
		this.important = important;
		this.urgent = urgent;
		this.status = status;
		System.out.print(this.title + "," + this.assignedTo + ",");
		System.out.print(this.timeToComplete + "," + this.important + ",");
		System.out.print(this.urgent + "," + this.status);
	}
	String gettitle() {
		System.out.println(this.title);
		return this.title;
	}
	String getassignedTo() {
		return this.assignedTo;
	}
	int gettimeToComplete() {
		return this.timeToComplete;
	}
	boolean getimportant() {
		return this.important;
	}
	boolean geturgent() {
		return this.urgent;
	}
	String getstatus() {
		return this.status;
	}
}
class Todoist {
	Task[] t;
	int tasksize = 0;

	Todoist() {
		t = new Task[100];
	}
	public void  addTask(Task t) {
		//System.out.println(gettitle()+getstatus());;
		//return t;
	}
	public String toString() {
		String str = "";
		return str;


	}

}











public class TodoistMain {

	/**
	 * Starts a test.
	 */
	public static void startTest() {
		Todoist todo = new Todoist();
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			String[] tokens = s.nextLine().split(",");
			switch (tokens[0]) {
			case "task":
				testTask(tokens);
				//System.out.println(tokens);
				break;
			case "add-task":
				testAddTask(todo, tokens);
				break;
			case "print-todoist":
				System.out.println(todo);
				break;
			// case "get-next":
			// 	System.out.println(todo.getNextTask(tokens[1]));
			// 	break;
			// case "get-next-n":
			// 	int n = Integer.parseInt(tokens[2]);
			// 	Task[] tasks = todo.getNextTask(tokens[1], n);
			// 	System.out.println(Arrays.deepToString(tasks));
			// 	break;
			// case "total-time":
			// 	System.out.println(todo.totalTime4Completion());
			// 	break;
			default:
				break;
			}
		}
	}

	/**
	 * method to test add task.
	 *
	 * @param      todo    The todo
	 * @param      tokens  The tokens
	 */
	public static void testAddTask(final Todoist todo, final String[] tokens) {
		try {
			todo.addTask(createTask(tokens));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * method to test the creation of task object.
	 *
	 * @param      tokens  The tokens
	 */
	public static void testTask(final String[] tokens) {
		try {
			System.out.println(createTask(tokens));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Creates a task object.
	 *
	 * @param      tokens     The tokens
	 *
	 * @return     Task object
	 *
	 * @throws     Exception  if task inputs are invalid
	 */
	public static Task createTask(final String[] tokens) throws Exception {
		String title = tokens[1];
		String assignedTo = tokens[2];
		int timeToComplete = Integer.parseInt(tokens[3]);
		boolean important = tokens[4].equals("y");
		boolean urgent = tokens[5].equals("y");
		String status = tokens[6];
		return new Task(
		           title, assignedTo, timeToComplete, important, urgent, status);
	}

	/**
	 * main method.
	 *
	 * @param      args  The command line arguments
	 */
	public static void main(final String[] args) {
		startTest();
	}
}
