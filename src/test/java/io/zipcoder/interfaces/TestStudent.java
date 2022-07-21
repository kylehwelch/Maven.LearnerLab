package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student student = new Student("fweeerp", 5);

        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student student = new Student("fweeerp", 5);

        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        Student student = new Student("meeble", 1);

        student.learn(52);
        double actual = student.getTotalStudyTime();
        double expected = 52;
        Assert.assertEquals(expected, actual, 0.0);
    }

}
