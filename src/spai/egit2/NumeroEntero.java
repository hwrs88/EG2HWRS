package spai.egit2;

public class NumeroEntero {
    private int valor;

    public NumeroEntero(int valor) {
        this.valor = valor;
    }

    public NumeroEntero() {
        this(0);
    }

    public int getValor() {
        return valor;
    }

    private void setValor(int valor) {
        this.valor = valor;
    }

    public void incrementar() {
        this.setValor(this.valor + 1);
    }

    public void doblar() {
        this.setValor(this.valor * 2);
    }

    public void decrementar() {
        this.valor--;
    }
    
    //Este metodo incrementa el objeto NumeroEntero con el int pasado como parametro
    public void incrementarConParametro(int parametro) {
        this.setValor(this.valor + parametro);
    }
    
    //Este metodo decrementa el objeto NumeroEntero con el int pasado como parametro
    public void decrementarConParametro(int parametro) {
        this.setValor(this.valor - parametro);
    }
    
}
