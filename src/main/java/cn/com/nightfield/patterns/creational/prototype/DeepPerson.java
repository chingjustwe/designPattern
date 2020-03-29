package cn.com.nightfield.patterns.creational.prototype;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

/**
 * @author: nightfield
 * @create: 2020/3/24
 **/
public class DeepPerson implements Serializable {
    private double height;// cm
    private double weight;// kg
    private Job job;

    DeepPerson(double height, double weight, Job job) {
        this.height = height;
        this.weight = weight;
        this.job = job;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    // deep copy version1
    @Override
    protected DeepPerson clone() {
        Job clonedJob = new Job(job.getJobName(), job.getJobDescription());
        DeepPerson person = new DeepPerson(height, weight, clonedJob);
        return person;
    }

    // deep copy version2, serialize and deserialize
    protected DeepPerson serializeClone() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            return (DeepPerson) ois.readObject();
        } catch (IOException e) {
            return null;
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    // deep copy version3, using Json
    protected DeepPerson jsonClone() {
        Gson gson = new GsonBuilder().create();
        String jsonPerson = gson.toJson(this);
        DeepPerson newPerson = gson.fromJson(jsonPerson, this.getClass());
        return newPerson;
    }
}