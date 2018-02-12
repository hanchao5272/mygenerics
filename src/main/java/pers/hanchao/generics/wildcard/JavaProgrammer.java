package pers.hanchao.generics.wildcard;

/**
 * Java软件攻城狮
 * Created by 韩超 on 2018/2/12.
 */
public class JavaProgrammer extends Programmer {
    /** 岗位 **/
    private String post;

    public JavaProgrammer(String job) {
        super(job);
    }

    public JavaProgrammer(Integer id, String name, String job) {
        super(id, name, job);
    }

    public JavaProgrammer(String job, String lang) {
        super(job, lang);
    }

    public JavaProgrammer(Integer id, String name, String job, String lang) {
        super(id, name, job, lang);
    }

    public JavaProgrammer(String job, String lang, String post) {
        super(job, lang);
        this.post = post;
    }

    public JavaProgrammer(Integer id, String name, String job, String lang, String post) {
        super(id, name, job, lang);
        this.post = post;
    }

    @Override
    public String toString() {
        return "JavaProgrammer{" +
                "post='" + post + '\'' +
                '}';
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
