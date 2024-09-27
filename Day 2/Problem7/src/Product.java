class Product {
    int productId;
    String productName;

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public void displayProductInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
    }
}

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

