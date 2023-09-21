package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class AgentBorsa implements Subject{
	private double valor;
	private List<Observer> observers; 
	
	public AgentBorsa() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void afegirObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void esborrarObserver(Observer observer) {
		observers.remove(observer);
		
	}

	@Override
	public void notificarObserver() {
		for (Observer observer : observers) {
			observer.actualitzar(valor);
		}
	}

	public void setValor(double valor) {
		this.valor = valor;
		notificarObserver();
	}
}
