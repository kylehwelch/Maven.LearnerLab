package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    public Instructor(String name, long id) {
        super(name, id);
        Instructors.getInstance().add(this);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numHours = numberOfHours / learners.length;
        for (Learner learner : learners) {
            learner.learn(numHours);
        }

    }
}
