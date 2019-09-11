package tp_garage_moteur;


public class Moteur {
	
	protected TypeMoteur type;
	private String cylindre;
	private Double prix;
	
	public Moteur(String cylindre, Double prix) {
		this.cylindre =cylindre;
		this.prix = prix;
	}
	

	/**
	 * @return the type
	 */
	public TypeMoteur getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(TypeMoteur type) {
		this.type = type;
	}


	/**
	 * @return the cylindre
	 */
	public String getCylindre() {
		return cylindre;
	}


	/**
	 * @param cylindre the cylindre to set
	 */
	public void setCylindre(String cylindre) {
		this.cylindre = cylindre;
	}


	/**
	 * @return the prix
	 */
	public Double getPrix() {
		return prix;
	}


	/**
	 * @param prix the prix to set
	 */
	public void setPrix(Double prix) {
		this.prix = prix;
	}


	@Override
	public String toString() {
		return "Moteur" + type + " " + cylindre + " ( " + prix + "€ ) ";
	}

}
