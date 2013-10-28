package spai.egit2.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import spai.egit2.NumeroEntero;

public class NumeroEnteroTest {
    private NumeroEntero numero;

    @Before
    public void initObjects() {
        this.numero = new NumeroEntero(100);
    }

    @Test
    public void testConstructorSinParametros() {
        NumeroEntero numero = new NumeroEntero();
        assertEquals(0, numero.getValor());
    }
    
    @Test
    public void testConstructorConParametros() {
        NumeroEntero numero = new NumeroEntero(-10);
        assertEquals(-10, numero.getValor());
    }

    @Test
    public void testIncrementar() {
        this.numero.incrementar();
        assertEquals(101, this.numero.getValor());
    }

    @Test
    public void testDoblar() {
        this.numero.doblar();
        assertEquals(200, this.numero.getValor());
    }

    @Test
    public void testDecrementar() {
        this.numero.decrementar();
        assertEquals(99, numero.getValor());
        numero = new NumeroEntero();
        this.numero.decrementar();
        assertEquals(-1, numero.getValor());
    }
    
    @Test
    public void testIncrementarConParametro(){
    	NumeroEntero entero1 = new NumeroEntero(2).incrementarConParametro(3);
    	assertEquals((new NumeroEntero(5)).getValor(), entero1.getValor());
    }
    
    @Test
    public void testDecrementarConParametro(){
    	NumeroEntero entero2 = new NumeroEntero(5).decrementarConParametro(3);
    	assertEquals((new NumeroEntero(2)).getValor(), entero2.getValor());
    }

}
