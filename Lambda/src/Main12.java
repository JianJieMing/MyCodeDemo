import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Main12
 * @Date 2019/3/15 19:00
 * @Created by jianjieming
 */
public class Main12 {
    public static void main(String[] args) {
        List<Long> list = new ArrayList<Long>();
        list.add(1l);         //向列表中添加数据
        list.add(2l);        //向列表中添加数据
        list.add(3l);        //向列表中添加数据
//        for (int i = 0; i < list.size(); i++) {    //通过循环输出列表中的内容
//            System.out.println(i + ":" + list.get(i));
//        }
        Long o = 4l;
        if (list.contains(o)){
            System.out.println("true");
        }
        System.out.println("list对象中是否包含元素" + o + ":" + list.contains(o));
    }
}