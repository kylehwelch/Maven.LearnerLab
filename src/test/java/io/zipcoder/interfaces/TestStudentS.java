package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestStudentS {

    @Test
    public void testAddedStudents(){
        Student student1 = new Student("harley", 1);
        Student student2 = new Student("biff", 2);
        Student student3 = new Student("frrrgeet", 3);
        Assert.assertTrue(Students.getInstance().contains(student3));
    }

    @Test
    public void testStudentsSize(){
        Student student1 = new Student("harley", 1);
        Student student2 = new Student("biff", 2);
        Student student3 = new Student("brrrgeet", 3);
        Assert.assertEquals(3 ,Students.getInstance().getSize());
    }

    @Test
    public void testStudentsArray() {
        Student student1 = new Student("harley", 1);
        Student student2 = new Student("biff", 2);
        Student student3 = new Student("brrrgeet", 3);
        System.out.println(Students.getInstance().personList.get(2).getName());


    }

}
