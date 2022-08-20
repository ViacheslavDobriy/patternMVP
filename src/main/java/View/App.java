package View;

import Model.DataBaseOfWorkers;
import Presenter.ConversationWithUser;

/**
 * Описываю класс, который будет иметь точку входа
 */
public class App{
    public static void main(String[] args) {
        ConversationWithUser workersDB = new ConversationWithUser(DataBaseOfWorkers.dataBaseWorkers);
    }
}
