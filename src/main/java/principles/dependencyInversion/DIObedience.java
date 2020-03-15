package principles.dependencyInversion;

import java.util.*;

/**
 * GOOD design!
 * class <b>Team</b> only depend on interface <b>Developer</b>, either Java developer leave the team,
 * or a new member <b>CPPDeveloper</b> joins, class <b>Team</b> do not need to change a single thing!
 *
 * @author: night field
 * @create: 2020/3/14
 **/
public class DIObedience {
    public static void main(String[] args) {
        Collection<Developer> developers = new HashSet<>();
        developers.add(new Javaer());
        developers.add(new Pythoner());
        GoodTeam team = new GoodTeam(developers);
        team.teamWork();
    }
}

interface Developer {
    void work();
}

class Javaer implements Developer {
    public void work() {
        System.out.println("Java developer is working.");
    }
}

class Pythoner implements Developer {
    public void work() {
        System.out.format("Python developer is working.");
    }
}

class GoodTeam {
    Collection<Developer> developers;
    GoodTeam(Collection<Developer> developers) {
        this.developers = developers;
    }
    public void teamWork() {
        developers.forEach(Developer::work);
    }
}