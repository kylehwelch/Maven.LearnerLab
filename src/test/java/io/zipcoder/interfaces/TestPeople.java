package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd(){
        Students.getInstance().removeAll();
        Student student1 = new Student("cleeooorrrrrr", 1);
        Assert.assertEquals(Students.getInstance().count(), 1);
    }
    @Test
    public void testRemove(){
        Students.getInstance().removeAll();
        Student student1 = new Student("cleeooorrrrrr", 1);
        Student student2 = new Student("krrrraaauuulll", 2);
        Students.getInstance().remove(2);
        Assert.assertEquals(Students.getInstance().count(), 1);
    }

    @Test
    public void testFindById(){
        Students.getInstance().removeAll();
        Student student1 = new Student("cleeooorrrrrr", 1);
        Student student2 = new Student("krrrraaauuulll", 2);
        Person act = Students.getInstance().findById(2);
        Assert.assertEquals(student2, act);
    }


}
