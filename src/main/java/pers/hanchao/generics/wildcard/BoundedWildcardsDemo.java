package pers.hanchao.generics.wildcard;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 通配符：上边界、下边界和无边界
 * Created by 韩超 on 2018/2/12.
 */
public class BoundedWildcardsDemo {
    private final static Logger LOGGER = Logger.getLogger(BoundedWildcardsDemo.class);

    /**
     * <p>Title: 通配符：上边界、下边界和无边界</p>
     *
     * Person<br/>
     * Worker extends Person<br/>
     * Programmer extends Worker<br/>
     * JavaProgrammer extends Programmer<br/>
     * JavaArchitectProgrammer extends JavaProgrammer<br/>
     *
     * @author 韩超@bksx 2018/2/12 9:57
     */
    public static void main(String[] args){
        Person person = new Person(1,"张三");
        Worker worker = new Worker(1,"张三","攻城狮");
        Programmer programmer = new Programmer(1,"张三","攻城狮","Java");
        JavaProgrammer javaProgrammer = new JavaProgrammer(1,"张三","攻城狮","Java","架构师");
        JavaArchitectProgrammer architectProgrammer = new JavaArchitectProgrammer(1,"张三","攻城狮","Java","架构师");

        LOGGER.info("上边界类型通配符（? extends ）示例");
        //测试上边界类型通配符
        //定义一个列表，唯一可以确定的是：此列表的元素类型的父类型是Programmer
        List<? extends Programmer> programmerUpperList = null;
        //do something...
        //某种情形下，此列表被赋值成JavaProgrammer的列表
        programmerUpperList = new ArrayList<JavaProgrammer>();
        //赋值
        programmerUpperList = Arrays.asList(
                new Programmer(1,"张三","攻城狮","Java"),
                new JavaProgrammer(1,"张三","攻城狮","Java","架构师"),
                new JavaArchitectProgrammer(1,"张三","攻城狮","Java","架构师")
        );
        //因为唯一可以确定此列表的元素类型的父类型是Programmer，所以可以将取得的元素值赋值给Programmer对象
        programmer = programmerUpperList.get(0);
        //Worker和Person是其父类，可以向上转型
        worker = programmerUpperList.get(1);
        person = programmerUpperList.get(2);
        LOGGER.info(programmer.getClass().toString() + " : " + programmer.toString());
        LOGGER.info(worker.getClass().toString() + " : " + worker.toString());
        LOGGER.info(person.getClass().toString() + " : " + person.toString());
        LOGGER.info("是什么类型，取出来就是什么类型");
        //虽然此列表被实例化成JavaProgrammer的列表，但是不能确定其中的数据就是JavaProgrammer类型的，所以不能将取得的值赋值给JavaProgrammer对象
//        javaProgrammer = programmerUpperList.get(0);
        //不能确定之后实例化的类型是Programmer、JavaProgrammer还是JavaArchitectProgrammer，所以不接受add
//        programmerUpperList.add(programmer);
        ////总结：add方法受限，可以进行取值。
        LOGGER.info("上边界类型通配符（? extends）：因为可以确定最大类型，所以可以以最大类型去获取数据。但是不能写入数据。\n");

        LOGGER.info("下边界类型通配符（? super ）示例");
        //测试下边界类型通配符
        //定义一个列表，唯一可以确定的是：此列表的元素类的子类型是Programmer
        List<? super Programmer> programmerLowerList = null;
        //do something ...
        //某种情形下，此列表被赋值成Worker的列表
        programmerLowerList = new ArrayList<Worker>();
        //因为无法确定对象的实例化类型是Programmer、Worker还是Person，所有不能get
//        programmer = programmerLowerList.get(0);
//        worker = programmerLowerList.get(0);
        //因为唯一可以确定此列表的元素类型的子类是Programmer，所以可以添加Programmer类型的对象及其子类型
        programmerLowerList.add(programmer);
        programmerLowerList.add(javaProgrammer);
        programmerLowerList.add(architectProgrammer);
        LOGGER.info(programmerLowerList);
        LOGGER.info("存的什么类型，就是什么类型");
        LOGGER.info("下边界类型通配符（? super）：因为可以确定最小类型，所以可以以最小类型去写入数据。但是不能获取数据。\n");

        LOGGER.info("无边界类型通配符示例，无边界=上边界Object");
        //无边界类型通配符示例
        List<?> programmerNoList = null;
        //do something ...
        //某种情形下，此列表被赋值成Programmer的列表
        programmerNoList = new ArrayList<Programmer>();
        programmerNoList = Arrays.asList(1,programmer);
        //唯一可以确定其最大类是Object ，所以可以根据Object类型取值
        Object obj0 = programmerNoList.get(0);
        Object obj1 = programmerNoList.get(1);
        LOGGER.info(obj0.getClass().toString() + " : " + obj0.toString());
        LOGGER.info(obj1.getClass().toString() + " : " + obj1.toString());
        LOGGER.info("无边界类型通配符（?）：等同于（? extends Object），因为可以确定最大类型为Object，所以可以以Object类型去获取数据。但是不能写入数据。\n");

        LOGGER.info("下边界类型通配符（? extends ）的继续理解：上边界类型通配符真的无法取值吗？");
        //上面已经因为无法确定类型，所以无法通过向上转型取值
//        programmer = programmerLowerList.get(0);
        //但是可以确定其最大类型必然是Object，是否可以通过Object取值？？
        Object object =  programmerLowerList.get(0);
        LOGGER.info(object.getClass().toString() + ":" + object.toString());
        LOGGER.info("下边界类型通配符（? super ） = （? super ） + （? extends Object）");
        LOGGER.info("意义不大");
    }


}
