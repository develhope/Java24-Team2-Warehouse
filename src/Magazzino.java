import java.util.ArrayList;

public class Magazzino {
    protected ArrayList<Prodotto> prodottiStored = new ArrayList<>();

    public Magazzino() {
    }

    public ArrayList<Prodotto> getProdottiStored() {
        return prodottiStored;
    }

    public void printProducts(){
        for(Prodotto prodotto : prodottiStored){
            System.out.println(prodotto);
        }
    }
    public void searchTypeProduct(TipoProdotto x){
        System.out.println("La lista del tipo di dispositivo ricercato è:");
        for(Prodotto prodotto : prodottiStored){
            if(prodotto.getTipo().equals(x)){
                System.out.println(prodotto);
            }
        }
    }
    public void searchForProducer(String producer){
        System.out.println("I dispositivi del produttore" + producer + "sono: ");
        for(Prodotto prodotto : prodottiStored){
            if(prodotto.getProduttore().equalsIgnoreCase(producer)){
                System.out.println(prodotto);
            }
        }
    }
    public void searchForModel(String model){
        System.out.println("I dispositivi per modello ricercato sono: ");
        for(Prodotto prodotto : prodottiStored){
            if(prodotto.getModello().equalsIgnoreCase(model)){
                System.out.println(prodotto);
            }
        }
    }
}
