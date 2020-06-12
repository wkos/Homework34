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

    Product(String name, double price, String description){
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public void show(){
        System.out.println("\n" + name + " (" + description + ") cena: " + price + "zł");
        System.out.println("  Kategoria:   " + category.name + " (" + category.description + ")");
    }

    public void show(boolean withoutCategory){
        System.out.println("\n" + name + " (" + description + ") cena: " + price + "zł");
        System.out.println("  Kategoria:   brak");
    }
}
