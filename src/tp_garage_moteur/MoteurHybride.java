package tp_garage_moteur;

public class MoteurHybride extends Moteur {

	public MoteurHybride(String cylindre, Double prix) {
		super(cylindre, prix);
		type=TypeMoteur.HYBRIDE;
	}

}
