package stars_classes;

import java.util.ArrayList;
import java.util.List;

public class DataDemo {
    public static List<Integer> getAll(Data data){
        List<Integer> list = new ArrayList<>();
        for(Group group: data.getMassive()){
            for(Integer integer: group.getMassive()){
                list.add(integer);
            }
        }

        return list;
    }
}
