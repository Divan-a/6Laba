package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, Human> book;

    public PhoneBook(){
        book = new HashMap<>();
    }

    public void setPhoneNumber(String number, Human human){
        book.put(number, human);
    }

    public void delPhoneNumber(String number){
        book.remove(number);
    }

    public ArrayList<String> getNumbersByHuman(Human human){
        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry<String, Human> entry: book.entrySet()){
            if(human.equals(entry.getValue())){
                list.add(entry.getKey());
            }
        }
        return list;
    }

    public Human getHumanByNumber(String number){
        if(!book.containsKey(number)){
            throw new IllegalArgumentException("Номера телефона нет в книге");
        }
        else{
            return book.get(number);
        }
    }

    public Map<String, Human> bookWithFirstLetter(Character character){
        Map<String, Human> newBook = new HashMap<>();

        for(Map.Entry<String, Human> entry: book.entrySet()){
            if(entry.getValue().getSurname().charAt(0) == character){
                newBook.put(entry.getKey(), entry.getValue());
            }
        }

        return newBook;
    }
}
