public class ProductsTest {
    public static void main(String[] args) {
        Category category1 = new Category("akcesoria komputerowe", "różne drobiazgi do komputera");
        Category category2 = new Category("pamięci", "różne rodzaje pamięci komputerowych");
        Product product1 = new Product("M1", 54.20, "mysz bezprzewodowa", category1);
        Product product2 = new Product("M2", 34.80, "mysz przewodowa", category1);
        Product product3 = new Product("P1", 154.20, "DDR55", category2);
        Product product4 = new Product("C1", 534.20, "router bezprzewodowy");
        SpecialOffer specialOffer = new SpecialOffer(product1, "rabat urodzinowy",
                "1.06-30.06", 0.2);

        System.out.println("Lista produktów");
        product1.show();
        System.out.println("  Rabat:       " + specialOffer.description + "    czas: " + specialOffer.time +
                "   wielkość rabatu: " + specialOffer.discount);
        product2.show();
        product3.show();
        product4.showWithoutCategory();
    }
}
