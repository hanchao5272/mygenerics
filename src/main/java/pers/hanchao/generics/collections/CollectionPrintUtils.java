package pers.hanchao.generics.collections;

import org.apache.log4j.Logger;

import java.util.Collection;

/**
 * 演示Java自带泛型的集合Collection类型
 * Created by 韩超 on 2018/1/30.
 */
public class CollectionPrintUtils {
    private final static Logger LOGGER = Logger.getLogger(CollectionPrintUtils.class);

    /**
     * <p>Title: 打印集合</p>
     * @author 韩超@bksx 2018/1/31 13:31
     */
    public static <E extends Collection> void pringCollection(E collection){
        if(null == collection || collection.isEmpty()) {
            LOGGER.info("无记录");
        }else {
            //java lambda表达式
            collection.forEach(LOGGER::info);
        }
    }
}
