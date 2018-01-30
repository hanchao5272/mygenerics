package pers.hanchao.generics.bounded; 

import org.junit.Test;
import org.junit.Before; 
import org.junit.After;


/** 
* MyMath Tester. 
* 
* @author <Authors name> 
* @since <pre>һ�� 30, 2018</pre> 
* @version 1.0 
*/ 
public class MyMathTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: maximum(T x, T y, T z) 
* 
*/ 
@Test
public void testMaximum() throws Exception {
    Integer result = MyMath.MyMax(1,2);
    System.out.println(result);
}


} 
