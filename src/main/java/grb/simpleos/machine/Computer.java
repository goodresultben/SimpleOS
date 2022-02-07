package grb.simpleos.machine;

public class Computer {
	private Display monitor = new Display();
	private ReadOnlyMemory rom = new ReadOnlyMemory();
	
	public Display getMonitor() {
		return monitor;
	}
	
	public ReadOnlyMemory getRom() {
		return rom;
	}
	
	
}
