package n3exercici1;

public class Article {
	private String nom;
	private double preuEuros;
	
	
	public Article(String nom, double preuEuros) {
		this.nom = nom;
		this.preuEuros = preuEuros;
	}


	public String getNom() {
		return nom;
	}


	public double getPreuEuros() {
		return preuEuros;
	}

}
