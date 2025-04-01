package stars_classes;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DataIterator implements Iterator<Group> {

    Integer current = 0;
    private final Data data;

    public DataIterator(Data data){
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        return current != data.getLength();
    }

    @Override
    public Group next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        current++;
        return data.getGroupByInd(current-1);

    }
}
