package pers.hanchao.generics.method;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * 演示泛型方法，打印重写了toString方法的集合对象
 * Created by 韩超 on 2018/1/30.
 */
public class ListPrintUtils {
    private final static Logger LOGGER = Logger.getLogger(ListPrintUtils.class);

    public static <E> void printList(List<E> list){
        if (null == list || list.size() == 0){
            LOGGER.info("无记录！");
        }else {
            for (E e : list){
                LOGGER.info(e.toString());
            }
        }
    }
    public static void main(String[] args){
        List<User> userList = new ArrayList<User>();
        userList.add(new User(1,"张三"));
        userList.add(new User(2,"李四"));
        ListPrintUtils.printList(userList);
    }
}
