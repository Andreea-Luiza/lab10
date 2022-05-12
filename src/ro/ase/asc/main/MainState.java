package ro.ase.asc.main;

import ro.ase.asc.state.ComandaMancare;
import ro.ase.asc.state.ComandaPlasata;

public class MainState {
    public static void main(String[] args) {

        ComandaMancare comandaMancare=new ComandaMancare(1);
        comandaMancare.setState(new ComandaPlasata());
        comandaMancare.nextState();
        comandaMancare.nextState();
        comandaMancare.nextState();
        comandaMancare.nextState();
        comandaMancare.nextState();
        comandaMancare.nextState();
        comandaMancare.nextState();
    }
}
