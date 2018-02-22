package pers.hanchao.generics.type;

import org.apache.log4j.Logger;

/**
 * <p>Title: 通用泛型类型示例</p>
 * @author 韩超@bksx 2018/2/22 11:09
 */
public class MyMultiType<T,S,U,V,A,B> {
    private T t;
    private S s;
    private U u;
    private V v;
    private A a;
    private B b;

    private final static Logger LOGGER = Logger.getLogger(MyMultiType.class);

    public void set(T first,S seconde,U third,V fourth,A fifth,B sixth){
        LOGGER.info("第1个参数的类型是：" + first.getClass().getName().toString());
        LOGGER.info("第2个参数的类型是：" + seconde.getClass().getName().toString());
        LOGGER.info("第3个参数的类型是：" + third.getClass().getName().toString());
        LOGGER.info("第4个参数的类型是：" + fourth.getClass().getName().toString());
        LOGGER.info("第5个参数的类型是：" + fifth.getClass().getName().toString());
        LOGGER.info("第6个参数的类型是：" + sixth.getClass().getName().toString());
    }

    /**
     * <p>Title: 测试通用泛型类型</p>
     * @author 韩超@bksx 2018/2/22 11:08
     */
    public static void main(String[] args){
        MyMultiType<Integer,Double,Float,String,Long,Short> myMultiType = new MyMultiType<Integer, Double, Float, String, Long, Short>();
        myMultiType.set(1,1D,1F,"1",1L, (short) 1);
    }
}
