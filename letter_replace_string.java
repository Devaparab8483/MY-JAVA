
/*Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
Example : original = "eabcdef" ; result = "iabcdif"
Original = “xyz” ; result = “xyz”
*/

import java.util.Scanner;
public class letter_replace_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = sc.next();

        String result = word.replace('e', 'i');
        System.out.print(result);
/*
        for(int i=0; i<word.length(); i++) {
            if(word.charAt(i) == 'e') {
                result += 'i';
            } else {
            result += word.charAt(i);
            }
        }
        System.out.println(result);
 */


    }
}
