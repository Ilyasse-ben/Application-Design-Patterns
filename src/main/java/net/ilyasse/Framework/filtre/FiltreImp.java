package net.ilyasse.Framework.filtre;

public class FiltreImp implements Filtre{
    @Override
    public int[] filter(int[] data) {
        System.out.println("1 er implémentation de filtre");
        return new int[0];
    }
}
