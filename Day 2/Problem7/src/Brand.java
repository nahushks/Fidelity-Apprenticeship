class Brand extends Product {
    String brandName;

    public Brand(int productId, String productName, String brandName) {
        super(productId, productName);
        this.brandName = brandName;
    }

    public void displayBrandInfo() {
        displayProductInfo();
        System.out.println("Brand: " + brandName);
    }
}

