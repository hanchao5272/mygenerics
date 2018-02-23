package pers.hanchao.generics.collections;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <p>集合工具类Collections和Arrays中的泛型示例</p>
 * @author hanchao 2018/2/23 22:33
 **/
public class ArraysAndCollectionsUtils {
    private static final Logger LOGGER = Logger.getLogger(ArraysAndCollectionsUtils.class);

    public static void main(String[] args) {
        LOGGER.info("Arrays工具类中的泛型示例：public static <T> List<T> asList(T... a) {}");
        List<? extends Number> numberList = Arrays.asList(1,2D,3L,4.0F);
        numberList.forEach(LOGGER::info);

        System.out.println();
        LOGGER.info("Collections工具类中的泛型示例：二分查找public static <T>" +
                " int binarySearch(List<? extends Comparable<? super T>> list, T key) {}");
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        LOGGER.info("二分查找：" + Collections.binarySearch(integerList,3));

        System.out.println();
        LOGGER.info("Collections工具类中的泛型示例：排序public static <T extends Comparable<? super T>> void sort(List<T> list) {}");
        List<Double> doubleList = Arrays.asList(2D,1D,3D);
        LOGGER.info("第一次打印：");
        doubleList.forEach(LOGGER::info);
        LOGGER.info("排序");
        Collections.sort(doubleList);
        LOGGER.info("第二次打印：");
        doubleList.forEach(LOGGER::info);

        System.out.println();
        LOGGER.info("Collections工具类中的泛型示例：排序public static <T> void copy(List<? super T> dest, List<? extends T> src) {}");
        List<String > stringList = Arrays.asList("A","B","C");
        List<String > stringList2 = Arrays.asList("a","b","c","d");
        Collections.copy(stringList2,stringList);
        LOGGER.info(stringList2);
    }
}
