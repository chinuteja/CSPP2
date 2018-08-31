/**.
 * @author Teja
 */
import java.util.Scanner;
/**.
 * program to reverse a string.
 */
public class Solution
{/*
    Do not modify the main function 
    */
    private Solution(){
        /**
         * this is a private constructor
         */
    }
    /**.
     * to take the input.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);    
        System.out.println(reverse);    
    }
    /**.
     * to reverse the given string.
     *
     * @param      s     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static String reverseString(String s){
        String s1 = "";
        for(int i = 0; i < s.length(); i++){
            s1 = s.charAt(i) + s1;
        }
        return s1;
    }
}
