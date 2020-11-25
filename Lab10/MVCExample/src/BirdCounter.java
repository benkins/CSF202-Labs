import java.util.Observable;

/**
 * The model. This records the current count of bird sightings.
 *  Each bird count can only be incremented and read.
 *  All counts can be simultaneously reset.
 *  
 *  This is an observable object. It will notify all observers when it is changed.
 */
public class BirdCounter extends Observable {
	private int bluetits;
	private int pigeons;
	private int robins;
	private int sparrows;
	private int ducks;

	public BirdCounter() {
		resetCounts();
	}
	
	public void resetCounts() {
		bluetits = 0;
		robins = 0;
		pigeons = 0;
		sparrows = 0;
		ducks = 0;
		setChanged();
		notifyObservers();
	}
	
	public void incBluetits() {
		bluetits++;
		setChanged();
		notifyObservers();
	}
	
	public void incPigeons() {
		pigeons++;
		setChanged();
		notifyObservers();
	}
	
	public void incRobins() {
		robins++;
		setChanged();
		notifyObservers();
	}
	
	public void incSparrows() {
		sparrows++;
		setChanged();
		notifyObservers();
	}

	public void incDucks() {
		ducks++;
		setChanged();
		notifyObservers();
	}
	
	public int getBluetits() {
		return bluetits;
	}

	public int getPigeons() {
		return pigeons;
	}
	
	public int getRobins() {
		return robins;
	}
	
	public int getSparrows() {
		return sparrows;
	}
	public int getDucks() {
		return ducks;
	}
}
