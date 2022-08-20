package Presenter;

import Model.DataBaseOfWorkers;
import Model.Person;
import Model.Worker;
import View.UI;

import java.util.List;
import java.util.Scanner;

public class ConversationWithUser implements UI {
    DataBaseOfWorkers workersDB;

    public ConversationWithUser(List<Person> workersDB) {
//        this.workersDB = workersDB;
    }

    @Override
    public void helloUser() {
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Insert digit");
        switch (newScanner.nextInt()){
            case 1:
                showDataBase();
                break;
        }
    }

    @Override
    public void showDataBase() {
        for (Person worker: DataBaseOfWorkers.dataBaseWorkers) {
            System.out.println(worker.toString());
        }
    }

    @Override
    public void addWorker() {
        DataBaseOfWorkers.dataBaseWorkers.add(new Worker("Director", 1));
    }
}
