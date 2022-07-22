package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor("fweeerp", 5);
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor("fweeerp", 5);
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        Student student = new Student("jobob", 4);
        Instructor inst = new Instructor("meeeep", 6);
        inst.teach(student, 456);
        double actual = student.getTotalStudyTime();
        double exp = 456;
        Assert.assertEquals(exp, actual, 0.0);
    }

    @Test
    public void testLecture(){
        Student student1 = new Student("jobob", 4);
        Student student2 = new Student("jobobb", 5);
        Instructor inst = new Instructor("meeeep", 6);
        Learner[] learners = new Learner[2];
        learners[0] = student1;
        learners[1] = student2;
        inst.lecture(learners, 4);
        Assert.assertEquals(2, student1.getTotalStudyTime(), 0.0);
    }





}
