package pers.hanchao.generics.wildcard;

/**
 * 人
 * Created by 韩超 on 2018/2/11.
 */
public class Person {
    /** id **/
    private Integer id;
    /** 姓名 **/
    private String name;

    public Person() {
    }

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
