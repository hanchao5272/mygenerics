package pers.hanchao.generics.method;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型方法示例
 * Created by 韩超 on 2018/2/22.
 */
public class GenericMethodDemo {
    private final static Logger LOGGER = Logger.getLogger(GenericMethodDemo.class);

    /**
     * <p>Title: 泛型类</p>
     * @author 韩超 2018/2/22 14:56
     */
    static class NotGenericMehtod<T>{
        private T t;
        /**
         * <p>Title: 这不是一个泛型方法</p>
         * @author 韩超 2018/2/22 14:56
         */
        void print(T t){
        }
    }

    /**
     * <p>Title: 泛型方法：注意参数列表中的泛型一定要在返回类型之前定义</p>
     * @author 韩超 2018/2/22 15:09
     */
    public static <E> void printList(List<E> list){
        if (null == list || list.size() == 0){
            LOGGER.info("无记录！");
        }else {
            for (E e : list){
                LOGGER.info(e.toString());
            }
        }
    }

    /**
     * <p>Title: 泛型方法：注意参数列表中的泛型一定要在返回类型之前定义，如果不定义，则类型检查不通过 </p>
     * @author 韩超 2018/2/22 15:27
     */
//    public static <T> void printList2(List<E> list){
//        if (null == list || list.size() == 0){
//            LOGGER.info("无记录！");
//        }else {
//            for (E e : list){
//                LOGGER.info(e.toString());
//            }
//        }
//    }

        /**
         * <p>Title: 泛型类+泛型方法</p>
         * @author 韩超 2018/2/22 15:28
         */
    static class GenericMehtod<T>{
        private T t;

            public T getT() {
                return t;
            }

            public void setT(T t) {
                this.t = t;
            }

            /**
         * <p>Title: 这是一个普通方法</p>
         * @author 韩超 2018/2/22 15:32
         */
        void print(T t){
            //这里的t是传递过来的参数，只能是泛型类实例化时指明的泛型类型
            LOGGER.info(t.getClass().toString());
        }

        /**
         * <p>Title: 泛型方法1：泛型类与泛型方法中的泛型并无关系</p>
         * @author 韩超 2018/2/22 15:29
         */
        <T> void out(T t){
            //这里的t是传递过来的参数，与类定义的泛型类型无关系
            LOGGER.info(t.getClass().toString());
        }
        /**
         * <p>Title: 泛型方法2：泛型类与泛型方法中的泛型并无关系</p>
         * @author 韩超 2018/2/22 15:29
         */
        <E> void out2(){
            //这里的t是类中的泛型的实例化对象
            //这个泛型方法没有意义：因为虽然在返回方法之前定义了泛型类型<E>，但是在参数列表中并没有使用这个泛型类型
            LOGGER.info(t.getClass().toString());
        }

        /**
         * <p>Title: 泛型方法3：可变参数</p>
         * @author 韩超 2018/2/22 15:44
         */
        <T> void out3(T... args){
            for (T t : args){
                LOGGER.info(t.getClass().toString() + ":" + t);
            }
        }

    }
    /**
     * <p>Title: 泛型方法示例</p>
     * @author 韩超 2018/2/22 14:55
     */
    public static void main(String[] args){
        //非泛型方示例
        NotGenericMehtod<Integer> notGenericMehtod = new NotGenericMehtod<Integer>();
        notGenericMehtod.print(1);

        LOGGER.info("泛型方法示例：主要参数列表中的泛型一定要在返回类型之前定义");
        //泛型方法示例：主要参数列表中的泛型一定要在返回类型之前定义
        List<User> userList = new ArrayList<User>();
        userList.add(new User(1,"张三"));
        userList.add(new User(2,"李四"));
        ListPrintUtils.printList(userList);

        LOGGER.info("=============================================");
        LOGGER.info("泛型方法示例：泛型类与泛型方法中的泛型并无关系");
        //泛型方法示例：泛型类与泛型方法中的泛型并无关系
        GenericMehtod<Integer> integerGM = new GenericMehtod<Integer>();
        LOGGER.info("---------------------------------------------");
        LOGGER.info("泛型类实例化成Integer，泛型方法却处理的String类型。泛型方法的泛型是在调用时被确定为具体类型的，与泛型类的泛型类型并无关系。");
        integerGM.out("1".toString());

        LOGGER.info("---------------------------------------------");
        LOGGER.info("泛型方法可以调用泛型类的实例化对象");
        integerGM.setT(1);
        integerGM.out2();

        LOGGER.info("---------------------------------------------");
        LOGGER.info("泛型类的普通方法中泛型变量的类型必须与泛型类实例化时指定的泛型变量类类型一致");
        //报错，因为必须与类的泛型类型一致 ，即Integer
        //integerGM.print(2L);
        integerGM.print(new Integer(1));

        LOGGER.info("---------------------------------------------");
        LOGGER.info("泛型方法中可以使用可变泛型参数");
        integerGM.out3(1,2L,3F,"4");
    }
}
