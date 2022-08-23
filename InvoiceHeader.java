package salesinvoicegenerator.model;

import javafx.scene.input.DataFormat;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class InvoiceHeader {
        private int invoiceNumber;
        private String customerName;
        private Date invoiceDate;
        private ArrayList<InvoiceLine> InvoiceLines ;

    public InvoiceHeader(int invoiceNumber, String customerName, Date invoiceDate) {
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.invoiceDate = invoiceDate;
        this.InvoiceLines = new ArrayList<>();
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String toString(){
        String str = "InvoiceHeader"{" + "invoiceNumber=" + InvoiceNumber + " , customerName=" + customerName + ", invoiceDate=" + InvoiceDate + " };
        for (InvoiceHeader line: getlines()){
                str += "\n\t" + line;
        }
        return str
    }
    public ArrayList<InvoiceLine> getlines(){
        if (lines == null)
            lines = new ArrayList<>();
        return lines;
    }
    public void setLines(ArrayList<InvoiceLine> lines){
        this.lines = lines;
    }
   public void addInvoiceLine(InvoiceLine line){
    getlines().add(line);
}
   
    }

