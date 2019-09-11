package tp_garage_moteur;

public class MoteurDiesel extends Moteur {

	public MoteurDiesel(String cylindre, Double prix) {
		super(cylindre, prix);
		type=TypeMoteur.DIESEL;
	}

}
