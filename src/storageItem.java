public class storageItem {
    private String description;
    private String code;
    private float uPrice; // unit price
    private int quantity;

    public storageItem(String line) {
        String[] pieces = line.split("[|]");
        this.code = pieces[0];
        this.description = pieces[1];
        this.uPrice = Float.parseFloat(pieces[2]);
        this.quantity = Integer.parseInt(pieces[3]);
    }

    public String getDescription() {
        return description;
    }

    public String getCode() {
        return code;
    }

    public float getuPrice() {
        return uPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "storageItem [description=" + description + ", code=" + code + ", uPrice=" + uPrice + ", quantity="
                + quantity + "]";
    }

}
