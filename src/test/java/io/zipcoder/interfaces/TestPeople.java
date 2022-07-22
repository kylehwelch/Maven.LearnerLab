package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd(){
        People pp = new People();
        Student student1 = new Student("cleeooorrrrrr", 1);
        pp.add(student1);
        Assert.assertEquals(pp.count(), 1);
    }
    @Test
    public void testRemove(){
        People pp = new People();
        Student student1 = new Student("cleeooorrrrrr", 1);
        Student student2 = new Student("krrrraaauuulll", 2);
        pp.add(student1);
        pp.add(student2);
        pp.remove(2);
        Assert.assertEquals(pp.count(), 1);
    }

    @Test
    public void testFindById(){
        People pp = new People();
        Student student1 = new Student("cleeooorrrrrr", 1);
        Student student2 = new Student("krrrraaauuulll", 2);
        pp.add(student1);
        pp.add(student2);
        Person act = pp.findById(2);
        Assert.assertEquals(student2, act);
    }


}
