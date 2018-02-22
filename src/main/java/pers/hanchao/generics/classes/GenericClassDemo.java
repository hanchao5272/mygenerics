package pers.hanchao.generics.classes;

import org.apache.log4j.Logger;
import sun.nio.cs.Surrogate;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型类示例
 * Created by 韩超 on 2018/2/22.
 */
public class GenericClassDemo {
    private final static Logger LOGGER = Logger.getLogger(GenericClassDemo.class);

    /**
     * <p>Title: 泛型类示例（键，值，时间）</p>
     * @author 韩超 2018/2/22 14:35
     */
    static class MyTimeMap<K,V,T>{
        private K key;
        private V value;
        private T time;

        @Override
        public String toString() {
            return "MyTimeMap{" +
                    "key=" + key +
                    ", value=" + value +
                    ", time=" + time +
                    '}';
        }

        public MyTimeMap(K key, V value, T time) {
            this.key = key;
            this.value = value;
            this.time = time;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public T getTime() {
            return time;
        }

        public void setTime(T time) {
            this.time = time;
        }
    }

    /**
     * <p>Title: 泛型类示例</p>
     * @author 韩超 2018/2/22 14:26
     */
    public static void main(String[] args) throws InterruptedException {
        List<MyTimeMap<Integer,String,Long>> myContainerList = new ArrayList<MyTimeMap<Integer,String,Long>>();
        myContainerList.add(new MyTimeMap(1,"张三",System.currentTimeMillis()));
        Thread.sleep(500);
        myContainerList.add(new MyTimeMap(2,"李四",System.currentTimeMillis()));
        Thread.sleep(500);
        myContainerList.add(new MyTimeMap(3,"王五",System.currentTimeMillis()));
        LOGGER.info(myContainerList);
    }
}
