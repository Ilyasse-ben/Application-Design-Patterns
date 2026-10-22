package net.ilyasse.Framework.filtre;

public class Adabter implements Filtre{
    FiltreAdabter filtreAdabter=new FiltreAdabter();
    @Override
    public int[] filter(int[] data) {
        filtreAdabter.appliquerFiltre("name",data);
        return new int[0];
    }
}
