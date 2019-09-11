package tp_garage_option;

public class GPS implements Option {

	@Override
	public Double getPrix() {
		return 113.5;
	}
	
	@Override
	public String toString() {
		return "GPS ( "+getPrix()+" €) ";
	}

}
