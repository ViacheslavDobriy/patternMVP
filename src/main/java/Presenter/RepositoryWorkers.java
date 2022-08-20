package Presenter;

import Model.DataBaseOfWorkers;
import Model.Person;
import Model.Worker;
import View.UI;

import java.util.Scanner;

public class RepositoryWorkers implements UI {

    @Override
    public void helloUser() {
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Insert digit:");
        System.out.println("1 - show data base");
        System.out.println("2 - add worker");
        System.out.println("0 - exit");
        int choice = newScanner.nextInt();
        while (choice!=0) {

            switch (choice) {
                case 1 -> showDataBase();
                case 2 -> addWorker(new Worker("Director", 4));
            }
            System.out.println("Insert digit:");
            System.out.println("1 - show data base");
            System.out.println("2 - add worker");
            System.out.println("0 - exit");
            choice = newScanner.nextInt();
        }
    }

    @Override
    public void showDataBase() {
        for (Person worker: DataBaseOfWorkers.dataBaseWorkers) {
            System.out.println(worker.toString());
        }
    }

    @Override
    public void addWorker(Worker worker) {
        DataBaseOfWorkers.dataBaseWorkers.add(worker);
    }
}
