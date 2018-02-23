package pers.hanchao.generics.collections;

import org.apache.log4j.Logger;

import java.util.*;

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

    /**
     * <p>Java泛型在List和Set中的使用</p>
     * @author hanchao 2018/2/23 22:13
     **/
    public static void main(String[] args) {
        //List
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(new Integer(1));
        integerList.add(2);
        integerList.add(new Integer(3));
        LOGGER.info("integerList的元素如下：");
        CollectionPrintUtils.pringCollection(integerList);
        //Set
        Set<String > stringSet = new HashSet<String>();
        stringSet.add("set1");
        stringSet.add("set2");
        stringSet.add("set3");
        LOGGER.info("stringSet的元素如下");
        CollectionPrintUtils.pringCollection(stringSet);
    }
}
