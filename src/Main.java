public class Main {

    public static void main(String[] args) {
        Utente utente1 = new Utente();
        Prodotto smartphone1 = new Prodotto(TipoProdotto.SMARTPHONE, "Apple", "Iphone1039583",
                "La memoria LPDDR6 offre un consumo energetico 7 volte inferiore in modalità standby rispetto alle DRAM standard.",
                15.2f, 256,
                700f, 899f, 1);
        Prodotto smartphone2 = new Prodotto(TipoProdotto.SMARTPHONE, "Apple", "Iphone", 1200f, 5);
        Prodotto tablet1 = new Prodotto(TipoProdotto.TABLET, "Samsung", "Galaxy Tab A7", 109.99f, 6);
        Prodotto tablet2 = new Prodotto(TipoProdotto.TABLET, "Xiaomi", "Redmi Pad SE", 150.99f, 7);
        Prodotto notebook1 = new Prodotto(TipoProdotto.NOTEBOOK, "Acer", "Aspire 5",
                "La memoria LPDDR4 offre un consumo energetico 5 volte inferiore in modalità standby rispetto alle DRAM standard.",
                15.6f, 512, 349.99f, 599.99f, 2);

        Magazzino magazzino = new Magazzino();
        magazzino.addProduct(smartphone1);
        magazzino.addProduct(smartphone2);
        magazzino.addProduct(tablet1);
        magazzino.addProduct(tablet2);
        magazzino.addProduct(notebook1);

        Prodotto prodottoEliminato = magazzino.deleteProduct(2);
        magazzino.printMagazzino();
        utente1.aggiungiProdottoCarrello(prodottoEliminato);
        Prodotto x = utente1.rimuoviProdottoCarrello(6);
        magazzino.addProduct(x);
    }
}
