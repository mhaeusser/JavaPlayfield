package de.mhaeusser.designpatterns.facade;

class ComputerFacade {

    private final CPU processor;
    private final Memory ram;
    private final HardDrive hd;

    long BOOT_ADDRESS = 1024L;
    long  BOOT_SECTOR = 8L;
    int SECTOR_SIZE = 4096;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}
