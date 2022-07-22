package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestZCW {

    @Test
    public void testStudentsSize(){
        Students stu = Students.getInstance();
        stu.removeAll();
        Student s1 = new Student("glarp", 01);
        Student s2 = new Student("phillip", 02);
        Student s3 = new Student("henry", 03);
        Student s4 = new Student("Fitru", 04);
        Student s5 = new Student("beep", 05);

        Assert.assertEquals(5, Students.getInstance().getSize());
    }

    @Test
    public void testHostLecture(){
        ZCW zcw = new ZCW();
        Students stu = Students.getInstance();
        stu.removeAll();
        Student s1 = new Student("glarp", 01);
        Student s2 = new Student("phillip", 02);
        Student s3 = new Student("henry", 03);
        Student s4 = new Student("Fitru", 04);
        Student s5 = new Student("beep", 05);

        zcw.hostLecture(Educator.DOLIO, 15);

        Assert.assertEquals(s1.getTotalStudyTime(), 3, 0.0);
    }

    @Test
    public void testHostLectureID(){
        ZCW zcw = new ZCW();
        Students stu = Students.getInstance();
        stu.removeAll();
        Student s1 = new Student("glarp", 01);
        Student s2 = new Student("phillip", 02);
        Student s3 = new Student("henry", 03);
        Student s4 = new Student("Fitru", 04);
        Student s5 = new Student("beep", 05);

        zcw.hostLecture(Educator.KAREN, 15);

        Assert.assertEquals(s1.getTotalStudyTime(), 3, 0.0);
    }
}
