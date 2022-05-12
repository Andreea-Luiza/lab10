package ro.ase.asc.strategy;

public class MotorDeCriptare {
    ModCriptare mod;

    public void setMod(ModCriptare mod) {
        this.mod = mod;
    }

    public void obtineMesajCriptat(String text){
         mod.cripteaza(text);
    }
}
