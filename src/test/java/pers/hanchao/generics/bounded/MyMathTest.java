package pers.hanchao.generics.bounded; 

import org.apache.log4j.Logger;
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
    private final static Logger LOGGER = Logger.getLogger(MyMathTest.class);


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
    public void testMyMax() throws Exception {
        Integer result = MyMath.MyMax(1,2);
        LOGGER.info(result);
    }

    @Test
    public void testMyMax2() throws Exception{
        Double result = MyMath.MyMax2(1D,2D);
        LOGGER.info(result);

    }

} 
