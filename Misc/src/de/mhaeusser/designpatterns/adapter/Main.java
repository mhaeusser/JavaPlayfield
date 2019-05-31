package de.mhaeusser.designpatterns.adapter;

/** from https://www.vogella.com/tutorials/DesignPatternAdapter/article.html */
class Main {

    public static void main(String[] args) {
        GermanPlugConnector plugConnector = new GermanPlugConnectorImpl();
        UKElectricalSocket electricalSocket = new UKElectricalSocket();
        UKPlugConnector ukAdapter = new GermanToUKAdapter(plugConnector);
        electricalSocket.plugIn(ukAdapter);
    }
}
