import java.util.Scanner;
/**
 * Input validator class
 */
class InputValidator {
    String value;
    public InputValidator(String input) {
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
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());

    }

}
