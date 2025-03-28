package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    PhoneBook book = new PhoneBook();

    Student student1 = new Student("Дмитрий", "Иванов", "Алексеевич", 19, "ФЦТК");
    Student student2 = new Student("Другой", "Студентов", "Генадьевич", 29, "ФЦТК");
    Student student3 = new Student("Третий", "Студентов", "Неизвестнович", 52, "ХимФак");

    Human human1 = new Human("Дмитрий", "Иванов", "Алексеевич", 52);
    Human human2 = new Human("Другой", "Студентов", "Генадьевич", 29);
    Human human3 = new Human("Третий", "Студентов", "Неизвестнович", 52);

    @Test
    public void getNumbersByHumanTest(){
        book.setPhoneNumber("1", student1);
        book.setPhoneNumber("2", student1);
        book.setPhoneNumber("3", student3);
        book.setPhoneNumber("4", human1);
        book.setPhoneNumber("5", student1);
        book.setPhoneNumber("6", human3);

        ArrayList<String> list = new ArrayList<>();
        list.add("1"); list.add("2");list.add("5");
        assertEquals(list, book.getNumbersByHuman(student1));
    }

    @Test
    public void bookWithFirstLetter(){
        book.setPhoneNumber("1", student1);
        book.setPhoneNumber("2", student2);
        book.setPhoneNumber("3", student3);
        book.setPhoneNumber("4", human1);
        book.setPhoneNumber("5", human2);
        book.setPhoneNumber("6", human3);

        Map<String, Human> map = new HashMap<>();
        map.put("1", student1);map.put("4", human1);

        assertEquals(map, book.bookWithFirstLetter('И'));
    }


}
