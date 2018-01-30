package pers.hanchao.generics.type;

import org.apache.log4j.Logger;

/**
 * Created by 韩超 on 2018/1/30.
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
}
