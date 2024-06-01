package org.example.Adapter;

public class Computer {

    public void connect(USBInterface usbInterface) {
        System.out.println(usbInterface.getClass() + " was connected to computer");
        usbInterface.read();
    }

}
