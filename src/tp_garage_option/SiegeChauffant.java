package tp_garage_option;

public class SiegeChauffant implements Option {

	@Override
	public Double getPrix() {
		return 562.9;
	}	
	
	@Override
	public String toString() {
		return "SiegeChauffant ( "+getPrix()+" €) ";
	}

}
