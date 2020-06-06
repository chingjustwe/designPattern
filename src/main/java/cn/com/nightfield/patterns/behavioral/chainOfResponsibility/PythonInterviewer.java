package cn.com.nightfield.patterns.behavioral.chainOfResponsibility;

import java.util.Random;

/**
 * Handles interviewees that majors in Python. if not, just bypass to next interviewer
 * @author: nightfield
 * @create: 2020/6/5
 **/
public class PythonInterviewer extends Interviewer {

    public PythonInterviewer() {
        super(Major.PYTHON);
    }

    @Override
    public boolean interview(Interviewee interviewee) {
        if (interviewee.getMajor().equals(this.getMajor())) {
            // if major matches, then do the interview
            System.out.println(interviewee.getName() + " is on python interview.");
            if (new Random().nextInt(10) <= 8) {// simulate interview result
                System.out.println(interviewee.getName() + " passed python interview!");
            }
            else {
                System.out.println(interviewee.getName() + " failed on python interview!");
                return false;
            }
        }
        else {
            // if major not match, bypass to next interviewer
            System.out.println("Python interviewer will not do interview on " + interviewee.getName());
        }
        if (nextInterviewer != null) {
            // pass to next interviewer
            return nextInterviewer.interview(interviewee);
        }
        return true;
    }
}