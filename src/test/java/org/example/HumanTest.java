package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanTest {
    Human human = new Human("Дмитрий", "Иванов", "Алексеевич", 19);

    @Test
    public void getNameTest(){
        assertEquals("Дмитрий", human.getName());
    }

    @Test
    public void getSurnameTest(){
        assertEquals("Иванов", human.getSurname());
    }
    @Test
    public void getPatronymicTest(){
        assertEquals("Алексеевич", human.getPatronymic());
    }
    @Test
    public void getAgeTest(){
        assertEquals(19, human.getAge());
    }

}
