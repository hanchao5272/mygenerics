package pers.hanchao.generics.collections;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * 演示Java自带泛型的集合Map类型
 * Created by 韩超 on 2018/1/31.
 */
public class MapPrintUtils {
    private final static Logger LOGGER = Logger.getLogger(MapPrintUtils.class);

    /**
     * <p>Title: 打印Map</p>
     * @author 韩超@bksx 2018/1/31 14:28
     */
    public static <E extends Map> void printSet(E map){
        if (null == map || map.isEmpty()){
            LOGGER.info("当前Map无值！");
        }else {
            for (Object key : map.keySet()){
                Object value = map.get(key);
                LOGGER.info("key:" + key + ",value:" + value);
            }
        }
    }
    /**
     * <p>Java泛型在Map中的使用</p>
     * @author hanchao 2018/2/23 22:14
     **/
    public static void main(String[] args) {
        //hashMap
        Map<String ,String> hashMap = new HashMap<>();
        hashMap.put("key1","value1");
        hashMap.put(null,"value2");
        hashMap.put("key3",null);
        LOGGER.info("hashMap的元素如下");
        MapPrintUtils.printSet(hashMap);

        //hashTable
        Map<Integer,Double> hashTable = new Hashtable<>();
        hashTable.put(1,2D);
        hashTable.put(2,3D);
        hashTable.put(3,4D);
        LOGGER.info("hashTable的元素如下：");
        MapPrintUtils.printSet(hashTable);
    }
}
