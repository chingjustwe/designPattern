package cn.com.nightfield.patterns.creational.prototype;

/**
 * <code>Object.clone()</code> is only a shallow copy, it will copy primitive data and object reference
 * for the new object. Sometimes, it would lead to some hidden problems, because changing the reference
 * in original object would affect the copied ones.
 *
 * @author: nightfield
 * @create: 2020/3/19
 **/
public class ShallowCopyTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Job job = new Job("engineer", "Java coding");
        ShallowPerson rocky = new ShallowPerson(181, 65, job);
        ShallowPerson rockyCopy = rocky.clone();

        System.out.format("Height of copied person: %s\n", rockyCopy.getHeight());
        System.out.format("Weight of copied person: %s\n", rockyCopy.getWeight());
        System.out.format("Job of copied person: %s\n", rockyCopy.getJob());

        rocky.setHeight(160);
        rocky.setWeight(80);
        rocky.getJob().setJobDescription("Python coding");

        System.out.format("Height of copied person: %s\n", rockyCopy.getHeight());
        System.out.format("Weight of copied person: %s\n", rockyCopy.getWeight());
        System.out.format("Job of copied person: %s\n", rockyCopy.getJob());
    }
}
