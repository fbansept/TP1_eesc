package edu.fbansept.td1.models;

public class Bus extends Vehicule{

    private int nombreDePassager;

    public Bus(int nombreDeRoue, String marque, int nombreDePassager) {
        super(nombreDeRoue, marque);
        this.nombreDePassager = nombreDePassager;
    }

    public int coutMaintenanceRoue() {
        return nombreDeRoue * 500;
    }

    public int getNombreDePassager() {
        return nombreDePassager;
    }

    public void setNombreDePassager(int nombreDePassager) {
        this.nombreDePassager = nombreDePassager;
    }

    @Override
    public String info() {
        return "C'est un bus avec " + nombreDePassager + " passagers";
    }
}
