package n1exercici1;

public class AgenciaBorsa1 implements Observer{
	private String nom;
	
	public AgenciaBorsa1(String nom) {
		this.nom = nom;
	}
	@Override
	public void actualitzar(double valor) {
		System.out.println(nom+": L'index SP500 ara te un valor de "+valor+"$");
		
	}

}
