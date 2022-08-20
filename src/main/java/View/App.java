package View;

import Model.Worker;
import Presenter.RepositoryWorkers;

/**
 * Описываю класс, который будет иметь точку входа
 */
public class App{
    public static void main(String[] args) {
        RepositoryWorkers workersDB = new RepositoryWorkers();
        workersDB.addWorker(new Worker("Director", 5));
        workersDB.addWorker(new Worker("Teacher", 6));
        workersDB.helloUser();
    }
}
