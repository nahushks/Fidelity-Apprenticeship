class Brand extends Category {
    String brandName;

    public Brand(int productId, String productName, String categoryName, String brandName) {
        super(productId, productName, categoryName);
        this.brandName = brandName;
    }

    public void displayBrandInfo() {
        displayCategoryInfo();
        System.out.println("Brand: " + brandName);
    }
}