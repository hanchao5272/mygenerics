package pers.hanchao.generics.wildcard;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

/**
 * 通配符[?]学习示例
 * Programmer extends Worker
 * Worker extends Person
 * Created by 韩超 on 2018/2/11.
 */
public class WildcardsDemo {

    private final static Logger LOGGER = Logger.getLogger(WildcardsDemo.class);

    /**
     * <p>Title: 通配符示例</p>
     * @author 韩超@bksx 2018/2/11 13:52
     */
    public static void main(String[] args){
        //测试无边界类型通配符
        List<?> list = Arrays.asList("1",5,10D,20L,30F,true,
                new Person(1,"张三"),
                new Worker(1,"张三","程序猿"),
                new Programmer(1,"张三","程序猿","Java"));

        //可以打印所有类型(基本数据类型会被装箱成包装类)
        printAll(list);

    }

    /**
     * <p>Title: 无边界通配符。<br/>
     * 无边界指的是只能确定这是一个类型，即：继承自Object类，不能确定其具体的类型。
     * 所以只能使用Object类提供的方法</p>
     * @author 韩超@bksx 2018/2/11 13:58
     */
    static void printAll(List<?> list){
        for (Object item : list){
            LOGGER.info(item.getClass().toString() + " : " + item.toString());
        }
    }

}
