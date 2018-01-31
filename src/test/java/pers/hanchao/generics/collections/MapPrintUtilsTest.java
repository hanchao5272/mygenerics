package pers.hanchao.generics.collections; 

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/** 
* MapPrintUtils Tester. 
* 
* @author <Authors name> 
* @since <pre>һ�� 31, 2018</pre> 
* @version 1.0 
*/ 
public class MapPrintUtilsTest {
    private final static Logger LOGGER = Logger.getLogger(MapPrintUtilsTest.class);


@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: printSet(E map) 
* 
*/ 
@Test
public void testPrintSet() throws Exception {
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
