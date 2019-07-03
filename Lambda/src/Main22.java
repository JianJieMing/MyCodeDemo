/**
 * @Classname Main22
 * @Date 2019/5/22 15:29
 * @Created by jianjieming
 */
public class Main22 {

    public static boolean checkObjFieldIsNull(Object obj) {

        boolean flag = false;
        for (java.lang.reflect.Field f : obj.getClass().getDeclaredFields()) {
            f.setAccessible(true);
            try {
                if (f.get(obj) == null || "".equals(f.get(obj).toString().trim())) {
                    flag = true;
                    return flag;
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return flag;
    }


}
