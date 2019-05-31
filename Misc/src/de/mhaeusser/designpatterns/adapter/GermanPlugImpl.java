package de.mhaeusser.designpatterns.adapter;

public class GermanPlugImpl implements GermanPlug {
    @Override
    public void giveElectricity() {
        System.out.println("GermanPlug giving electricity.");
    }
}
