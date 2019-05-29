package de.mhaeusser.designpatterns.facade;

class HardDrive {

    public byte[] read(long lba, int size) {
        return new byte[20];
    }
}
