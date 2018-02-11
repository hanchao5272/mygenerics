package pers.hanchao.generics.wildcard;

/**
 * Created by 韩超 on 2018/2/11.
 */
public class Programmer extends Worker {
    /** 开发语言 **/
    private String lang;

    @Override
    public String toString() {
        return "Programmer{" +
                "lang='" + lang + '\'' +
                "} " + super.toString();
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Programmer(String job) {
        super(job);
    }

    public Programmer(Integer id, String name, String job) {
        super(id, name, job);
    }

    public Programmer(String job, String lang) {
        super(job);
        this.lang = lang;
    }

    public Programmer(Integer id, String name, String job, String lang) {
        super(id, name, job);
        this.lang = lang;
    }
}
