package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;


public class TestEducator {

    @Test
    public void testImplementation(){
        Assert.assertTrue(Educator.DOLIO instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor kris = Educator.KRIS.instructor;
        Assert.assertTrue(kris instanceof Person);
    }

    @Test
    public void testTeach(){
        Student student = new Student("jobob", 4);
        Educator.KRIS.teach(student, 456);
        double actual = student.getTotalStudyTime();
        double exp = 456;
        Assert.assertEquals(exp, actual, 0.0);
    }

    @Test
    public void testLecture(){
        Student student1 = new Student("jobob", 4);
        Student student2 = new Student("jobobb", 5);
        Learner[] learners = new Learner[2];
        learners[0] = student1;
        learners[1] = student2;
        Educator.DOLIO.lecture(learners, 4);
        Assert.assertEquals(2, student1.getTotalStudyTime(), 0.0);
    }


}
