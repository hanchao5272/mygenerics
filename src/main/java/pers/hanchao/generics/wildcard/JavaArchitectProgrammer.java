package pers.hanchao.generics.wildcard;

/**
 * Java架构师
 * Created by 韩超 on 2018/2/12.
 */
public class JavaArchitectProgrammer extends JavaProgrammer {

    /** 等级 **/
    private String level;

    @Override
    public String toString() {
        return "JavaArchitectProgrammer{" +
                "level='" + level + '\'' +
                '}';
    }

    public JavaArchitectProgrammer(String job) {
        super(job);
    }

    public JavaArchitectProgrammer(Integer id, String name, String job) {
        super(id, name, job);
    }

    public JavaArchitectProgrammer(String job, String lang) {
        super(job, lang);
    }

    public JavaArchitectProgrammer(Integer id, String name, String job, String lang) {
        super(id, name, job, lang);
    }

    public JavaArchitectProgrammer(String job, String lang, String level) {
        super(job, lang);
        this.level = level;
    }

    public JavaArchitectProgrammer(Integer id, String name, String job, String lang, String level) {
        super(id, name, job, lang);
        this.level = level;
    }

    public JavaArchitectProgrammer(String job, String lang, String post, String level) {
        super(job, lang, post);
        this.level = level;
    }

    public JavaArchitectProgrammer(Integer id, String name, String job, String lang, String post, String level) {
        super(id, name, job, lang, post);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
