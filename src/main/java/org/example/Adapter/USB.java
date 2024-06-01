package org.example.Adapter;

public class USB implements USBInterface {
    @Override
    public void read() {
        System.out.println("Reading from USB");
    }
}
