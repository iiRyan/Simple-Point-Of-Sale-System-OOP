package com.sposs;

public class StorageItem extends Item {

    public StorageItem(String line) {
        String[] pieces = line.split("[|]");
        this.setCode(pieces[0]);
        this.setDescription(pieces[1]);
        this.setUPrice(Float.parseFloat(pieces[2]));
        this.setQuantity(Integer.parseInt(pieces[3]));
    }

    @Override
    public String toString() {
        return "StorageItem []";
    }

}
