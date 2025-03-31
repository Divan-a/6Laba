package org.example;

import stars_classes.Data;
import stars_classes.DataDemo;
import stars_classes.Group;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        Group group = new Group(1, 12, 14,16);
        Group group2 = new Group(2, 22, 24,26);

        Group[] arr = new Group[]{group2, group};

        Data data = new Data("name", arr);


        List<Integer> list = DataDemo.getAll(data);

        for(int i: list){
            System.out.println(i);
        }

    }
}