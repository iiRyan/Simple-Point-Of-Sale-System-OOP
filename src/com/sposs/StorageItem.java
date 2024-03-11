package com.sposs;

public class StorageItem extends Item {

    /*
     * This Constructor responsible To Build the storageItems As the form
     * they saved in the txt file.
     */
    public StorageItem(String line) {
        String[] pieces = line.split("[|]");
        this.setCode(pieces[0]);
        this.setDescription(pieces[1]);
        this.setUPrice(Float.parseFloat(pieces[2]));
        this.setQuantity(Integer.parseInt(pieces[3]));
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
