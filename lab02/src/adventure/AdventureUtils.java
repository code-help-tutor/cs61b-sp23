WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package adventure;

public class AdventureUtils {

    /** Returns whether the given string is a valid int. */
    static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
