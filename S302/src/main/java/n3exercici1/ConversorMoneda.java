package n3exercici1;

public class ConversorMoneda {
	private static double USD = 1.07;
	private static double LIBRA = 0.86;
	private static double YEN = 157.89;
	
	public void convertir(Article article) {
		
		System.out.println("El preu del article "+article.getNom()+" es de:");
		System.out.println(article.getPreuEuros()+"€");
		System.out.println(article.getPreuEuros() * USD+"$");
		System.out.println(article.getPreuEuros() * LIBRA+"£");
		System.out.println(article.getPreuEuros() * YEN+"¥");
		
	}

}
