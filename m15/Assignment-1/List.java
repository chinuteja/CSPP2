
import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;
/**.
 * List of .
 */
public class List {
    /**.
     * { var_description }
     */
    private int[] list;
    /**.
     * size
     */
    private int size;
    /**.
     * Constructs the object.
     */
    public List() {
        list = new int[10];
        size = 0;

        

    }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public int[] resize() {
        list = Arrays.copyOf(list, 2 * size);
        return list;
    }
    /**.
     * { function_description }
     *
     * @param      item  The item
     */
    public void add(final int item) {
        if (size == list.length){
            resize();
        }
        list[size] = item;
        size++;
    }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public int size() {
        // replace the code below to implement the size method
        return size;
    }
    /**.
     * { function_description }
     *
     * @param      index      The index
     *
     * @throws     Exception  { exception_description }
     */
    public void remove(final int index) throws Exception {
        // System.out.println(index);
        if (index > 0 || index < size) {
            for (int i = index; i < size; i++) {
                list[i] = list[i + 1];
            }
            size--;
            // System.out.println(toString());
        } else {
            //System.out.println("Invalid Position Exception");
            throw new Exception("Invalid Position Exception");
        }
    }
    /**.
     * { function_description }
     *
     * @param      index  The index
     *
     * @return     { description_of_the_return_value }
     */
    public int get(final int index) {
        if (index < size) {
            return list[index];
        }
        return -1;
    }
    /**.
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        if (size == 0){
            return "[]";
        }
        String str = "[";
        int i;
        for (i = 0; i < size - 1; i++) {
            str = str + list[i] + ",";
        }
        str = str + list[i] + "]";
        return str;
    }
    /**.
     * { function_description }
     *
     * @param      item  The item
     *
     * @return     { description_of_the_return_value }
     */
    public boolean contains(final int item) {
        for (int i = 0; i < size; i++) {
            if (list[i] == item) {
                return true;
            }
        }
        return false;
    }
    /**.
     * Searches for the first match.
     *
     * @param      item  The item
     *
     * @return     { description_of_the_return_value }
     */
    public int indexOf(final int item) {
        for (int i = 0; i < size; i++) {
            if (list[i] == item) {
                return i;
            }
        }
        return -1;
    }
    /*
    Inserts all the elements of specified int array to the end of list
    */
    /**.
     * Adds all.
     *
     * @param      newArray  The new array
     */
    public void addAll(final int[] newArray) {
        for (int i = 0; i < newArray.length; i++) {
            add(newArray[i]);
        }
    }
    /**.
     * { function_description }
     *
     * @param      index  The index
     * @param      item   The item
     */
    public void add(final int index, final int item) {
        if (index > 0 && index < size) {
            int[] list2 = new int[size - index];
            int j = 0;
            for (int i = index; i < size; i++) {
                list2[j] = list[i];
                j++;
            }
            j = 0;
            list[index] = item;
            size++;
            for (int k = index + 1; j < size; j++) {
                list[k] = list2[j];
                j++;
            }
        }
    }
    /**.
     * Removes all.
     *
     * @param      newArray   The new array
     *
     * @throws     Exception  { exception_description }
     */
    public void removeAll(int[] newArray) throws Exception {
        for (int i = 0; i < newArray.length; i++) {
            int index = indexOf(newArray[i]);
            while (index != -1) {
                remove(index);
                index = (indexOf(newArray[i]));
                //throw new Exception("UnknownError");
            }
        }

    }
    /**.
     * { function_description }
     *
     * @param      start      The start
     * @param      end        The end
     *
     * @return     { description_of_the_return_value }
     *
     * @throws     Exception  { exception_description }
     */
    public List subList(final int start, final int end) throws Exception {
        List list1 = new List();
        if (start < 0 || end < 0 || start > end || 
            start == end || end - start == 1) {
            throw new Exception("Index Out of Bounds Exception");

        } else {
            for (int i = start; i < end; i++) {
                list1.add(list[i]);
            }
        }
        return list1;
    }
    /**.
     * { function_description }
     *
     * @param      item  The item
     *
     * @return     { description_of_the_return_value }
     */
    public int count(final int item) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (list[i] == item) {
                count++;
            }
        }
        return count;
    }
    /**.
     * { function_description }
     *
     * @param      newlist  The newlist
     *
     * @return     { description_of_the_return_value }
     */
    public boolean equals(final List newlist) {
        // sending a list object
        // Replace the code below
        return toString().equals(newlist.toString());
    }
    /**.
     * { function_description }
     */
    public void clear() {
        size = 0;
    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
        // create an object of the list to invoke methods on it
        List l = new List();

        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
            case "add":
                if (tokens.length == 2) {
                    String[] t = tokens[1].split(",");
                    if (t.length == 1) {
                        l.add(Integer.parseInt(tokens[1]));
                    }
                }
                break;
            case "size":
                System.out.println(l.size());
                break;
            case "print":
                System.out.println(l);
                break;
            case "remove":
                try {
                    if (tokens.length == 2) {
                        l.remove(Integer.parseInt(tokens[1]));
                    }
                } catch (Exception e) {
                    System.out.println("Invalid Position Exception"
                                      );
                }
                break;
            case "indexOf":
                if (tokens.length == 2) {
                    System.out.println(l.indexOf(
                            Integer.parseInt(tokens[1])));
                }
                break;
            case "get":
                if (tokens.length == 2) {
                    System.out.println(l.get(
                            Integer.parseInt(tokens[1])));
                }
                break;
            case "contains":
                if (tokens.length == 2) {
                    System.out.println(l.contains(
                            Integer.parseInt(tokens[1])));
                }
                break;
            case "addAll":
                if (tokens.length == 2) {
                    String[] t1 = tokens[1].split(",");
                    int[] temp = new int[t1.length];
                    for (int i = 0; i < temp.length; i++) {
                        temp[i] = Integer.parseInt(t1[i]);
                    }
                    l.addAll(temp);
                }
                break;
            case "removeAll":
                try {
                    if (tokens.length == 2) {
                        String[] t2 = tokens[1].split(",");
                        int[] a = new int[t2.length];
                        for (int i = 0; i < t2.length; i++)
                            a[i] = Integer.parseInt(t2[i]);
                        l.removeAll(a);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                break;
            case "subList":
                try {
                    if (tokens.length != 2) break;
                    String[] arrstring3 = tokens[1].split(",");
                    List object = l.subList(Integer.parseInt(arrstring3[0]),
                                            Integer.parseInt(arrstring3[1]));
                    if (object != null) {
                        System.out.println(object);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                break;

            case "equals":
                if (tokens.length == 2) {
                    String[] lt = tokens[1].split(",");
                    List l2 = new List();
                    for (int k = 0; k < lt.length; k++ ) {
                        l2.add(Integer.parseInt(lt[k]));
                    }
                    System.out.println(l.equals(l2));
                }
                break;
            case "clear":
                l.clear();
                break;
            case "count":
                System.out.println(l.count(Integer.parseInt(tokens[1])));
                break;
            default:
                break;
            }
        }
    }
}
