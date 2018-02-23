package pers.hanchao.generics.attention;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: 泛型使用的8个注意事项</p>
 *
 * @author 韩超 2018/2/23 11:05
 */
public class GenericAttentionDemo {
    private final static Logger LOGGER = Logger.getLogger(GenericAttentionDemo.class);

    /**
     * <p>Title: 2.Java泛型不能进行实例化</p>
     *
     * @author 韩超 2018/2/23 11:10
     */
    <T> void test(T t) {
//        t = new T();//编译前报错

    }

    /**
     * <p>Title: 3.Java泛型不允许进行静态化</p>
     *
     * @author 韩超 2018/2/23 11:25
     */
    static class Demo<T> {
//        private static T t;// 编译前类型检查报错
//
//        // 编译前类型检查报错
//        public static T getT() {
//            return t;
//        }
    }

    /**
     * <p>Title: 4.Java泛型不允许直接进行类型转换（通配符可以）</p>
     *
     * @author 韩超 2018/2/23 14:24
     */
    static void cast(List<?> orgin, List<?> dest) {
        dest = orgin;
    }

    /**
     * <p>Title: 6.Java泛型不能使用数组</p>
     *
     * @author 韩超 2018/2/23 14:41
     */
    static class Demo6<T> {
        private T t;

        public T getT() {
            return t;
        }

        public Demo6(T t) {
            this.t = t;
        }
    }

    /**
     * <p>Title: 7.Java泛型不允许定义泛型异常类</p>
     *
     * @author 韩超 2018/2/23 15:07
     */
//    static class Apple<T> extends Exception {
//    }

//    static class Orange<T> extends Throwable {
//    }

    /**
     * <p>Title: 7.Java泛型不允许捕获一个泛型异常</p>
     *
     * @author 韩超 2018/2/23 15:09
     */
    // 7.Java泛型:可以以异常类作为边界
    // 7.Java泛型:可以throws泛型类型
    <T extends Exception> void test7(T t,Class<T> tClass) throws T {
        try {
            //...
//        } catch (T t) {//不允许捕获一个泛型类型的异常
        } catch (Exception e) {//不允许捕获一个泛型类型的异常
            //...
        }
    }

    /**
     * <p>Title: 8.Java泛型不允许作为参数进行重载</p>
     * @author 韩超 2018/2/23 15:32
     */
    static class Demo8<T>{
        void test(List<Integer> list){}
        //不允许作为参数列表进行重载
        //void test(List<Double> list){}
    }

    public static void main(String[] args) {

        LOGGER.info("1.Java泛型不能使用原始类型");
        //List<int> list = new List<int>();// 编译报错
        LOGGER.info("因为泛型在编译时，会进行类型擦除，最后只保留原始类型。而原始类型只能是Object类及其子类，当然不能使基本数据类型。\n");

        LOGGER.info("2.Java泛型不允许进行实例化");
        Integer t = 1;
        //t = new Object();

        LOGGER.info("3.Java泛型不允许进行静态化");

        LOGGER.info("4.Java泛型不允许直接进行类型转换（通配符可以）");
        List<Integer> integerList = new ArrayList<Integer>();
        List<Double> doubleList = new ArrayList<Double>();
        //不能直接进行类型转换
        //integerList = doubleList;
        //通过通配符进行类型转换
        cast(doubleList, integerList);

        LOGGER.info("5.Java泛型不允许直接使用instanceOf（通配符可以）");
        List<String> stringList = new ArrayList<String>();
        //不能直接使用instanceof，类型检查报错
        //LOGGER.info(stringList instanceof ArrayList<String>);
        //通过通配符实现运行时验证
        LOGGER.info(stringList instanceof ArrayList<?>);

        LOGGER.info("6.Java泛型不允许使用数组");
        //类型检查报错
        //Demo6<Integer>[] iDemo6s = new Demo6<Integer>[2];
        //通过通配符实现泛型数组
        Demo6<?>[] iDemo6s = new Demo6<?>[2];
        iDemo6s[0] = new Demo6<Integer>(1);
        iDemo6s[1] = new Demo6<String>("hello");
        for (Demo6 demo6 : iDemo6s) {
            LOGGER.info(demo6.getT().getClass().toString() + " : " + demo6.getT());
        }

        LOGGER.info("7.Java泛型不允许直接或间接扩展Throwable类");

        LOGGER.info("8.Java泛型不允许作为参数进行重载");

    }
}
