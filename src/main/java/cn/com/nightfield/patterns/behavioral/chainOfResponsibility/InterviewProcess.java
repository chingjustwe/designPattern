package cn.com.nightfield.patterns.behavioral.chainOfResponsibility;

/**
 * InterviewProcess class maintains the interview chain
 * @author: nightfield
 * @create: 2020/6/5
 **/
public class InterviewProcess {
    Interviewer firstInterviewer;

    public InterviewProcess() {
        Interviewer javaInterviewer = new JavaInterviewer();
        Interviewer pythonInterviewer = new PythonInterviewer();
        Interviewer hrInterviewer = new HRInterviewer();
        javaInterviewer.setNext(pythonInterviewer);
        pythonInterviewer.setNext(hrInterviewer);
        this.firstInterviewer = javaInterviewer;
    }

    public boolean process(Interviewee interviewee) {
        return firstInterviewer.interview(interviewee);
    }
}