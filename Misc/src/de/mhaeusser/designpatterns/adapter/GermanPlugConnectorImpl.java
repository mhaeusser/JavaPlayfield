package de.mhaeusser.designpatterns.adapter;

public class GermanPlugConnectorImpl implements GermanPlugConnector {
    @Override
    public void giveElectricity() {
        System.out.println("GermanPlugConnector giving electricity.");
    }
}
