package ro.ase.asc.state;

public class MancareInPreparare implements State{

    public MancareInPreparare() {
    }

    @Override
    public void updateState(ComandaMancare comanda) {
        comanda.setState(new MancareGataDeLivrare());
        System.out.println("Actiunea a trecut din comanda in preparare in mancare gata de livrare");
    }
}
