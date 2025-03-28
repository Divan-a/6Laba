package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListDemoTest {
    Student student1 = new Student("Дмитрий", "Иванов", "Алексеевич", 19, "ФЦТК");
    Student student2 = new Student("Другой", "Студентов", "Генадьевич", 29, "ФЦТК");
    Student student3 = new Student("Третий", "Студентов", "Неизвестнович", 52, "ХимФак");

    Human human1 = new Human("Дмитрий", "Иванов", "Алексеевич", 52);
    Human human2 = new Human("Другой", "Студентов", "Генадьевич", 29);
    Human human3 = new Human("Третий", "Студентов", "Неизвестнович", 52);

    ArrayList<Human> list = new ArrayList<>();
    @Test
    public void maxAgeTest(){
        ArrayList<Human> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(human1);
        list.add(human2);
        list.add(human3);

        HashSet<Human> set = new HashSet<>();
        set.add(student3);
        set.add(human3);
        set.add(human1);
        Set<Human> result = ListDemo.maxAge(list);
        assertEquals(set, result);
        for(Human human: result){
            System.out.println(human.toString());
        }
    }
}
