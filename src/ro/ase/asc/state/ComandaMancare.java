package ro.ase.asc.state;

public class ComandaMancare {
    private State state;
    private int nrComanda;


    public ComandaMancare(State state, int nrComanda) {
        this.state = state;
        this.nrComanda = nrComanda;
    }

    public ComandaMancare(int nrComanda) {
        this.nrComanda = nrComanda;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void nextState(){
        this.state.updateState(this);
        System.out.println("");
    }

    public int getNrComanda() {
        return nrComanda;
    }

    public void setNrComanda(int nrComanda) {
        this.nrComanda = nrComanda;
    }
}
