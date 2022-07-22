package io.zipcoder.interfaces;

import java.util.*;

public final class Students extends People<Student> {

    private static final Students INSTANCE = new Students();

    private Students(){};

    public static Students getInstance(){
        return INSTANCE;
    }

    public int getSize(){
        return personList.size();
    }

    public Student[] getArray(){
        return personList.toArray(new Student[0]);
    }


    public Student[] toArray() {
        return getInstance().getArray();
    }
}
