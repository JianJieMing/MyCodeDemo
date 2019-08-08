package utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname ListUtils
 * @Date 2019/6/10 8:46
 * @Created by jianjieming
 */
public class ListUtils {

    /**
     * 循环截取某页列表进行分页
     *
     * @param dataList    分页数据
     * @param pageSize    页面大小
     * @param currentPage 当前页面
     */
    public static List page(List dataList, int pageSize, int currentPage) {
        List currentPageList = new ArrayList<>();
        if (dataList != null && dataList.size() > 0) {
            int currIdx = (currentPage > 1 ? (currentPage - 1) * pageSize : 0);
            for (int i = 0; i < pageSize && i < dataList.size() - currIdx; i++) {
                Object data = dataList.get(currIdx + i);
                currentPageList.add(data);
            }
        }
        return currentPageList;
    }

    /**
     * 利用subList方法进行分页
     *
     * @param list        分页数据
     * @param pagesize    页面大小
     * @param currentPage 当前页面
     */
    public static List<String> pageBySubList(List list, int pagesize, int currentPage) {
        int totalcount = list.size();
        int pagecount = 0;
        List<String> subList;
        int m = totalcount % pagesize;
        if (m > 0) {
            pagecount = totalcount / pagesize + 1;
        } else {
            pagecount = totalcount / pagesize;
        }
        if (m == 0) {
            subList = list.subList((currentPage - 1) * pagesize, pagesize * (currentPage));
        } else {
            if (currentPage == pagecount) {
                subList = list.subList((currentPage - 1) * pagesize, totalcount);
            } else {
                subList = list.subList((currentPage - 1) * pagesize, pagesize * (currentPage));
            }
        }
        return subList;
    }

}