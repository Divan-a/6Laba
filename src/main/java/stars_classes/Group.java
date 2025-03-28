package stars_classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Group implements Iterable<Integer> {
    private int indicator;
    private int[] massive;

    public Group(int id, int... array) {
        indicator = id;
        massive = new int[array.length];
        System.arraycopy(array, 0, massive, 0, array.length);
    }

    public int getIndicator() {
        return indicator;
    }

    public int[] getMassive() {
        return massive;
    }

    public int getElemByInd(int ind) {
        return massive[ind];
    }

    public int getLength() {
        return massive.length;
    }

    public void setIndicator(int ind) {
        this.indicator = ind;
    }

    public void setMassive(int[] massive) {
        this.massive = massive;
    }

    public void setElemInMassive(int ind, int value) {
        if (ind < massive.length) {
            massive[ind] = value;
        }
        throw new ArrayIndexOutOfBoundsException("Вышли за рамки массива");
    }

    //Сюда не смотрите, пожалуйста :))

    public Iterator<Integer> iterator(){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < massive.length; i++){
            list.add(massive[i]);
        }
        Iterator<Integer> iterator = list.iterator();
        return iterator;
    }
}
