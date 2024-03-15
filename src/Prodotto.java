public class Prodotto {
    private TipoProdotto tipo;
    private String produttore;
    private String modello;
    private String descrizione;
    private float dimensioneDisplay;
    private int spazioArchiviazione;
    private float prezzoAcquisto;
    private float prezzoVendita;
    private int id;


    public Prodotto(TipoProdotto tipo, String produttore, String modello,
                    String descrizione, float dimensioneDisplay, int spazioArchiviazione,
                    float prezzoAcquisto, float prezzoVendita, int id) {
        this.tipo = tipo;
        this.produttore = produttore;
        this.modello = modello;
        this.descrizione = descrizione;
        this.dimensioneDisplay = dimensioneDisplay;
        this.spazioArchiviazione = spazioArchiviazione;
        this.prezzoAcquisto = prezzoAcquisto;
        this.prezzoVendita = prezzoVendita;
        this.id = id;
    }

    public Prodotto(TipoProdotto tipo, String produttore, String modello, float prezzoVendita) {
        this.tipo = tipo;
        this.produttore = produttore;
        this.modello = modello;
        this.prezzoVendita = prezzoVendita;
    }

    public TipoProdotto getTipo() {
        return tipo;
    }

    public void setTipo(TipoProdotto tipo) {
        this.tipo = tipo;
    }

    public String getProduttore() {
        return produttore;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public float getDimensioneDisplay() {
        return dimensioneDisplay;
    }

    public void setDimensioneDisplay(float dimensioneDisplay) {
        this.dimensioneDisplay = dimensioneDisplay;
    }

    public int getSpazioArchiviazione() {
        return spazioArchiviazione;
    }

    public void setSpazioArchiviazione(int spazioArchiviazione) {
        this.spazioArchiviazione = spazioArchiviazione;
    }

    public float getPrezzoAcquisto() {
        return prezzoAcquisto;
    }

    public void setPrezzoAcquisto(float prezzoAcquisto) {
        this.prezzoAcquisto = prezzoAcquisto;
    }

    public float getPrezzoVendita() {
        return prezzoVendita;
    }

    public void setPrezzoVendita(float prezzoVendita) {
        this.prezzoVendita = prezzoVendita;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Prodotto: " +
                "tipo: " + tipo +
                ", produttore: " + produttore + '\'' +
                ", modello: " + modello + '\'' +
                ", descrizione: " + descrizione + '\'' +
                ", dimensioneDisplay: " + dimensioneDisplay +
                ", spazioArchiviazione: " + spazioArchiviazione +
                ", prezzoAcquisto: " + prezzoAcquisto +
                ", prezzoVendita: " + prezzoVendita +
                ", id: " + id;
    }
}
