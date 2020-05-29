package com.company;

public class Main {

    public static void main(String[] args) {
	    Tanz [] taenze = new Tanz[6];
	    taenze[0] = new StandardTanz("Walzer", "3/4");
        taenze[1] = new StandardTanz("Tango", "4/4");
        taenze[2] = new StandardTanz("Quickstep", "4/4");
        taenze[3] = new LateinTanz("Jive", "4/4");
        taenze[4] = new LateinTanz("Rumba", "4/4");
        taenze[5] = new LateinTanz("ChaChaCha", "4/4");

        Figur [] figuren = new Figur[7];
        figuren[0] = new Grundfigur("Grundschritt");
        figuren[1] = new Grundfigur("Rechtsdrehung");
        figuren[2] = new Grundfigur("Kreiseldrehung");
        figuren[3] = new Grundfigur("Promenade");
        figuren[4] = new Grundfigur("Chassé");
        figuren[5] = new Grundfigur("Fan");
        figuren[6] = new Sequenz("Wischer", new Figur[]{figuren[3], figuren[4]});

        ((StandardTanz) taenze[0]).
    }
}

abstract class Tanz {
    protected String name;
    protected String takt;
    protected Figur[] figuren;

    // Getter und Setter
    public String getName() {
        return name;
    }

    public String getTakt() {
        return takt;
    }

    // Getter und Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setTakt(String takt) {
        this.takt = takt;
    }
}

class StandardTanz extends Tanz {
    public StandardTanz() {

    }

    public StandardTanz(String name, String takt) {
        this.name = name;
        this.takt = takt;
    }
}

class LateinTanz extends Tanz {
    public LateinTanz() {

    }

    public LateinTanz(String name, String takt) {

    }
}

abstract class Figur {
    protected String name;

    // Getter und Setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Sequenz extends Figur {
    private Figur[] figuren;

    public Sequenz() {

    }

    public Sequenz(String name) {
        this.name = name;
    }
    public Sequenz(String name, Figur [] figuren) {
        this.name = name;
        this.figuren = figuren;
    }

    // Getter und Setter
    public Figur[] getFiguren() {
        return figuren;
    }

    public void setFiguren(Figur[] figuren) {
        this.figuren = figuren;
    }
}

class Grundfigur extends Figur {
    private String beschreibung;

    public Grundfigur() {

    }

    public Grundfigur(String name) {
        this.name = name;
    }

    // Getter und Setter
    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }
}