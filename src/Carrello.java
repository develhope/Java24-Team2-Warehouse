import java.util.ArrayList;

public class Carrello extends Magazzino {
    private ArrayList<Prodotto> purchasedProducts = new ArrayList<>();

    public Carrello() {

    }

    public ArrayList<Prodotto> getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(ArrayList<Prodotto> purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public ArrayList<Prodotto> addProducts(int findId) {
        for (Prodotto prodotto : prodottiStored) {
            if (findId == prodotto.getId()) {
                purchasedProducts.add(prodotto);
                prodottiStored.remove(prodotto);
                break;
            }
        }
        return prodottiStored;
    }

    public ArrayList<Prodotto> remProduct(int findId) {
        for (Prodotto prodotto : prodottiStored) {
            if (findId == prodotto.getId()) {
                purchasedProducts.remove(prodotto);
                prodottiStored.add(prodotto);
                break;
            }
        }
        return prodottiStored;
    }

    public float tot() {
        float totale = 0;
        for (Prodotto prodotto : purchasedProducts) {
            totale += prodotto.getPrezzoVendita();
        }
        return totale;
    }

    public float medium(TipoProdotto tipo) {
        float sum = 0;
        int count = 1;
        for (Prodotto prodotto : purchasedProducts) {
            if (prodotto.getTipo().equals(tipo)) {
                sum += prodotto.getPrezzoAcquisto() / count;
                count++;
            }
        }
        return sum;
    }

    public void checkout() {
        for (Prodotto prodotto : purchasedProducts) {
            purchasedProducts.remove(prodotto);
            prodottiStored.remove(prodotto);
        }
    }
}
