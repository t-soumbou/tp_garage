package tp_garage_option;

public class BarreDeToit implements Option {
	
	@Override
	public Double getPrix() {
		return 29.9;
	}
	
	@Override
	public String toString() {
		return "Barre De Toit ( "+getPrix() +"€ ) ";
	}

}
