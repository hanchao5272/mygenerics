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
        //通过泛型方法进行数据初始化。这个无边界类型的列表，可以初始化任意类型的对象
        List<?> list = Arrays.asList("1",5,10D,20L,30F,true,
                new Person(1,"张三"),
                new Worker(1,"张三","程序猿"),
                new Programmer(1,"张三","程序猿","Java"));

        //下面的add操作类型检查报错，因为?代表不确定其类型，所以不知道如何添加
        //list.add(new Integer(1));

        //Integer、Person类型都可以通过get取值，取值需要类型转换
        Integer integer = (Integer) list.get(1);
        Object obj = list.get(0);
        Person person = (Person) list.get(0);

        //可以打印所有类型(基本数据类型会被装箱成包装类)
        printAllObject(list);

        ///////////////////////////////////// ? extends XxxX //////////////////////////////////////
        LOGGER.info("==============上边界类型通配符（? extends）学习示例==============");
        //测试上边界类型通配符 ? extends XXXXX
        //通过泛型方法进行数据初始化
        List<? extends Number> numberList  = Arrays.asList(5,10D,20L,30F);

        //下面的add操作类型检查报错，因为?代表不确定其类型，所以不知道如何添加
        //numberList.add(new Integer(1));

        //Number类型的及子类型可以通过get获取值，但是需要注意类型转换
        Number number = (Number) list.get(0);
        Integer integer1 = (Integer) list.get(0);
        //Person类型不是Number类的子类，不能通过get获取值
        //Person person1 = numberList.get(0);


        List<? extends Person> peopleList = Arrays.asList(new Person(1,"张三"),
                new Worker(1,"张三","程序猿"),
                new Programmer(1,"张三","程序猿","Java"));
        //类型检查无法通过
        //peopleList.add(new Person(1,"张三"));
        Programmer programmer = (Programmer) peopleList.get(0);
        Worker worker  = (Worker) peopleList.get(0);
        //因为Integer与Person无继承关系，所以，无论如何也无法取值
        //Integer integer2 = peopleList.get(0);

        //因为方法的参数限定了边界，所以也会进行类型检查printNumberList只能接受Number类型的列表
        //类型检查通过
        printNumberList(numberList);
        //类型检查无法通过
        //printNumberList(peopleList);
        //类型检查无法通过
        //printPersonList(numberList);
        //类型检查通过
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
        //不能add值，因为类型不确定
        Integer integer = new Integer(1);
        //list.add(integer);
        for (Number item : list){
            LOGGER.info(item.getClass().toString() + " , doubleValue : " + item.doubleValue());
        }
        System.out.println();
    }
    static void printPersonList(List<? extends Person> list){
        //不能add值，因为类型不确定
        Person person = new Person(1,"张三");
        //list.add(person);
        for (Person item : list){
            LOGGER.info(item.getClass().toString() + " , name : " + item.getName());
        }
        System.out.println();
    }

    /**
     * <p>Title: 下边界类型通配符<br/>
     * 下边界类型指的是：不能确定具体类型，只能确定其子类型，即该类继承自当前类。<br/>
     * 下边界类型通配符修饰的对象，</p>
     * @author 韩超@bksx 2018/2/11 15:38
     */
    static List setNumberList(List<? super Programmer> list){
        //只能够添加Programmer类型的对象
        Programmer programmer = new Programmer(2,"李四","攻城狮","C#");
        list.add(programmer);
        //不能添加其他类型的对象
        //Worker worker = new Worker(1,"张三","程序猿");
        //list.add(worker);

        Object o = list.get(0);
        Person person = (Person) list.get(0);

        return list;
    }

    static void test1(List<? super Worker> list){
        Person person = new Person(1,"张三");
        Worker worker = new Worker(1,"张三","程序猿");
        Programmer programmer = new Programmer(1,"张三","程序猿","Java");
        list.add(programmer);
        list.add(worker);
//        list.add(person);
    }
}
