package tp_garage_option;

public class Climatisation implements Option {

	@Override
	public Double getPrix() {
		return 347.3;
	}
	
	@Override
	public String toString() {
		return "Climatisation ( "+getPrix()+" € )";
	}

}
