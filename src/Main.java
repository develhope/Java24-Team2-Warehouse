public class Main {

    public static void main(String[] args) {
    Prodotto smartphone1 = new Prodotto(TipoProdotto.SMARTPHONE, "Apple", "Iphone1039583", "coaiew",
            15.2f, 256,
            130302.340f, 29293939399392929911.54444f, 1);
    Prodotto smarthpone2 = new Prodotto(TipoProdotto.SMARTPHONE, "Apple", "Iphone", 2333.33f);
    Prodotto tablet1 = new Prodotto(TipoProdotto.TABLET, "Samsung", "Galaxy Tab A7", 109.99f);
    Prodotto tablet2 = new Prodotto(TipoProdotto.TABLET, "Xiaomi", "Redmi Pad SE", 150.99f);
    Prodotto notebook1 = new Prodotto(TipoProdotto.NOTEBOOK, "Acer", "Aspire 5",
            "La memoria LPDDR4 offre un consumo energetico 5 volte inferiore in modalità standby rispetto alle DRAM standard.",
            15.6f, 512, 349.99f, 599.99f, 2);

    Magazzino magazzino = new Magazzino();
    magazzino.addProduct(smartphone1);
    magazzino.addProduct(smarthpone2);
    magazzino.addProduct(tablet1);
    magazzino.addProduct(tablet2);
    magazzino.addProduct(notebook1);

    System.out.println(smartphone1);
    System.out.println(smarthpone2);
    magazzino.printMagazzino();
    magazzino.searchInRange(0.0f, 300.00f);

    }
}
