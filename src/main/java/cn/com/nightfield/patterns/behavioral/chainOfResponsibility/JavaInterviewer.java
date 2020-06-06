package cn.com.nightfield.patterns.behavioral.chainOfResponsibility;

import java.util.Random;

/**
 * Handles interviewees that majors in Java. if not, just bypass to next interviewer
 * @author: nightfield
 * @create: 2020/6/5
 **/
public class JavaInterviewer extends Interviewer {

    public JavaInterviewer() {
        super(Major.JAVA);
    }

    @Override
    public boolean interview(Interviewee interviewee) {
        if (interviewee.getMajor().equals(this.getMajor())) {
            // if major matches, then do the interview
            System.out.println(interviewee.getName() + " is on java interview.");
            if (new Random().nextInt(10) <= 8) {// simulate interview result
                System.out.println(interviewee.getName() + " passed java interview!");
            }
            else {
                System.out.println(interviewee.getName() + " failed on java interview!");
                return false;
            }
        }
        else {
            // if major not match, bypass to next interviewer
            System.out.println("Java interviewer will not do interview on " + interviewee.getName());
        }
        if (nextInterviewer != null) {
            // pass to next interviewer
            return nextInterviewer.interview(interviewee);
        }
        return true;
    }
}