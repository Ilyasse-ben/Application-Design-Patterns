package net.ilyasse;

import net.ilyasse.Framework.Image;
import net.ilyasse.Framework.filtre.Filtre;
import net.ilyasse.Framework.filtre.FiltreImp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Image image=new Image();
        Filtre filtre=new FiltreImp();
        image.setData(filtre.filter(image.getData()));
    }
}