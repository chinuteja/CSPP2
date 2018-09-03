import java.util.Scanner;
/**.
 * Input validator class
 */
class InputValidator {
    /**.
     * constructor
     */
    private final int length = 6;
    /**.
     * { var_description }
     */
    private static String value;
    /**.
     * constructor
     *
     * @param      input  The input
     */
    public InputValidator(final String input) {
        this.value = input;

    }
    /**.
     * function to check the given condition.
     *
     * @return     { description_of_the_return_value }
     */
    public boolean validateData() {

        if ((this.value).length() >= length) {
            return true;
        }
        return false;
    }
}
    /**.
     * Class for solution.
     */
public class Solution {
    /**
     * main method to take input.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());

    }

}
