package ro.ase.asc.state;

public class ComandaInCursDeLivrare implements State{

    public ComandaInCursDeLivrare() {
    }

    @Override
    public void updateState(ComandaMancare comanda) {
        comanda.setState(new Livrat());
        System.out.println("Actiunea a trecut din comanda in curs de livrare in livrat");
    }
}
