package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor(){
        Person person = new Person("Peter", 2);
        String expected = "Peter";
        String actual = person.getName();
        Assert.assertEquals(expected, actual);

        long exp = 2;
        long act = person.getId();
        Assert.assertEquals(exp, act);
    }
    @Test
    public void testSetName(){
        Person person = new Person("Clifford", 1);
        person.setName("Vargo");
        String actual = person.getName();
        String expected = "Vargo";
        Assert.assertEquals(expected, actual);
    }


}
