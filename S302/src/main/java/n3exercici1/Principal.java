package n3exercici1;

public class Principal {

	public static void main(String[] args) {
		Article article1 = new Article("Pilota", 25);
		Article article2 = new Article("Samarreta", 19);
		Article article3 = new Article("Botes futbol", 44);
		
		ConversorMoneda conversor = new ConversorMoneda();
		PreusArticle preusArticle = new PreusArticle(article1, conversor);
		PreusArticle preusArticle2 = new PreusArticle(article2, conversor);
		PreusArticle preusArticle3 = new PreusArticle(article3, conversor);
			
		preusArticle.getConversorMoneda().convertir(article1);
		preusArticle2.getConversorMoneda().convertir(article2);
		preusArticle3.getConversorMoneda().convertir(article3);

	}

}
