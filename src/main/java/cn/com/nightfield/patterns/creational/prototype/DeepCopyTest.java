package cn.com.nightfield.patterns.creational.prototype;

/**
 * Serialize & Deserialize can make a deep copy of an object, including internal reference data.
 *
 * @author: nightfield
 * @create: 2020/3/19
 **/
public class DeepCopyTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Job job = new Job("engineer", "Java coding");
        DeepPerson rocky = new DeepPerson(181, 65, job);
        DeepPerson rockyCopy = rocky.clone();

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
