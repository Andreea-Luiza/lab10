package ro.ase.asc.state;

public class Livrat implements State{

    public Livrat() {
    }

    @Override
    public void updateState(ComandaMancare comanda) {
        System.out.println("Actiunea a fost livrata");
    }
}
