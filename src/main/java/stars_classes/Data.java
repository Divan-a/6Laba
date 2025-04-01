package stars_classes;

import java.util.*;

public class Data implements Iterable{
    private String name;
    private Group[] massive;

    public Data(String name, Group ... array){
        this.name = name;
        massive = new Group[array.length];
        System.arraycopy(array, 0, massive, 0, array.length);
    }

    public String getName(){
        return name;
    }

    public Group getGroupByInd(int ind){
        return massive[ind];
    }

    public Group[] getMassive(){
        return massive;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMassive(Group ...array){
        Group[] newMassive = new Group[array.length];
        System.arraycopy(array, 0, newMassive, 0, array.length);
        this.massive = newMassive;
    }

    public void setGroupByInd(int ind, Group group){
        massive[ind] = group;
    }

    public int getLength(){
        return massive.length;
    }


    @Override
    public Iterator<Group> iterator(){
        return new DataIterator(new Data(name, massive));
    }


}
