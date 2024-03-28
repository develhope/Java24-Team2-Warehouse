public class Utente {
    private Carrello carrelloUtente = new Carrello();

    public void aggiungiProdottoCarrello(Prodotto prodotto) {
        this.carrelloUtente.addProduct(prodotto);
    }

    public Prodotto rimuoviProdottoCarrello(int id) {
        return carrelloUtente.deleteFromCart(id);
    }

}
