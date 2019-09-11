package tp_garage_option;

public class VitreElectrique implements Option {

	@Override
	public Double getPrix() {
		return 212.35;
	}
	
	@Override
	public String toString() {
		return "VitreElectrique ( "+getPrix()+" € )";
	}

}
