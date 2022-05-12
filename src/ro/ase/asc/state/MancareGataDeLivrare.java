package ro.ase.asc.state;

public class MancareGataDeLivrare implements State{

    public MancareGataDeLivrare() {
    }

    @Override
    public void updateState(ComandaMancare comanda) {
        comanda.setState(new ComandaInCursDeLivrare());
        System.out.println("Actiunea a trecut din mancare gata de livrare in comanda gata de livrare");
    }
}
