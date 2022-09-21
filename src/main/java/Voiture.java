public class Voiture extends Vehicule{

    private int nombreDeChevaux;

    public Voiture(String marque, int nombreDeChevaux) {
        super(4, marque);
        this.nombreDeChevaux = nombreDeChevaux;
    }

    public int fraisKilometrique(int nombreDeKilometre) {
        return nombreDeChevaux * nombreDeKilometre * 34;
    }

    public int getNombreDeChevaux() {
        return nombreDeChevaux;
    }

    public void setNombreDeChevaux(int nombreDeChevaux) {
        this.nombreDeChevaux = nombreDeChevaux;
    }
}
