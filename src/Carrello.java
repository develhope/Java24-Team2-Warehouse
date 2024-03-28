import java.util.ArrayList;

public class Carrello {
    private ArrayList<Prodotto> purchasedProducts = new ArrayList<>();

    public Carrello() {
    }

    public ArrayList<Prodotto> getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(ArrayList<Prodotto> purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public void addProduct(Prodotto prodotto) {
        this.purchasedProducts.add(prodotto);
    }

    public Prodotto deleteFromCart(int id) {
        for (Prodotto prodotto : purchasedProducts) {
            if (id == prodotto.getId()) {
                purchasedProducts.remove(prodotto);
                return prodotto;
            }
        }
        return null;
    }

    public float totaleCarrello() {
        float totale = 0;
        for (Prodotto prodotto : purchasedProducts) {
            totale += prodotto.getPrezzoVendita();
        }
        return totale;
    }

    public float spesaMedia(TipoProdotto tipo) {
        float sum = 0;
        int count = 1;
        for (Prodotto prodotto : purchasedProducts) {
            if (prodotto.getTipo().equals(tipo)) {
                sum += prodotto.getPrezzoAcquisto();
                count++;
            }
        }
        return sum;
    }

    public void checkout() {
        this.purchasedProducts.clear();
    }

}
