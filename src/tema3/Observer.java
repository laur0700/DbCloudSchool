package tema3;

import tema3.enums.PizzaType;

public class Observer {
    Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
        this.subject.attachObserver(this);
    }

    public void receiveUpdate(PizzaType type, String name){
        System.out.println("New pizza " + type + " order! ----> from " + name);
    }
}
