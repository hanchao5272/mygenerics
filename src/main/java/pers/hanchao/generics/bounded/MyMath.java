package pers.hanchao.generics.bounded;

/**
 * 有界类型参数
 * Created by 韩超 on 2018/1/30.
 */
public class MyMath {
    // determines the largest of three Comparable objects

    public static <T extends Comparable> T MyMax(T x, T y) {
        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }
        return max;
    }
}
