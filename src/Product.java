public class Product {
    String name;
    double price;
    String description;
    Category category;

    Product(String name, double price, String description, Category category){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public void show(){
        System.out.println(name + " (" + description + ") cena: " + price + "zł");
        System.out.println("  Kategoria: " + category.name + " (" + category.description + ")");
    }
}
