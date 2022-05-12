package ro.ase.asc.state;

public class ComandaPlasata implements State{

    public ComandaPlasata() {
    }

    @Override
    public void updateState(ComandaMancare comanda) {
        comanda.setState(new PlataEfectuata());
        System.out.println("Actiunea a intrat in comanda plasata");
    }
}
