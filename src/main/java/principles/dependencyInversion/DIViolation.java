package principles.dependencyInversion;

/**
 * BAD design!
 * class <b>Team</b> is highly coupled with class <b>JavaDeveloper</b> and <b>PythonDeveloper</b>,
 * when requirements changes, like: Java developer leave the team, or a new member <b>CPPDeveloper</b> joins
 * the team, we need to do a lot of changes for class <b>Team</b>
 *
 * @author: night field
 * @create: 2020/3/14
 **/
public class DIViolation {
    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper();
        PythonDeveloper pythonDeveloper = new PythonDeveloper();
        BadTeam team = new BadTeam(javaDeveloper, pythonDeveloper);
        team.teamWork();
    }
}

class JavaDeveloper {
    public void work() {
        System.out.format("Java developer is working.");
    }
}

class PythonDeveloper {
    public void work() {
        System.out.format("Python developer is working.");
    }
}

class BadTeam {
    JavaDeveloper javaDeveloper;
    PythonDeveloper pythonDeveloper;
    BadTeam(JavaDeveloper javaDeveloper, PythonDeveloper pythonDeveloper) {
        this.javaDeveloper = javaDeveloper;
        this.pythonDeveloper = pythonDeveloper;
    }
    public void teamWork() {
        javaDeveloper.work();
        pythonDeveloper.work();
    }
}