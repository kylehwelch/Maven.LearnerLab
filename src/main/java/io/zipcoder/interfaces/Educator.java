package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    KRIS("kris", 1), DOLIO("dolio", 2), KAREN("karen", 3);

    final Instructor instructor;
    double timeWorked;

    Educator(String name, long id) {
        this.instructor = new Instructor(name, id);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        this.timeWorked += numberOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numHours = numberOfHours / learners.length;
        for (Learner learner : learners) {
            learner.learn(numHours);
        }
        this.timeWorked += numberOfHours;
    }
}
