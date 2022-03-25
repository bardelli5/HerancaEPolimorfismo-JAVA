package entities;

public final class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(String productName, Double productPrice, Double customsFee) {
        super(productName, productPrice);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return this.customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public double totalPrice() {
        return productPrice + customsFee;
    }

    public String toString() {
        return productName + " $ " + String.format("%.2f", totalPrice()) + " (Customs fee: $ " + String.format("%.2f", customsFee) + ")";
    }
}
