package grb.simpleos.world;

import grb.simpleos.machine.Computer;
import grb.simpleos.machine.Display;
import grb.simpleos.machine.ReadOnlyMemory;

public class Main {
    public static void main(String[] args) {
        Computer bobsPc = new Computer();
        
        Display d = bobsPc.getMonitor();
        ReadOnlyMemory rom = bobsPc.getRom();
        
        d.dump(rom.read());
        d.dump(rom.read());
        d.dump(rom.read());
    }
}
