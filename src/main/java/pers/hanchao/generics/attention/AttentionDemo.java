package pers.hanchao.generics.attention;

import org.apache.log4j.Logger;

/**
 * 泛型注意事项
 * Created by 韩超 on 2018/2/12.
 */
public class AttentionDemo {
    private final static Logger LOGGER = Logger.getLogger(AttentionDemo.class);

    public static void main(String[] args){

        LOGGER.info("1.Java泛型不能使用原始类型");
        LOGGER.info("因为泛型在编译时，会进行类型擦除，最后只保留原始类型。而原始类型只能是Object类及其子类，当然不能使基本数据类型。\n");

        LOGGER.info("2.");
    }
}
