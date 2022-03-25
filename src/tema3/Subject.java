package tema3;

import tema3.enums.PizzaType;

public class Subject {
    public Observer observer;
    private static Subject subject;

    public void attachObserver(Observer observer){
        this.observer = observer;
    }

    public void notifyObserver(PizzaType type, String name){
        observer.receiveUpdate(type, name);
    }
}
