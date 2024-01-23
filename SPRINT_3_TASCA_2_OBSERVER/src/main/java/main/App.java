package main;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ObservableTradeAgent agent1 = new ObservableTradeAgent();

        agent1.addObserver(new ObserverTradeAgency1());
        agent1.addObserver(new ObserverTradeAgency2());
        agent1.addObserver(new ObserverTradeAgency3());
        agent1.notifyObservers();
    }
}
