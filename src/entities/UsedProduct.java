package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product{
    private Date manufactureDate;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public UsedProduct(String productName, Double productPrice, Date manufactureDate) {
        super(productName, productPrice);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return this.manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String toString() {
        return productName + " (used) " + "$ " + productPrice + " (Manufacture date: " + sdf.format(manufactureDate) + ")";
    }
}
