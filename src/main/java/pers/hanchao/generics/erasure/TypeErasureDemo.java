package pers.hanchao.generics.erasure;

import org.apache.log4j.Logger;

import java.lang.reflect.InvocationTargetException;

/**
 * 类型擦除示例
 * Created by 韩超 on 2018/2/12.
 */
public class TypeErasureDemo {
    private final static Logger LOGGER = Logger.getLogger(TypeErasureDemo.class);

    /**
     * <p>Title: 类型擦除示例</p>
     * <p></p>
     * @author 韩超@bksx 2018/2/12 13:46
     */
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //验证无界限的泛型类型的擦除
        LOGGER.info("验证无界限的编译之后的类型：");
        MyUnBoundedType myUnBoundedType = new MyUnBoundedType();
        MyUnBoundedType<Integer> integerMyUnBoundedType = new MyUnBoundedType<Integer>();
        MyUnBoundedType<Long> longMyUnBoundedType = new MyUnBoundedType<Long>();
        LOGGER.info(myUnBoundedType.getClass().toString());
        LOGGER.info(integerMyUnBoundedType.getClass().toString());
        LOGGER.info(longMyUnBoundedType.getClass().toString());
        LOGGER.info("编译会后泛型类型被擦除，保留为原始类型，所以是一样的。\n");

        LOGGER.info("验证类型检查：");
        //因为已经指定integerMyType的泛型类型为Integer，所以不能设置Long类型的值
        integerMyUnBoundedType.setT(new Integer(1));
        //integerMyUnBoundedType.setT(new Long(1L));
        LOGGER.info("当指定了泛型的具体类型时，泛型通过类型检查，保证类型的正确性\n");

        LOGGER.info("验证通过反射跳过类型检查：");
        //其实，通过反射还是可以设置其他类型的数据
        integerMyUnBoundedType.getClass().getDeclaredMethod("setT",Object.class).invoke(integerMyUnBoundedType,new Long(1));
        LOGGER.info("integerMyUnBoundedType类型擦除之后的原始类型：" + integerMyUnBoundedType.getClass().getDeclaredField("t").getType());
        LOGGER.info("虽然指定了泛型的具体类型，但是还是可以通过反射设置其他的数据类型，因为类型擦除之后，原始类型是Object类型\n");

        LOGGER.info("验证对有界类型的擦除：");
        //验证对有界类型的擦除
        MyBoundedType<Integer> integerMyBoundedType = new MyBoundedType<Integer>();
        //有界类型擦除之后，不能通过Object类型进行反射，因为擦除之后的原始类型不是Object，而是Number
        //虽然类型检查不报错，但是编译报错
        //integerMyBoundedType.getClass().getDeclaredMethod("setT",Object.class).invoke(integerMyBoundedType,new Long(1));
        integerMyBoundedType.getClass().getDeclaredMethod("setT",Number.class).invoke(integerMyBoundedType,new Long(1));
        LOGGER.info("integerMyBoundedType类型擦除之后的原始类型：" + integerMyBoundedType.getClass().getDeclaredField("t").getType());
        LOGGER.info("有界类型擦除之后，不能通过Object类型进行反射，因为擦除之后的原始类型不是Object，而是Number类型\n");

        //验证隐式类型转换
        LOGGER.info("验证隐式类型转换：");
        LOGGER.info("integerMyUnBoundedType类型擦除之后的方法返回类型：" + integerMyUnBoundedType.getClass().getDeclaredMethod("getT").getReturnType());
        integerMyUnBoundedType.setT(1);
        Integer integer = integerMyUnBoundedType.getT();
        LOGGER.info("无界泛型将Object类型隐式转换成了指定类型Integer");

        LOGGER.info("integerMyBoundedType类型擦除之后的方法返回类型：" + integerMyBoundedType.getClass().getDeclaredMethod("getT").getReturnType());
        integerMyBoundedType.setT(1);
        Integer integer1 = integerMyBoundedType.getT();
        LOGGER.info("无界泛型将Object类型隐式转换成了指定类型Integer\n");

        LOGGER.info("验证多态中的泛型：桥方法");
        //验证多态中的泛型
        MyOverrideType myOverrideType = new MyOverrideType();
        LOGGER.info("我们重写的方法:" + myOverrideType.getClass().getDeclaredMethod("setT",Integer.class));
        LOGGER.info("编译器生成的桥方法:" + myOverrideType.getClass().getDeclaredMethod("setT",Number.class));
        MyType myType = new MyType();
        //因为没有重写方法，所有没有这个方法
        //LOGGER.info("我们重写的方法:" + myType.getClass().getDeclaredMethod("setT",Integer.class));
        //因为没有重写方法，所以没有桥方法
        //LOGGER.info("编译器生成的桥方法:" + myType.getClass().getDeclaredMethod("setT",Number.class));
        LOGGER.info("一个类继承自一个泛型类，在编译时，编译器会生成桥方法，通过桥方法调用我们重写的方法，依次来保证多态性。");
    }
    /**
     * <p>Title: 泛型类</p>
     * @author 韩超@bksx 2018/2/12 13:49
     */
    static class MyUnBoundedType<T>{
        public MyUnBoundedType() {
        }

        private T t;

        public T getT() {
            return t;
        }

        public void setT(T t) {
            this.t = t;
        }
    }


    /**
     * <p>Title: 泛型类</p>
     * @author 韩超@bksx 2018/2/12 13:49
     */
    static class MyBoundedType<T extends Number>{
        public MyBoundedType() {
        }

        public MyBoundedType(T t) {
            this.t = t;
        }

        private T t;

        public T getT() {
            return t;
        }

        public void setT(T t) {
            this.t = t;
        }
    }

    /**
     * <p>Title: 泛型与多态</p>
     * @author 韩超@bksx 2018/2/12 15:08
     */
    static class MyType extends MyBoundedType<Integer>{

    }
    /**
     * <p>Title: 泛型与多态</p>
     * @author 韩超@bksx 2018/2/12 15:08
     */
    static class MyOverrideType extends MyBoundedType<Integer>{

        @Override
        public void setT(Integer t) {
            super.t = t;
        }

    }

}
