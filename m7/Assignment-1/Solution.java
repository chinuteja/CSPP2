import java.util.Scanner;
/**.
 * Input validator class
 */
class InputValidator {
    /**.
     * constructor
     */
    String value;
    /**
     * constructor
     *
     * @param      input  The input
     */
    public InputValidator(final String input) {
        this.value = input;

    }
    public boolean validateData() {

        if ((this.value).length() >= 6 ) {
            return true;
        }
        return false;
    }
}
public class Solution {
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());

    }

}
