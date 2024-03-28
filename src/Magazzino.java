import java.util.ArrayList;

public class Magazzino {
    private ArrayList<Prodotto> prodottiStored = new ArrayList<>();

    public Magazzino() {
    }

    public ArrayList<Prodotto> getProdottiStored() {
        return prodottiStored;
    }

    public void printProducts() {
        for (Prodotto prodotto : prodottiStored) {
            System.out.println(prodotto);
        }
    }

    public void searchTypeProduct(TipoProdotto x) {
        int count = 0;
        System.out.println("La lista del tipo di dispositivo ricercato è:");
        for (Prodotto prodotto : prodottiStored) {
            if (prodotto.getTipo().equals(x)) {
                System.out.println(prodotto);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Nessun prodotto presente");
        }
    }

    public void searchForProducer(String producer) {
        System.out.println("I dispositivi del produttore" + producer + "sono: ");
        for (Prodotto prodotto : prodottiStored) {
            if (prodotto.getProduttore().equalsIgnoreCase(producer)) {
                System.out.println(prodotto);
            }
        }
    }

    public void searchForModel(String model) {
        System.out.println("I dispositivi per modello ricercato sono: ");
        for (Prodotto prodotto : prodottiStored) {
            if (prodotto.getModello().equalsIgnoreCase(model)) {
                System.out.println(prodotto);
            }
        }
    }

    public void searchBySellingPrice(float prezzo) {
        System.out.println("I dispositivi ricercati con questo criterio sono: ");
        for (Prodotto prodotto : prodottiStored) {
            if (prodotto.getPrezzoVendita() == prezzo) {
                System.out.println(prodotto);
            }
        }
    }

    public void searchByPurchasePrice(float prezzo) {
        System.out.println("I dispositivi ricercati con questo criterio sono: ");
        for (Prodotto prodotto : prodottiStored) {
            if (prodotto.getPrezzoAcquisto() == prezzo) {
                System.out.println(prodotto);
            }
        }
    }

    public void searchInRange(float prezzoInferiore, float prezzoSuperiore) {
        System.out.println("I dispositivi che rientrano nel range di prezzo selezionato sono: ");
        for (Prodotto prodotto : prodottiStored) {
            if (prodotto.getPrezzoVendita() >= prezzoInferiore && prodotto.getPrezzoVendita() <= prezzoSuperiore) {
                System.out.println(prodotto);
            }
        }
    }

    public void addProduct(Prodotto prodotto) {
        prodottiStored.add(prodotto);
    }

    public Prodotto deleteProduct(int id) {
        for (Prodotto prodotto : prodottiStored) {
            if (id == prodotto.getId()) {
                prodottiStored.remove(prodotto);
                return prodotto;
            }
        }
        return null;
    }

    public void printMagazzino() {
        for (Prodotto prodotto : this.prodottiStored) {
            System.out.println(prodotto);
        }
    }
}
