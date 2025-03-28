package org.example;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionsDemoTest {
    Student student1 = new Student("Дмитрий", "Иванов", "Алексеевич", 19, "ФЦТК");//1
    Student student2 = new Student("Другой", "Студентов", "Генадьевич", 29, "ФЦТК");//4
    Student student3 = new Student("Третий", "Студентов", "Неизвестнович", 52, "ХимФак");//5

    Human human1 = new Human("Дмитрий", "Иванов", "Алексеевич", 52);//2
    Human human2 = new Human("Другой", "Студентов", "Генадьевич", 12);//3
    Human human3 = new Human("Третий", "Студентов", "Неизвестнович", 52);//6

    @Test
    public void countStrWithFirstElemTest() {
        ArrayList<String> list = new ArrayList<>();
        list.add("QWE");
        list.add("Qwe");
        list.add("Ramm");
        list.add("Stein");
        list.add("Queue");
        assertEquals(3, CollectionsDemo.countStrWithFirstElem(list, 'Q'));
    }

    @Test
    public void copyWithoutHumanTest() {
        ArrayList<Human> list1 = new ArrayList<>();
        ArrayList<Human> list2 = new ArrayList<>();

        list1.add(human1);
        list1.add(human2);
        list1.add(human3);
        list2.add(human1);
        list2.add(human2);
        assertEquals(list2, CollectionsDemo.copyWithoutHuman(list1, human3));
    }

    @Test
    public void setWithoutIntersection() {
        Set<Integer> basicSet = new HashSet<>();
        basicSet.add(1);
        basicSet.add(2);
        basicSet.add(3);

        Set<Integer> nonKebobSet = new HashSet<>();
        nonKebobSet.add(1);
        nonKebobSet.add(4);
        nonKebobSet.add(5);


        Set<Integer> nonKebobSet2 = new HashSet<>();
        nonKebobSet2.add(4);
        nonKebobSet2.add(5);
        nonKebobSet2.add(6);

        Set<Integer> nonKebobSet3 = new HashSet<>();
        nonKebobSet3.add(4);
        nonKebobSet3.add(5);
        nonKebobSet3.add(3);

        List<Set<Integer>> list1 = new ArrayList<>();
        list1.add(nonKebobSet2);

        List<Set<Integer>> list2 = new ArrayList<>();
        list2.add(nonKebobSet);
        list2.add(nonKebobSet2);
        list2.add(nonKebobSet3);

        assertEquals(list1, CollectionsDemo.setWithoutIntersection(list2, basicSet));
    }

    @Test
    public void funcNum6Test(){
        Set<Human> set1 = new HashSet<>();
        List<Human> list = new ArrayList<>();

        set1.add(human1);
        set1.add(human3);
        set1.add(student2);
        set1.add(human2);
        set1.add(student1);
        set1.add(student3);


        list.add(student1);
        list.add(human1);
        list.add(human2);
        list.add(student2);
        list.add(student3);
        list.add(human3);

        List<Human> testList = CollectionsDemo.funcNum6(set1, true);
        assertEquals(list, testList);
    }

    @Test
    public void humansWithIndInSetTest(){
        Map<Integer, Human> map = new HashMap<>();
        map.put(1, student1);
        map.put(2, student2);
        map.put(3, student3);
        map.put(4, human1);
        map.put(5, human2);
        map.put(6, human3);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(5);

        Set<Human> set2 = new HashSet<>();
        set2.add(student1);
        set2.add(human2);

        assertEquals(set2, CollectionsDemo.humansWithIndInSet(map, set));
    }

    @Test
    public void listOfHumansUnder18YearsTest(){
        Map<Integer, Human> map = new HashMap<>();
        map.put(1, student1);
        map.put(2, student2);
        map.put(3, student3);
        map.put(4, human1);
        map.put(5, human2);
        map.put(6, human3);

        List<Integer> list = new ArrayList<>();
        list.add(5);
        assertEquals(list, CollectionsDemo.listOfHumansUnder18Years(map));
    }

    @Test
    public void creationNewMapKeyAgeTest(){
        Map<Integer, Human> map = new HashMap<>();
        map.put(1, student1);
        map.put(2, student2);
        map.put(3, student3);
        map.put(4, human1);
        map.put(5, human2);
        map.put(6, human3);

        Map<Integer, Integer> map2 = new HashMap<>();
        map2.put(1, 19);
        map2.put(2, 29);
        map2.put(3, 52);
        map2.put(4, 52);
        map2.put(5, 12);
        map2.put(6, 52);

        assertEquals(map2, CollectionsDemo.creationNewMapKeyAge(map));
    }

    @Test
    public void creationMapWithListSimilarAgeTest(){
        Set<Human> set = new HashSet<>();
        set.add(human1);
        set.add(human2);
        set.add(human3);
        set.add(student1);
        set.add(student2);
        set.add(student3);

        List<Human> list1 = new ArrayList<>();
        list1.add(human2);

        List<Human> list2 = new ArrayList<>();
        list2.add(student1);

        List<Human> list3 = new ArrayList<>();
        list3.add(student2);

        List<Human> list4 = new ArrayList<>();
        list4.add(student3);
        list4.add(human3);
        list4.add(human1);

        Map<Integer, List<Human>> map = new HashMap<>();
        map.put(12, list1);
        map.put(19, list2);
        map.put(29, list3);
        map.put(52, list4);

        assertEquals(map, CollectionsDemo.creationMapWithListSimilarAge(set));
    }


    @Test
    public void creationMapByMapILoveMapTest(){
        Set<Human> set = new HashSet<>();
        set.add(human1);//И
        set.add(human2);//С
        set.add(human3);
        set.add(student1);//И
        set.add(student2);
        set.add(student3);

        List<Human> list1 = new ArrayList<>();
        list1.add(human2);

        List<Human> list2 = new ArrayList<>();
        list2.add(student1);

        List<Human> list3 = new ArrayList<>();
        list3.add(student2);

        List<Human> list4 = new ArrayList<>();
        list4.add(student3);
        list4.add(human3);

        List<Human> list5 = new ArrayList<>();
        list5.add(human1);

        Map<Character, List<Human>> map12 = new HashMap<>();
        map12.put('С', list1);

        Map<Character, List<Human>> map19 = new HashMap<>();
        map19.put('И', list2);

        Map<Character, List<Human>> map29 = new HashMap<>();
        map29.put('С', list3);

        Map<Character, List<Human>> map52 = new HashMap<>();
        map52.put('И', list5);
        map52.put('С', list4);

        Map<Integer, Map<Character, List<Human>>> map = new HashMap<>();
        map.put(12, map12);
        map.put(19, map19);
        map.put(29,map29);
        map.put(52, map52);

        assertEquals(map, CollectionsDemo.creationMapByMapILoveMap(set));
    }



}
