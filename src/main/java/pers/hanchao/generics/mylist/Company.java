package pers.hanchao.generics.mylist;

/**
 * Created by 韩超 on 2018/1/29.
 */
public class Company {
    /** 公司id **/
    private Integer id;
    /** 公司名称 **/
    private String name;
    /** 地址 **/
    private String address;

    public Company(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
