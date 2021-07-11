package com.company;

import com.company.collections.Students;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Students students = new Students("daniil","koxtachev",21);
        Students students2 = new Students("anton","amtonov",31);
        Students students3 = new Students("vasilii","utkin",23);
        Collection collection = new ArrayList();
        collection.add(students);
        collection.add(students2);
        collection.add(students3);
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
