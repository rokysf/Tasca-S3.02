package n1exercici1;

public class Principal {

	public static void main(String[] args) {
		AgentBorsa agentBorsa = new AgentBorsa();
		AgenciaBorsa1 agenciaBorsa1 = new AgenciaBorsa1("Broker BCN");
		AgenciaBorsa2 agenciaBorsa2 = new AgenciaBorsa2("Borsa negocis");
		AgenciaBorsa3 agenciaBorsa3 = new AgenciaBorsa3("Trading Institucional");
						
		agentBorsa.afegirObserver(agenciaBorsa1);
		agentBorsa.afegirObserver(agenciaBorsa2);
		agentBorsa.afegirObserver(agenciaBorsa3);
		
		agentBorsa.setValor(300);
		
		agentBorsa.esborrarObserver(agenciaBorsa3);
		System.out.println("---------------------------------");
		
		agentBorsa.setValor(150);
		
		
		
		
		

	}

}
