package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor>{

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){};

    public static Instructors getInstance(){
        return INSTANCE;
    }

    public int getSize(){
        return personList.size();
    }


    public Instructor[] getArray(){
        return personList.toArray(new Instructor[0]);
    }


}
