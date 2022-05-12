package ro.ase.asc.strategy;

public class Algoritm1 implements ModCriptare{
    @Override
    public void cripteaza(String s) {
        System.out.println("A1#"+s+"#A1");
    }
}