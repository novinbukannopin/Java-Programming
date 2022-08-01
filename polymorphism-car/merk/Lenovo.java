package merk;

import data.Laptop;

/**
 * Lenovo
 */
public class Lenovo extends Laptop{
    
    @Override
    public String getBrand() {
        // TODO Auto-generated method stub
        return "Lenovo";
    }

    @Override
    public int getSizeRam() {
        return 4;
    }
    
}