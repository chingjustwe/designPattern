package cn.com.nightfield.patterns.creational.prototype;

import java.io.Serializable;

/**
 * @author: nightfield
 * @create: 2020/3/24
 **/
public class Job implements Serializable {
    private String jobName;
    private String jobDescription;

    Job(String jobName, String jobDescription) {
        this.jobName = jobName;
        this.jobDescription = jobDescription;
    }

    public void setJobDescription(String description) {
        this.jobDescription = description;
    }

    public String getJobName() {
        return jobName;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobName='" + jobName + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                '}';
    }
}