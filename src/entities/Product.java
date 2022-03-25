package entities;

public class Product {
    protected String productName;
    protected Double productPrice;

    public Product() {
        super();
    }

    public Product(String productName, Double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return this.productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String toString() {
        return productName + " $ " + String.format("%.2f", productPrice);
    }
}
