package pers.hanchao.generics.type;

import org.apache.log4j.Logger;

/**
 * 泛型类语法示例
 * Created by 韩超 on 2018/2/22.
 */
public class MyGenericsType<T> {
    private final static Logger LOGGER = Logger.getLogger(MyGenericsType.class);

    private T t;

    public void setT(T t) {
        this.t = t;
    }

    /**
     * <p>Title: 这是一个普通方法</p>
     * @author 韩超@bksx 2018/2/22 10:52
     */
    public T getT() {
        return t;
    }

    /**
     * <p>Title: 这是一个泛型方法</p>
     * @author 韩超@bksx 2018/2/22 10:53
     */
    public <T> T getTT() {
        T t = null;
        return t;
    }

    /**
     * <p>Title: 泛型原始类型使用</p>
     * @author 韩超@bksx 2018/2/22 11:21
     */
    public static void main(String[] args){
        //泛型原始类型
        MyGenericsType myGenericsType = new MyGenericsType();
        LOGGER.info(myGenericsType.getClass().toString());

        //泛型类型
        MyGenericsType<Integer> integerMyGenericsType = new MyGenericsType<Integer>();
        LOGGER.info(integerMyGenericsType.getClass().toString());
    }
}

/**
 * 泛型类语法示例
 * Created by 韩超 on 2018/2/22.
 */
class MyGenericsType2<X>{
    private X x;
}
