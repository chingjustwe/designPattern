package cn.com.nightfield.patterns.behavioral.chainOfResponsibility;

/**
 * Interviewee, who will go through Interview process by {@link Interviewer}
 * @author: nightfield
 * @create: 2020/6/1
 **/
public class Interviewee {
    private String name;
    private Major major;

    public Interviewee(String name, Major major) {
        this.name = name;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public Major getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "Interviewee " + name + ", majors in " + major;
    }
}