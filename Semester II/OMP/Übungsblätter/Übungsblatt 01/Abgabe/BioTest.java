public class BioTest {

    public static void main(String[] args) {

        Pflanze[] pflanzen = new Pflanze[2];
        pflanzen[0] = new Pflanze("Gras", "grün");
        pflanzen[1] = new Pflanze("Beeren", "rot");

        Tier[] tiere = new Tier[4];
        tiere[0] = new Tier("Zebra");
        tiere[0].addPflanzenNahrung(pflanzen[0]);
        tiere[1] = new Tier("Löwe");
        tiere[1].addTierNahrung(tiere[0]);
        tiere[2] = new Tier("Fisch");
        tiere[3] = new Tier("Bär");
        tiere[3].addTierNahrung(tiere[2]);
        tiere[3].addPflanzenNahrung(pflanzen[1]);

        for (Tier tier : tiere) {
            if (tier.isPflanzenfresser()) {
                System.out.println(tier.getName() + " ist Pflanzenfresser.");
            } else if (tier.isFleischfresser()) {
                System.out.println(tier.getName() + " ist Fleischfresser.");
            } else if (tier.isAllesfresser()) {
                System.out.println(tier.getName() + " ist Allesfresser.");
            }
        }
    }
}

class Pflanze {
    // Attribute
    private String name;
    private String description;

    // Methoden
    public Pflanze(String name) {
        this.name = name;
    }

    public Pflanze(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

class Tier {
    // Attribute
    private String name;
    private Pflanze[] pflanzenNahrung = new Pflanze[10];
    private Tier[] tierNahrung = new Tier[10];

    public Tier(String name) {
        this.name = name;
    }

    public void addPflanzenNahrung(Pflanze pflanze) {
        for (int i = 0; i < 10; i++) {
            if(this.pflanzenNahrung[i] == null) {
                this.pflanzenNahrung[i] = pflanze;
                break;
            }
        }
    }

    public void addTierNahrung(Tier tier) {
        for (int i = 0; i < 10; i++) {
            if(this.tierNahrung[i] == null) {
                this.tierNahrung[i] = tier;
                break;
            }
        }
    }

    public boolean isPflanzenfresser() {
        return isstPflanze() && !isstTier();
    }

    public boolean isFleischfresser() {
        return !isstPflanze() && isstTier();
    }

    public boolean isAllesfresser() {
        return isstPflanze() && isstTier();
    }

    // Hilfsmethoden
    private boolean isstPflanze() {
        if(pflanzenNahrung[0] != null) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isstTier() {
        if(tierNahrung[0] != null) {
            return true;
        } else {
            return false;
        }
    }

    // get und set Methoden
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPflanzenNahrung(Pflanze[] pflanzenNahrung) {
        this.pflanzenNahrung = pflanzenNahrung;
    }

    public Pflanze[] getPflanzenNahrung() {
        return pflanzenNahrung;
    }

    public void setTierNahrung(Tier[] tierNahrung) {
        this.tierNahrung = tierNahrung;
    }

    public Tier[] getTierNahrung() {
        return tierNahrung;
    }
}