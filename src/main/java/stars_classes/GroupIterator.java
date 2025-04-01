package stars_classes;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GroupIterator implements Iterator<Integer> {

    private Integer current = 0;
    private final Group group;

    public GroupIterator(Group group){
        this.group = group;
    }

    @Override
    public boolean hasNext() {
        return current != group.getLength();
    }

    @Override
    public Integer next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        current++;
        return group.getElemByInd(current-1);

    }
}
