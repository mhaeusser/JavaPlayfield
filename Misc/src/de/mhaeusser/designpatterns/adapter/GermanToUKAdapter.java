package de.mhaeusser.designpatterns.adapter;

public class GermanToUKAdapter implements UKPlug {

    private GermanPlug germanPlug;

    public GermanToUKAdapter(GermanPlug germanPlug) {
        this.germanPlug = germanPlug;
    }

    @Override
    public void provideElectricity() {
        germanPlug.giveElectricity();
    }
}
