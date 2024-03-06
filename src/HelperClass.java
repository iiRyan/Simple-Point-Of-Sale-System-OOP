public class HelperClass {
    private int length;

    public String printHeader() {

        String header = String.format("| %2s | %-40s | %6s | %3s |", "ID", "Description", "Price", "Q");
        return header;
    }

    public String printBody(storageItem item) {
        String body = String.format("| %2s | %-40s | %6.3f | %3d |", item.getCode(), item.getDescription(),
                item.getuPrice(), item.getQuantity());
        length = body.length();
        return body;
    }

    public String printHeaderSeparation() {
        String header = "";
        for (int i = 0; i <= this.length - 1; i++) {
            header += "-";
        }
        return header;
    }

}
