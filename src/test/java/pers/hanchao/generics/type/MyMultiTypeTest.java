package pers.hanchao.generics.type; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* MyMultiType Tester. 
* 
* @author <Authors name> 
* @since <pre>һ�� 30, 2018</pre> 
* @version 1.0 
*/ 
public class MyMultiTypeTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: set(T first, S seconde, U third, V fourth, A fifth, B sixth) 
* 
*/ 
@Test
public void testSet() throws Exception { 
 MyMultiType<Integer,Double,Float,String,Long,Short> myMultiType = new MyMultiType<Integer, Double, Float, String, Long, Short>();
 myMultiType.set(1,1D,1F,"1",1L, (short) 1);
} 


} 
