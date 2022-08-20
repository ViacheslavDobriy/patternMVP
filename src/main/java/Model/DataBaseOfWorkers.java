package Model;

import java.util.ArrayList;
import java.util.List;

public class DataBaseOfWorkers {
    public static final List<Person> dataBaseWorkers = new ArrayList<>();

    private DataBaseOfWorkers() {
    }

    public List<Person> getDataBaseWorkers(){
        return dataBaseWorkers;
    }
}
