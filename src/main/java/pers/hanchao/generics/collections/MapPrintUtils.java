package pers.hanchao.generics.collections;

import org.apache.log4j.Logger;

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
}
