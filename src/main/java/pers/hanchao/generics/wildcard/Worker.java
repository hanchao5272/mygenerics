package pers.hanchao.generics.wildcard;

import java.util.Objects;

/**
 * Created by 韩超 on 2018/2/11.
 */
public class Worker extends Person{
    /** 工作 **/
    private String job;

    public Worker(String job) {
        this.job = job;
    }

    public Worker(Integer id, String name, String job) {
        super(id, name);
        this.job = job;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "job='" + job + '\'' +
                "} " + super.toString();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
