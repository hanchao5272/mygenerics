package pers.hanchao.generics.bounded;

/**
 * 有界类型参数
 * Created by 韩超 on 2018/1/30.
 */
public class MyMath {

    /**
     * <p>Title: 有界参数类型（单重）</p>
     * @author 韩超@bksx 2018/1/31 10:37
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
     * @author 韩超@bksx 2018/1/31 13:20
     */
    public static <T extends Number & Comparable> T MyMax2(T x,T y){
        T dmax = x.doubleValue() >= y.doubleValue() ? x : y;
        return dmax;
    }

}
