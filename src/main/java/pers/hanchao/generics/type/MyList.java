package pers.hanchao.generics.type;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: 集合泛型类型示例</p>
 * @author 韩超@bksx 2018/2/22 11:11
 */
public class MyList<E> {
    private List<E> list = new ArrayList<E>();

    private final static Logger LOGGER = Logger.getLogger(MyList.class);

    public void myAdd(E e){
        list.add(e);
        LOGGER.info(e.toString());
    }

    public int mySize(){
        return list.size();
    }

    /**
     * <p>Title: 集合泛型类型示例</p>
     * @author 韩超@bksx 2018/2/22 11:11
     */
    public static void main(String[] args){
        MyList<String> stringMyList = new MyList<String>();
        stringMyList.myAdd(new String("hello!"));
    }
}
