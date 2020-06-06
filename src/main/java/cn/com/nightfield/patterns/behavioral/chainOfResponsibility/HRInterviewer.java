package cn.com.nightfield.patterns.behavioral.chainOfResponsibility;

import java.util.Random;

/**
 * Handles all interviewees
 * @author: nightfield
 * @create: 2020/6/5
 **/
public class HRInterviewer extends Interviewer {
    public HRInterviewer() {
        super(null);// no major for HR
    }

    @Override
    public boolean interview(Interviewee interviewee) {
        System.out.println(interviewee.getName() + " is on HR interview.");
        if (new Random().nextInt(10) <= 9) {// simulate interview result
            System.out.println(interviewee.getName() + " passed hr interview!");
        }
        else {
            System.out.println(interviewee.getName() + " failed on hr interview!");
            return false;
        }
        if (nextInterviewer != null) {
            // pass to next interviewer
            return nextInterviewer.interview(interviewee);
        }
        return true;
    }
}