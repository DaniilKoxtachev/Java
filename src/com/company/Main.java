package com.company;

import com.company.collections.Students;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Students students = new Students("daniil","koxtachev",21);
        Students students2 = new Students("anton","amtonov",31);
        Students students3 = new Students("vasilii","utkin",23);
        Collection collection = new ArrayList();
        List list = new ArrayList();
        Set set = new HashSet();//выводит не повторяющиеся элементы
        Queue queue = new PriorityQueue();
        Map map = new HashMap();


        collection.add(students);
////////////////////////////////////////////////////////////////////////////////////////////////
        list.add(students2);
        list.add(students3);
        list.set(1,students);//изменение 2-го элемента
        for ( int i = 0 ; i< list.size(); i++){
            System.out.println(list.get(i).toString());
        }
/////////////////////////////////////////////////////////////////////////////////////////////////
        queue.offer(students);
        queue.offer(students2);
        queue.offer(students3);
            for ( int q = 0 ; q< queue.size(); q++){
                System.out.println(queue.peek().toString());
            }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //старый вариант
        /*Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }*/
        // Работает на основе итератора
        for (Object o : collection){
            System.out.println(o.toString());
        }
    }
}