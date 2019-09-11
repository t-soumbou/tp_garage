package tp_garage_moteur;

public class MoteurEssence extends Moteur {

	public MoteurEssence(String cylindre, Double prix) {
		super(cylindre, prix);
		type=TypeMoteur.ESSENCE;
	}

}
