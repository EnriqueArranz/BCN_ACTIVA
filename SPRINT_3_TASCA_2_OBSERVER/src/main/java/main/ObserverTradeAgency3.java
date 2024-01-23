package main;

public class ObserverTradeAgency3 implements Observer {
    @Override
    public void update() {
        System.out.println("La bolsa ha bajado");
    }
}
