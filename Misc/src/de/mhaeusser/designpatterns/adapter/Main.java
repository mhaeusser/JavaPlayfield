package de.mhaeusser.designpatterns.adapter;

import javax.xml.transform.sax.SAXSource;

/** from https://www.vogella.com/tutorials/DesignPatternAdapter/article.html */
class Main {

    public static void main(String[] args) {
        GermanPlug germanPlug = new GermanPlugImpl();
        UKSocket ukSocket = new UKSocket();
        UKPlug ukAdapter = new GermanToUKAdapter(germanPlug);
        System.out.println("Plugging adapter into UK socket.");
        ukSocket.plugIn(ukAdapter);
    }
}
