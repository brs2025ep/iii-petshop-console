package util;

import models.Machine;

public class MachineManager {

    private Machine machine = new Machine();

    public MachineManager() {
        this.machine = new Machine();
    }

    public Machine getMachine() {
        return this.machine;
    }
}