package cn.com.nightfield.patterns.behavioral.chainOfResponsibility;

/**
 * Chain of responsibility pattern is used when a request(interview) from client is passed to
 * a chain of objects({@link Interviewer}), the object in the chain({@link InterviewProcess})
 * will decide themselves be processing the request and whether the request is required to be
 * sent to the next object in who will the chain or not. it helped loose coupling for the
 * invoker and executor.
 * @author: nightfield
 * @create: 2020/6/5
 **/
public class Test {
    public static void main(String[] args) throws InterruptedException {
        InterviewProcess interviewProcess = new InterviewProcess();
        Interviewee mario = new Interviewee("Mario", Major.JAVA);
        Interviewee link = new Interviewee("Link", Major.PYTHON);

        System.out.println(mario + " is taking interview...");
        boolean result = interviewProcess.process(mario);
        System.out.println("Interview result of " + mario.getName() + ": " + (result ? "pass" : "fail"));
        System.out.println("==================================");
        System.out.println(link + " is taking interview...");
        result = interviewProcess.process(link);
        System.out.println("Interview result of " + mario.getName() + ": " + (result ? "pass" : "fail"));
    }
}
