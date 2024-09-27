public class Main {
    public static void main(String[] args) {
        Category categoryProduct = new Category(101, "Smartphone", "Electronics");
        System.out.println("Category Product Info:");
        categoryProduct.displayCategoryInfo();

        System.out.println();

        Brand brandProduct = new Brand(102, "Laptop", "Dell");
        System.out.println("Brand Product Info:");
        brandProduct.displayBrandInfo();
    }
}
