package main;

public class ObserverTradeAgency1 implements Observer {
    @Override
    public void update() {
        System.out.println("La bolsa ha subido");
    }
}
