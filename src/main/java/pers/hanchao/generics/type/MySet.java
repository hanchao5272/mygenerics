package pers.hanchao.generics.type;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Title: 映射泛型类型示例</p>
 * @author 韩超@bksx 2018/2/22 11:15
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
    /**
     * <p>Title: 映射泛型类型示例</p>
     * @author 韩超@bksx 2018/2/22 11:14
     */
    public static void main(String[] args){
        MySet<String,Integer> mySet = new MySet<String, Integer>();
        mySet.myPut("001",100);
    }
}
