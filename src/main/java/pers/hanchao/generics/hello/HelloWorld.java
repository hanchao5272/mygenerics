package pers.hanchao.generics.hello;

import org.apache.log4j.Logger;

/**
 * 泛型类示例
 * Created by 韩超 on 2018/2/12.
 */
public class HelloWorld<T> {
    private final static Logger LOGGER = Logger.getLogger(HelloWorld.class);

    private T t;

    public T getValue() {
        return t;
    }

    public void setValue(T t) {
        this.t = t;
    }

    public static void main(String[] args){
        LOGGER.info("泛型类示例：");
        //泛型类示例
        HelloWorld<String > helloWorld = new HelloWorld<String >();
        helloWorld.setValue("Hello World!");
        //IDE提供的类型检查确保只能设置String类型的对象，Long类型报错
        //helloWorld.setValue(5211314L);
        LOGGER.info(helloWorld.getValue());

        HelloWorld<Long> helloWorld1 = new HelloWorld<Long>();
        helloWorld1.setValue(5211314L);
        //IDE提供的类型检查确保只能设置Long类型的对象，String类型报错
        //helloWorld1.setValue("Hello World!");
        LOGGER.info(helloWorld1.getValue() + "\n");

        LOGGER.info("泛型方法示例：");
        //泛型方法示例
        printHelloWorld("Hello World!");
        printHelloWorld(5211314 + "\n");

        LOGGER.info("泛型接口示例");
        //泛型接口示例
        MyInterface myHelloWorld = new MyHelloWorld();
        //Number类型都可以
        myHelloWorld.print(5211314L);
        myHelloWorld.print(521);
        //String类型不可以
        //myHelloWorld.print("S");
    }

    /**
     * <p>Title: 泛型方法</p>
     * @author 韩超@bksx 2018/2/12 17:14
     */
    static <T> void printHelloWorld(T t){
        LOGGER.info(t);
    }

    /**
     * <p>Title: 泛型接口</p>
     * @author 韩超@bksx 2018/2/12 17:15
     */
    interface MyInterface<T extends Number>{
        void print(T t);
    }
    static class MyHelloWorld implements MyInterface{

        @Override
        public void print(Number number) {
            LOGGER.info(number);
        }
    }
}
