package de.mhaeusser.designpatterns.adapter;

public class GermanElectricalSocket {

    public void plugIn(GermanPlugConnector plug) {
        plug.giveElectricity();
    }
}
