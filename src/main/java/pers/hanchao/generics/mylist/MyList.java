package pers.hanchao.generics.mylist;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * 通过泛型定义自定义列表,实现列表元素打印功能<br/>
 * MyList是一个泛型类<br/>
 * T是一个泛型类型的参数<br/>
 * list是一个集合类型的泛型字段<br/>
 * Created by 韩超 on 2018/1/29.
 */
public class MyList<T> {

    private final static Logger LOGGER = Logger.getLogger(MyList.class);

    private List<T> list = new ArrayList<T>();

    public int size(){
        return list.size();
    }

    public void add(T t){
        list.add(t);
    }
    public void print(){
        if (null == list || list.size() == 0){
            LOGGER.info("无数据！");
        }else {
            for (Object obj : list){
                LOGGER.info(obj.toString());
            }
        }
    }
}
