package main;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        EjemploObservableTradeAgent observable = new EjemploObservableTradeAgent();
        observable.addObserver(new ObserverTradeAgency1());
        observable.addObserver(new ObserverTradeAgency2());
        
        observable.notifyObservers();
    }
}
