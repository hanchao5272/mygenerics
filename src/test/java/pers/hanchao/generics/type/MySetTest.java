package pers.hanchao.generics.type; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* MySet Tester. 
* 
* @author <Authors name> 
* @since <pre>һ�� 30, 2018</pre> 
* @version 1.0 
*/ 
public class MySetTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: myPut(K key, V value) 
* 
*/ 
@Test
public void testMyPut() throws Exception { 
    MySet<String,Integer> mySet = new MySet<String, Integer>();
    mySet.myPut("001",100);
} 

/** 
* 
* Method: mySize() 
* 
*/ 
@Test
public void testMySize() throws Exception {
    MySet<String,Integer> mySet = new MySet<String, Integer>();
    mySet.myPut("001",100);
    Assert.assertEquals(1, mySet.mySize());
}


} 
