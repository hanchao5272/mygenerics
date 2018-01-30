package pers.hanchao.generics.type;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * 演示E这种参数类型的用法
 * Created by 韩超 on 2018/1/30.
 */
public class MyList<E> {
    private List<E> list = new ArrayList<E>();

    private final static Logger LOGGER = Logger.getLogger(MyList.class);

    /**
     * <p>Title: 添加一个元素</p>
     * @author 韩超@bksx 2018/1/30 16:29
     */
    public void myAdd(E e){
        list.add(e);
        LOGGER.info(e.toString());
    }

    /**
     * <p>Title: 获取长度</p>
     * @author 韩超@bksx 2018/1/30 16:34
     */
    public int mySize(){
        return list.size();
    }

}
