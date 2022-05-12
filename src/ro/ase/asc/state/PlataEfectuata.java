package ro.ase.asc.state;

public class PlataEfectuata implements State{

    public PlataEfectuata() {
    }

    @Override
    public void updateState(ComandaMancare comanda) {
        comanda.setState(new MancareInPreparare());
        System.out.println("Actiunea a trecut din mancare in preparare in plata efectuata");
    }
}
