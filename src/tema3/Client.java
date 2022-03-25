package tema3;

import tema3.enums.PizzaType;

public class Client {
    Subject subject;
    String name;

    public Client(String name){
        subject = new Subject();
        this.name = name;
    }

    public Subject getSubject(){
        return subject;
    }

    public String getName(){
        return name;
    }

    public void sendOrder(PizzaType type, String clientName){
        subject.notifyObserver(type, clientName);
    }
}
