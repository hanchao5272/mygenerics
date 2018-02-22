package pers.hanchao.generics.type;

import org.apache.log4j.Logger;

/**
 * <p>Title: 数值泛型类型示例</p>
 * @author 韩超@bksx 2018/2/22 11:16
 */
public class MySquare<N> {
    private final static Logger LOGGER = Logger.getLogger(MySquare.class);

    public void square(N number){
        LOGGER.info(number.getClass().toString() + ":" + number);
    }

    /**
     * <p>Title: 数值泛型类型示例</p>
     * @author 韩超@bksx 2018/2/22 11:16
     */
    public static void main(String[] args){
        MySquare<Integer> mySquare = new MySquare<Integer>();
        mySquare.square(1);
    }
}
