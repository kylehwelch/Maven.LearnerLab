package io.zipcoder.interfaces;

import java.util.*;

public final class ZCW {

    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();
//    public Student[] students = Students.getInstance().getArray();
//    public Instructor[] instructors = Instructors.getInstance().getArray();

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Instructor fart = instructors.findById(id);
        fart.lecture(students.getArray(), numberOfHours);
    }

    public HashMap<Student, Double> getStudyMap(){
        HashMap<Student, Double> meep = new HashMap<Student, Double>();
        for (Student student : students) {
            meep.put(student, student.getTotalStudyTime());
        }
        return meep;
    }

}
