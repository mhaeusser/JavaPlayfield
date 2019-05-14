package de.mhaeusser.java8.lambda2;

public class Person {

    private String vorname;
    private String nachname;
    private int alter;
    private String plz;
    private String wohnort;

    public Person(String vorname, String nachname, int alter, String plz, String wohnort) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.plz = plz;
        this.wohnort = wohnort;
    }

    public String getVorname() {
        return vorname;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public String getNachname() {
        return nachname;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public int getAlter() {
        return alter;
    }
    public void setAlter(int alter) {
        this.alter = alter;
    }
    public String getPlz() {
        return plz;
    }
    public void setPlz(String plz) {
        this.plz = plz;
    }
    public String getWohnort() {
        return wohnort;
    }
    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }

    @Override
    public String toString() {
        return "Person [nachname=" + nachname + ", vorname=" + vorname + ", alter=" + alter + ", plz=" + plz
                + ", wohnort=" + wohnort + "]";
    }
}
