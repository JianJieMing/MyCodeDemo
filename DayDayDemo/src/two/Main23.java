package two;

import utils.ListUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname two.Main23
 * @Date 2019/6/10 8:48
 * @Created by jianjieming
 */
public class Main23 {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        List page = ListUtils.page(list, 2, 2);

        page.forEach(System.out::println);

    }

}
