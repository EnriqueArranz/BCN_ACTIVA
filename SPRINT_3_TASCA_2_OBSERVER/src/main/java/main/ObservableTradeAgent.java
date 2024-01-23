package main;

import java.util.HashSet;
import java.util.Set;

public class ObservableTradeAgent implements Observable {

    Set<Observer>observerSet = new HashSet<>();
    @Override
    public void addObserver(Observer o) {
        observerSet.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        observerSet.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observerSet) {
            observer.update();
        }
    }
}
