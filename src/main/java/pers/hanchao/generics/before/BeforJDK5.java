package pers.hanchao.generics.before;

import org.apache.log4j.Logger;

import java.util.ArrayList;

/**
 * JDK1.5之前的泛型思想实现
 * Created by 韩超 on 2018/2/12.
 */
public class BeforJDK5 {
    private final static Logger LOGGER = Logger.getLogger(BeforJDK5.class);

    /**
     * <p>Title: JDK1.5之前的ArrayList</p>
     * @author 韩超@bksx 2018/2/12 16:41
     */
    public static void main(String[] args){
        //JDK1.5之前的ArrayList的用法
        ArrayList arrayList = new ArrayList();
        //可以随意添加任意类型的对象
        arrayList.add(1);//Integer
        arrayList.add("1");//String
        //张三前辈知道第一个元素是Integer类型的，所以他写的程序没错
        Integer integer = (Integer) arrayList.get(0);
        LOGGER.info("张三前辈取值：" + integer);
        //李四不知道第二个元素是什么类型，因为张三前辈已经离职了，但他看张三前辈使用Integer取值的，
        // 所以他猜测也是Integer类型的，但是他没想到实际是String类型的，所以会报类型转换错误
        Integer integer1 = (Integer)arrayList.get(1);
        LOGGER.info("李四后生取值：" + integer1);

        //JKD1.5之后的ArrayList
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        integerArrayList.add(1);//添加Integer正常
        //不能添加String类型，因为无法通过IDE的初步类型检查
        //integerArrayList.add("1");
        //王五不需要问前辈，就很容易知道这个列表存储的是Integer
        Integer integer2 = integerArrayList.get(0);
        LOGGER.info("王五后生取值：" + integer2);


    }
}
