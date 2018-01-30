package pers.hanchao.generics.method;

/**
 * Created by 韩超 on 2018/1/30.
 */
public class User {
    /**
     * id
     **/
    private Integer id;
    /**
     * 姓名
     **/
    private String name;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
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
