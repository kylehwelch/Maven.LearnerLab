package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructorS {
    @Test
    public void testAddedInstructors(){
        Instructor inst1 = new Instructor("harley", 1);
        Instructor inst2 = new Instructor("biff", 2);
        Instructor inst3 = new Instructor("frrrgeet", 3);
        Assert.assertTrue(Instructors.getInstance().contains(inst3));
    }

    @Test
    public void testInstructorsSize(){
        Instructor inst1 = new Instructor("harley", 1);
        Instructor inst2 = new Instructor("biff", 2);
        Instructor inst3 = new Instructor("brrrgeet", 3);
        Student student2 = new Student("biff", 2);
        Assert.assertEquals(3, Instructors.getInstance().getSize());
    }



}
