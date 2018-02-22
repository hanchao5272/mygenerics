package pers.hanchao.generics.bounded;

import org.apache.log4j.Logger;

/**
 * 有界类型参数
 * Created by 韩超 on 2018/1/30.
 */
public class MyMath {

    private final static Logger LOGGER = Logger.getLogger(MyMath.class);

    /**
     * <p>Title: 有界参数类型（单重）</p>
     * @author 韩超 2018/1/31 10:37
     */
    public static <T extends Comparable> T MyMax(T x, T y) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        return max;
    }

    /**
     * <p>Title: 多重有界参数类型</p>
     * @author 韩超 2018/1/31 13:20
     */
    public static <T extends Number & Comparable> T MyMax2(T x, T y){
        T dmax = x.doubleValue() >= y.doubleValue() ? x : y;
        return dmax;
    }

    /**
     * <p>Title: 有界泛型类型示例</p>
     * @author 韩超 2018/2/22 11:44
     */
    public static void main(String[] args){
        Integer result = MyMath.MyMax(1,2);
        LOGGER.info(result);

        Double result1 = MyMath.MyMax2(1D,2D);
        LOGGER.info(result1);
    }
}
