package cn.com.nightfield.patterns.behavioral.chainOfResponsibility;

/**
 * @author: nightfield
 * @create: 2020/6/5
 **/
public abstract class Interviewer {
    private Major major;
    protected Interviewer nextInterviewer;

    public Interviewer(Major major) {
        this.major = major;
    }

    public Major getMajor() {
        return major;
    }

    // form the handler chain
    public void setNext(Interviewer nextInterviewer) {
        this.nextInterviewer = nextInterviewer;
    };
    public abstract boolean interview(Interviewee interviewee);
}