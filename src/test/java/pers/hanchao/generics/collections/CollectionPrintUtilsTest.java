package pers.hanchao.generics.collections;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/** 
* CollectionPrintUtils Tester. 
* 
* @author <Authors name> 
* @since <pre>һ�� 31, 2018</pre> 
* @version 1.0 
*/ 
public class CollectionPrintUtilsTest {
    private final static Logger LOGGER = Logger.getLogger(CollectionPrintUtilsTest.class);
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: pringCollection(E collection) 
* 
*/ 
@Test
public void testPringCollection() throws Exception {
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
