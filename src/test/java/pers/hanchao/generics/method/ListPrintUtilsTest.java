package pers.hanchao.generics.method; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;
import java.util.List;

/** 
* ListPrintUtils Tester. 
* 
* @author <Authors name> 
* @since <pre>һ�� 30, 2018</pre> 
* @version 1.0 
*/ 
public class ListPrintUtilsTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: printList(List<E> list) 
* 
*/ 
@Test
public void testPrintList() throws Exception {
    List<User> userList = new ArrayList<User>();
    userList.add(new User(1,"张三"));
    userList.add(new User(2,"李四"));
    ListPrintUtils.printList(userList);

    List<String> stringList = new ArrayList<String>();
    stringList.add("111111111111");
    stringList.add("222222222222");
    ListPrintUtils.printList(stringList);
}


} 
