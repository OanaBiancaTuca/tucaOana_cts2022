package teste;

import clase.CnpInvalidException;
import clase.Persoana;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestGetSex {

    @Test
    public void testRight(){
        Persoana persoana= new Persoana("Andrei","50000000000000");
        assertEquals("M",persoana.getSex());

    }
    @Test
    public void testBoundaryInferior(){
        Persoana persoana= new Persoana("Andrei","10000000000000");
        assertEquals("M",persoana.getSex());
    }
    @Test
    public void testBoundarySuperior(){
        Persoana persoana= new Persoana("Ana","60009080000000");
        assertEquals("F",persoana.getSex());
    }
    @Test
    public void testCrossCheck(){
        Persoana persoana= new Persoana("Ana","60009080000000");
        int cifra = persoana.CNP.charAt(0);
        assertEquals(cifra%2 != 0 ? "M":"F",persoana.getSex());
    }
    @Test(expected = CnpInvalidException.class)
    public void testError(){
        Persoana persoana= new Persoana("Ana","00009080000000");
        persoana.getSex();

    }
    @Test(expected = CnpInvalidException.class)
    public void testErrorLitera(){
        Persoana persoana= new Persoana("Ana","l0009080000000");
        persoana.getSex();

    }
    @Test(timeout = 100)
    public void testPerformanta(){
        Persoana persoana= new Persoana("Ana","60009080000000");
        persoana.getSex();

    }
    @Test
    public void formatGetSexTest(){
        Persoana persoana= new Persoana("Ana","60009080000000");
        assertEquals(1,persoana.getSex().length());
    }
    @Test
    public void rangeGetSexTest(){
        Persoana persoana= new Persoana("Ana","70009080000000");
        assertEquals("N/A",persoana.getSex());
    }
    @Test(expected = NullPointerException.class)
    public void existanceGetSexTest(){
        Persoana persoana= new Persoana("Ana",null);
       persoana.getSex();
    }



}
