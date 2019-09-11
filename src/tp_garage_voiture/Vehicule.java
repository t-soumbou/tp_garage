package tp_garage_voiture;

import java.util.ArrayList;
import java.util.List;

import tp_garage.Marque;
import tp_garage_moteur.Moteur;
import tp_garage_option.Option;



public class Vehicule {
	
	private Double prix;
	protected String nom;
	private List<Option> options;
	protected Marque nomMarque;
	private Moteur moteur;
	
	public Vehicule() {
		this.options = new ArrayList<Option>();
		this.prix = 0.0;
	}
	
	public Double prixVehicule() {
		return totalOptionPrix() + moteur.getPrix();
	}
	
	public Double totalOptionPrix() {
		Double total = 0.0;
		for (Option option : options) {
			total = total + option.getPrix();
		}
		return total;
	}
	
	public void addOption(Option opt) {
		this.options.add(opt);
		this.prix = this.prix + opt.getPrix();
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

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the options
	 */
	public List<Option> getOptions() {
		return options;
	}

	/**
	 * @param options the options to set
	 */
	public void setOptions(List<Option> options) {
		this.options = options;
	}

	/**
	 * @return the nomMarque
	 */
	public Marque getNomMarque() {
		return nomMarque;
	}

	/**
	 * @param nomMarque the nomMarque to set
	 */
	public void setNomMarque(Marque nomMarque) {
		this.nomMarque = nomMarque;
	}

	/**
	 * @return the moteur
	 */
	public Moteur getMoteur() {
		return moteur;
	}

	/**
	 * @param moteur the moteur to set
	 */
	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
		this.prix = this.prix + moteur.getPrix();
	}


	@Override
	public String toString() {
		return "+ Voiture "  + nomMarque + " : " + nom +" " + moteur + "" + options + "d'une valeur total de "+ prix +"€";
	}
	
	

}
