package stars_classes;

import java.util.*;

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
    @Override
    public Iterator<Integer> iterator(){
        return new GroupIterator();
    }

    public class GroupIterator implements Iterator<Integer>{

        Integer current = 0;

        @Override
        public boolean hasNext() {
            if(current == massive.length){
                return false;
            }
            return true;
        }

        @Override
        public Integer next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            current++;
            return massive[current-1];

        }
    }


}
