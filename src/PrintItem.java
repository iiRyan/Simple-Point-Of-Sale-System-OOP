import java.util.List;

public class PrintItem {
    private int length;

    public void printHeader() {
        String header = String.format("| %2s | %-40s | %6s | %3s |", "ID", "Description", "Price", "Qty");
        this.length = header.length();
        System.out.println(printSeparation());
        System.out.println(header);
        System.out.println(printSeparation());
    }

    public void printBody(List<storageItem> itemsList) {
        String body = "";
        for (storageItem item : itemsList) {
            body = String.format("| %2s | %-40s | %6.2f | %3d |", item.getCode(), item.getDescription(),
                    item.getuPrice(), item.getQuantity());
            System.out.println(body);
        }
        System.out.println(printSeparation());
    }

    public void printBody(storageItem item) {
        String body = "";

        body = String.format("| %2s | %-40s | %6.2f | %3d |", item.getCode(), item.getDescription(),
                item.getuPrice(), item.getQuantity());
        System.out.println(body);

        System.out.println(printSeparation());
    }

    public String printSeparation() {
        String header = "";
        for (int i = 0; i < length; i++) {
            header += "-";
        }
        return header;
    }

}
