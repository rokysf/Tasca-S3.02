package n2exercici1;

public class BotigaSabates {

	public static void main(String[] args) {
		
		Callback targeta = new TargetaCredit();
		Callback paypal = new Paypal();
		Callback compte = new CompteBancari();
		
		PasarelaPagament pasarela = new PasarelaPagament();
		
		pasarela.activarPasarela(targeta);
		pasarela.activarPasarela(paypal);
		pasarela.activarPasarela(compte);
 
	}

}
