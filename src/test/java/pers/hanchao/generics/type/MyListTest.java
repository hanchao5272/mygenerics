package pers.hanchao.generics.type; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* MyList Tester. 
* 
* @author <Authors name> 
* @since <pre>һ�� 30, 2018</pre> 
* @version 1.0 
*/ 
public class MyListTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: add(E e) 
* 
*/ 
@Test
public void testMyAdd() throws Exception {
    MyList<String> stringMyList = new MyList<String>();
    stringMyList.myAdd(new String("hello!"));
}

/** 
* 
* Method: size() 
* 
*/ 
@Test
public void testMySize() throws Exception {
    MyList<Integer> integerMyList = new MyList<Integer>();
    integerMyList.myAdd(1);
    Assert.assertEquals(1,integerMyList.mySize());
}


} 
