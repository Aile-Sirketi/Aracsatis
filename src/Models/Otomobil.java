package Models;

public abstract class Otomobil extends Arac {
    private boolean klima;
    private boolean ustuAcilma;

    public Otomobil(String modelAdi, String motorHacmi, boolean klima, boolean ustuAciliyormu) {
        super(modelAdi, motorHacmi, 180);
        this.klima=klima;
        this.ustuAcilma=ustuAciliyormu;
    }

    public boolean isUstuAcilma() {
        return ustuAcilma;
    }

    public boolean isKlima() {
        return klima;
    }

    @Override
    public void gazaBas() {
        // +20

    }

    @Override
    public void frenYap() {
        // -20

    }

}
