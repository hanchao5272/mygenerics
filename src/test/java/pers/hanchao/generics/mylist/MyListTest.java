package pers.hanchao.generics.mylist; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

/** 
* MyList Tester. 
* 
* @author <Authors name> 
* @since <pre>һ�� 29, 2018</pre> 
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
* Method: size() 
* 
*/ 
@Test
public void testSize() throws Exception {

}

/** 
* 
* Method: add(T t) 
* 
*/ 
@Test
public void testAdd() throws Exception { 
}

/** 
* 
* Method: print() 
* 
*/ 
@Test
public void testPrint() throws Exception {
        MyList<User> userMyList = new MyList<User>();
        userMyList.add(new User(1,"张三",15));
        userMyList.add(new User(2,"李四",25));
        userMyList.add(new User(3,"王五",35));
        userMyList.print();

        MyList<Company> companyMyList = new MyList<Company>();
        companyMyList.add(new Company(11,"大公司","北京"));
        companyMyList.add(new Company(12,"中公司","上海"));
        companyMyList.add(new Company(13,"小公司","广州"));
        companyMyList.print();
}


} 
