package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ListDemo {
    public static Set<Human> maxAge(List<Human> list){//добавить поиск однофамильцев
        Set<Human> set = new HashSet<>();
        int age = 0;
        for (Human human : list) {
            if (human.getAge() > age) {
                age = human.getAge();
            }
        }
        for (Human human : list) {
            if (human.getAge() == age) {
                set.add(human);
            }
        }
        return set;
    }

}
