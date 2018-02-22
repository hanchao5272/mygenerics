package pers.hanchao.generics.interfaces;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

/**
 * 泛型接口示例：实现多继承
 * Created by 韩超 on 2018/2/22.
 */
public class GenericInterfaceDemo {
    private final static Logger LOGGER = Logger.getLogger(GenericInterfaceDemo.class);

    /**
     * <p>Title: 演示数据生成器接口</p>
     * @author 韩超 2018/2/22 14:08
     */
    interface IDemoDataGenerator<T>{
        List<T> generateDemoData();
    }

    /**
     * <p>Title: 字符串类型的演示数据生成器</p>
     * @author 韩超 2018/2/22 14:08
     */
    static class StringDDG implements IDemoDataGenerator<String> {
        @Override
        public List<String> generateDemoData() {
            return Arrays.asList("Hello!","Worker","test","tomorrow");
        }
    }

    static class User{
        private Integer id;
        private String name;

        public User(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

    }

    /**
     * <p>Title: 用户 演示数据生成器</p>
     * @author 韩超 2018/2/22 14:11
     */
    static class UserDDG implements IDemoDataGenerator<User>{

        @Override
        public List<User> generateDemoData() {
            return Arrays.asList(new User(1,"张三"),new User(2,"李四"),new User(3,"王五"));
        }
    }

    /**
     * <p>Title: 泛型接口示例</p>
     * @author 韩超 2018/2/22 14:05
     */
    public static void main(String[] args){
        StringDDG stringDDG = new StringDDG();
        LOGGER.info(stringDDG.generateDemoData());

        UserDDG userDDG = new UserDDG();
        LOGGER.info(userDDG.generateDemoData());
    }
}
