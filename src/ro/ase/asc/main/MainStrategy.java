package ro.ase.asc.main;

import ro.ase.asc.strategy.*;

public class MainStrategy {
    public static void main(String[] args) {

        MotorDeCriptare motorDeCriptare=new MotorDeCriptare();
        motorDeCriptare.setMod(new Algoritm1());
        motorDeCriptare.obtineMesajCriptat("text");

        motorDeCriptare.setMod(new Algoritm2());
        motorDeCriptare.obtineMesajCriptat("text");

        motorDeCriptare.setMod(new Algoritm3());
        motorDeCriptare.obtineMesajCriptat("text");

    }
}
