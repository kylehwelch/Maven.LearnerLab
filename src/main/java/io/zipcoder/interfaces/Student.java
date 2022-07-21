package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    double totalStudyTime;

    public Student(String name, long id) {
        super(name, id);
    }

    public void learn(double numberOfHours) {
        double totalStudyTime;



    }

    public double getTotalStudyTime() {
        return 0;
    }
}
