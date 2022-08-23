package salesinvoicegenerator.model;

public class InvoiceLine {

    private String itemName;
    private double itemPrice;
    private int itemCount ;
    private double lineTotal;
    private InvoiceHeader invHeader ;

    public InvoiceLine(String itemName, double itemPrice, int itemCount, InvoiceHeader invHeader) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCount = itemCount;
        this.invHeader = invHeader;
        this.lineTotal = lineTotal;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public double getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(double lineTotal) {
        this.lineTotal(this.itemCount*this.itemPrice) = lineTotal;
    }

    public InvoiceHeader getInvHeader() {
        return invHeader;
    }

    public void setInvHeader(InvoiceHeader invHeader) {
        this.invHeader = invHeader;
    }
   



}
