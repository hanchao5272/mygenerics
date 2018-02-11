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
        //////////////////////////////////// ? //////////////////////////////////////////////////
        //通配符可以用于变量的定义和赋值，如main方法中
        //也可以用于定义参数类型，如在方法定义中定义参数，如下面的print方法

        LOGGER.info("==============无界限类型通配符（?）学习示例==============");
        //测试无边界类型通配符
        //这个无边界类型的列表，可以添加任意类型的对象
        List<?> list = Arrays.asList("1",5,10D,20L,30F,true,
                new Person(1,"张三"),
                new Worker(1,"张三","程序猿"),
                new Programmer(1,"张三","程序猿","Java"));
        //可以打印所有类型(基本数据类型会被装箱成包装类)
        printAllObject(list);

        ///////////////////////////////////// ? extends XxxX //////////////////////////////////////
        LOGGER.info("==============上边界类型通配符（? extends）学习示例==============");
        //测试上边界类型通配符 ? extends XXXXX
        //这个数值类型的列表，只能添加数值类型的对象
        List<? extends Number> numberList  = Arrays.asList(5,10D,20L,30F);
        //如果添加其他类型的对象，编译无法通过
        //numberList.add("1");
        //numberList.add(new Person(1,"张三"));

        List<? extends Person> peopleList = Arrays.asList(new Person(1,"张三"),
                new Worker(1,"张三","程序猿"),
                new Programmer(1,"张三","程序猿","Java"));
        //编译无法通过
        //peopleList.add(1);

        //因为方法的参数限定了边界，所以也会进行类型检查printNumberList只能接受Number类型的列表
        //编译通过
        printNumberList(numberList);
        //编译无法通过
        //printNumberList(peopleList);
        //编译无法通过
        //printPersonList(numberList);
        //编译通过
        printPersonList(peopleList);

        ///////////////////////////////////// ? super XxxX //////////////////////////////////////
        LOGGER.info("==============下边界类型通配符（? super）学习示例==============");
        //测试下边界类型通配符? super XXX
        List<? super Number> numberList2 = Arrays.asList(5,10D,20L,30F);
    }

    /**
     * <p>Title: 无边界类型通配符。<br/>
     * 无边界类型指的是：不能确定具体类型，只能确定这是一个Java类型，即：继承自Object类。<br/>
     * 无边界类型通配符修饰的对象，只能调用Object类提供的方法</p>
     * @author 韩超@bksx 2018/2/11 13:58
     */
    static void printAllObject(List<?> list){
        for (Object item : list){
            LOGGER.info(item.getClass().toString() + " : " + item.toString());
        }
        System.out.println();
    }

    /**
     * <p>Title:上边界类型通配符。<br/>
     * 上边界类型指的是：不能确定具体类型，只能确定其父类型，即：继承自某类。<br/>
     * 上边界类型通配符修饰的对象，只能调用其父类型提供的方法，比Object的可选方法更多，更灵活。<br/>
     * 可以把无边界类型理解成? extends Object</p>
     * @author 韩超@bksx 2018/2/11 14:28
     */
    static void printNumberList(List<? extends Number> list){
        for (Number item : list){
            LOGGER.info(item.getClass().toString() + " , doubleValue : " + item.doubleValue());
        }
        System.out.println();
    }
    static void printPersonList(List<? extends Person> list){
        for (Person item : list){
            LOGGER.info(item.getClass().toString() + " , name : " + item.getName());
        }
        System.out.println();
    }

}
