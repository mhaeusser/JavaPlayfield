package de.mhaeusser.designpatterns.adapter;

public class UKElectricalSocket {

    public void plugIn(UKPlugConnector plug) {
        plug.provideElectricity();
    }
}
