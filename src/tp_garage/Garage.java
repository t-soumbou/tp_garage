package tp_garage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import tp_garage_voiture.Vehicule;

public class Garage {

	private List<Vehicule> voitures;
	private static String FILENAME = "GarageStore.txt";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_RESET = "\u001B[0m";

	public Garage() {
		this.voitures = new ArrayList<Vehicule>();
	}

	public void addVoiture(Vehicule voit)  {
		this.voitures.add(voit);
		saveVoiture(voit);
	}

	public static void saveVoiture(Vehicule voit)  {
		try (FileWriter fw = new FileWriter(FILENAME, true); BufferedWriter writer = new BufferedWriter(fw)) {
			writer.write(voit.toString());
			writer.write("\n");
		} catch (IOException e) {
			System.out.println("unable to write voiture in file");
		}
	}

	public String getAllCarStored() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
		StringBuilder builder = new StringBuilder();
		goToLastLine(reader,builder);
		String currentLine = reader.readLine();
		if(currentLine == null) {
			System.out.println(ANSI_RED + " Aucune Valeur Sauvegardé " +ANSI_RESET  );
		}
		while (currentLine != null) {
			builder.append(currentLine);
			builder.append("\n");
			currentLine = reader.readLine();
		}
		reader.close();
		return builder.toString();
	}
	
	private void goToLastLine(BufferedReader reader, StringBuilder builder) {
		for (int i = 0; i < 4; i++) {
			try {
				builder.append(reader.readLine());
				builder.append("\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public String toString() {
		try {
			return getAllCarStored();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}

}
