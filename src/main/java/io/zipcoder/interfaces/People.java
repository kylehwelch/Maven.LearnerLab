package io.zipcoder.interfaces;

import java.util.*;

public class People<E extends Person> implements Iterable<E> {

    List<E> personList = new ArrayList<E>();


    public void add(E person){
        personList.add(person);
    }

    public E findById(long id){
        for (int i = 0 ; i < personList.size() ; i++){
            if (personList.get(i).getId() == id) return personList.get(i);
        }
        return null;
    }

    public boolean contains(E person) {
        return (personList.contains(person));
    }

    public void remove(E person) {
        personList.remove(person);
    }

    public void remove (long id){
        personList.remove(findById(id));
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public Object[] toArray(){
        return personList.toArray();
    }

    public Iterator<E> iterator() {
        return personList.iterator();
    }
}
