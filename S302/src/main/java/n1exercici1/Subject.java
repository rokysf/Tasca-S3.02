package n1exercici1;

public interface Subject {
	void afegirObserver(Observer observer);
	void esborrarObserver(Observer observer);
	void notificarObserver();

}
