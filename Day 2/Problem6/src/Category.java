class Category extends Product {
    String categoryName;

    public Category(int productId, String productName, String categoryName) {
        super(productId, productName);
        this.categoryName = categoryName;
    }

    public void displayCategoryInfo() {
        displayProductInfo();
        System.out.println("Category: " + categoryName);
    }
}