package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    Student student = new Student("Дмитрий", "Иванов", "Алексеевич", 19, "ФЦТК");

    @Test
    public void getFacultetTest(){
        assertEquals("ФЦТК", student.getFacultet());
    }
}
