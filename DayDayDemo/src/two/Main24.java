package two;

/**
 * @Classname two.Main24
 * @Date 2019/6/17 14:40
 * @Created by jianjieming
 */
public class Main24 {

    public static void main(String[] args) {
        System.out.println(trimBothEndsChars(",,3,2,1,4,1,2,4,,", ","));
    }

    public static String trimBothEndsChars(String srcStr, String splitter) {
        String regex = "^" + splitter + "*|" + splitter + "*$";
        return srcStr.replaceAll(regex, "");
    }
}
