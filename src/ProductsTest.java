public class ProductsTest {
    public static void main(String[] args) {
        Category category1 = new Category("akcesoria komputerowe", "różne drobiazgi do komputera");
        Category category2 = new Category("pamięci", "różne rodzaje pamięci komputerowych");
        Product product1 = new Product("M1", 54.20, "mysz bezprzewodowa", category1);
        Product product2 = new Product("M2", 34.80, "mysz przewodowa", category1);
        Product product3 = new Product("P1", 154.20, "DDR55", category2);
        Product product4 = new Product("C1", 534.20, "router bezprzewodowy", null);
        SpecialOffer specialOffer = new SpecialOffer(product1, "rabat urodzinowy",
                "1.06-30.06", 0.2);

        product1.show();
        System.out.println("  Rabat:\n    " + specialOffer.description + "    czas: " + specialOffer.time +
                " wielkość rabatu: " + specialOffer.discount);
        product2.show();
        product3.show();
        System.out.print(product4.name + " (" + product4.description + ") cena: " + product4.price + "zł");
    }
}
