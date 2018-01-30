package pers.hanchao.generics.type;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * 演示K,V这种参数类型的用法
 * Created by 韩超 on 2018/1/30.
 */
public class MySet<K,V> {
    private Map<K,V> map = new HashMap<K, V>();

    private final static Logger LOGGER = Logger.getLogger(MySet.class);


    public void myPut(K key,V value){
        map.put(key,value);
        LOGGER.info("key:" + key.toString() + ",value=" + value.toString());
    }

    public int mySize(){
        return map.size();
    }
}
