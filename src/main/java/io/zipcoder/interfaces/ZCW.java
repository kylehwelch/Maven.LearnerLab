package io.zipcoder.interfaces;

import java.util.*;

public final class ZCW {

    Person p;
    public Student[] students = Students.getInstance().getArray();
    public Instructor[] instructors = Instructors.getInstance().getArray();

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students, numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        People ppl = new People();
        Teacher teacher = (Teacher) ppl.findById(id);
        teacher.lecture(students, numberOfHours);
    }

    public HashMap<Student, Double> getStudyMap(){
        HashMap<Student, Double> meep = new HashMap<Student, Double>();
        for (Student student : students) {
            meep.put(student, student.getTotalStudyTime());
        }
        return meep;
    }

}
