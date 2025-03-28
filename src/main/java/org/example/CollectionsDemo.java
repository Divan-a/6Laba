package org.example;

import java.util.*;


public class CollectionsDemo {

    public static int countStrWithFirstElem(List<String> list, char elem) {
        int count = 0;
        for (String string : list) {
            if (string.charAt(0) == elem) {
                count++;
            }
        }
        return count;
    }

    public static List<Human> copyWithoutHuman(List<Human> list, Human human) {
        List<Human> copiedList = new ArrayList<>(list);
        while (copiedList.contains(human)) {
            copiedList.remove(human);
        }
        return copiedList;
    }

    public static List<Set<Integer>> setWithoutIntersection(List<Set<Integer>> list, Set<Integer> hashSet) {
        List<Set<Integer>> newArrayList = new ArrayList<>();
        // disjoint -- проверка пересечения
        for (Set<Integer> integers : list) {
            boolean flag = true;
            for (Integer item : integers) {
                if (hashSet.contains(item)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                newArrayList.add(integers);
            }
        }
        return newArrayList;
    }

    public static List<Human> funcNum6(Set<Human> hashSet, boolean ind) { //вопросы конечно имеются
        Comparator<Human> comparator;
        if (!ind) {
            comparator = Comparator.comparing((Human::getFullName)).thenComparing(Human::getAge).thenComparing(Human::hashCode).reversed();
        } else {
            comparator = Comparator.comparing(Human::getFullName).thenComparing(Human::getAge).thenComparing(Human::hashCode);
        }

        TreeSet<Human> set = new TreeSet<>(comparator);

        set.addAll(hashSet);

        return new ArrayList<>(set);
    }


    public static Set<Human> humansWithIndInSet(Map<Integer, Human> hashMap, Set<Integer> hashSet) {

        Set<Human> set = new HashSet<>();
        for (Map.Entry<Integer, Human> entry : hashMap.entrySet()) { // перебираем элементы отображения
            if (hashSet.contains(entry.getKey())) { //если множество содержит ключ, то добавляем значение в новое множество
                set.add(entry.getValue());
            }
        }

        return set;
    }

    public static List<Integer> listOfHumansUnder18Years(Map<Integer, Human> hashMap) {
        List<Integer> list = new ArrayList<>();

        for (Map.Entry<Integer, Human> entry : hashMap.entrySet()) {
            if (entry.getValue().getAge() < 18) {
                list.add(entry.getKey());
            }
        }
        return list;
    }

    public static Map<Integer, Integer> creationNewMapKeyAge(Map<Integer, Human> hashMap) {
        Map<Integer, Integer> newHashMap = new HashMap<>();

        for (Map.Entry<Integer, Human> entry : hashMap.entrySet()) {
            newHashMap.put(entry.getKey(), entry.getValue().getAge());
        }

        return newHashMap;
    }

    public static Map<Integer, List<Human>> creationMapWithListSimilarAge(Set<Human> set){
        Map<Integer, List<Human>> map = new HashMap<>();

        for(Human human: set){
            if(!map.containsKey(human.getAge())){
                List<Human> list = new ArrayList<>();
                list.add(human);
                map.put(human.getAge(), list);
            }
            else{
                map.get(human.getAge()).add(human);
            }
        }
        return map;
    }

    public static Map<Character, List<Human>> creationForMap(List<Human> list){
        Map<Character, List<Human>> map = new HashMap<>();

        for(int i = 0; i < list.size(); i++){
            Human human = list.get(i);
            if(!map.containsKey(human.getSurname().charAt(0))) {
                List<Human> newlist = new ArrayList<>();
                list.add(human);
                map.put(human.getSurname().charAt(0), newlist);
            }
            else{
                if(!map.get(human.getSurname().charAt(0)).contains(human)){
                    map.get(human.getSurname().charAt(0)).add(human);
                }
            }
        }
        return map;
    }

    public static Map<Integer, Map<Character, List<Human>>> creationMapByMapILoveMap(Set<Human> set) {
        List<Human> listBasic = CollectionsDemo.funcNum6(set, false);

        Map<Integer, Map<Character, List<Human>>> newMap = new HashMap<>();

        Map<Integer, List<Human>> map = new HashMap<>();

        for(Human human: listBasic){ //часть из 10 (тут у нас есть отображение из возраста в список, нужно списиок в отображение буква список)
            if(!map.containsKey(human.getAge())){
                List<Human> list = new ArrayList<>();
                for(Human hum : listBasic){
                    if(hum.getAge() == human.getAge()){
                        list.add(hum);
                    }
                }
                map.put(human.getAge(), list);
            }
            else{
                if(!map.get(human.getAge()).contains(human)){
                    map.get(human.getAge()).add(human);
                }
            }
        }

        for(Map.Entry<Integer, List<Human>> entry : map.entrySet()){
            if(!newMap.containsKey(entry.getKey())){
                newMap.put(entry.getKey(), CollectionsDemo.creationForMap(entry.getValue()));
            }
        }
        return newMap;
    }


}
