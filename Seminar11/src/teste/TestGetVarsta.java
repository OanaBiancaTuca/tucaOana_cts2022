package teste;
import clase.CnpInvalidException;
import clase.Persoana;
import org.junit.Test;

import java.util.InvalidPropertiesFormatException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class TestGetVarsta {
    @Test
    public void testRight(){
        Persoana persoana= new Persoana("Andrei","19812120000000");
        assertEquals(23,persoana.getVarsta());
    }
    @Test
    public void testBoundaryInferior(){
        Persoana persoana= new Persoana("Andrei","30001010000000");
        assertEquals(222,persoana.getVarsta());
    }
    @Test
    public void testBoundarySuperior(){
        Persoana persoana= new Persoana("Andrei","62201010000000");
        assertEquals(0,persoana.getVarsta());
    }
   @Test(expected = CnpInvalidException.class)
    public void testVarstaNegativa(){
       Persoana persoana= new Persoana("Andrei","62301010000000");
      persoana.getVarsta();
   }
   @Test(timeout = 100)
    public void verificaPerformanta(){
       Persoana persoana= new Persoana("Andrei","19812120000000");
       assertEquals(23,persoana.getVarsta());
   }

   @Test
    public void testGetVarstaConformance(){
       Persoana persoana= new Persoana("Andrei","19812120000000");
       assertTrue(persoana.getVarsta()>=0);
   }
   @Test
    public void testOrderGetVarsta(){
       Persoana persoana1= new Persoana("Andrei","19812120000000");
       Persoana persoana2= new Persoana("Ana","60012120000000");
        assertTrue(persoana1.getVarsta()>persoana2.getVarsta());
   }
   @Test(expected = NullPointerException.class)
   public void testGetVarstaExistance(){
       Persoana persoana1= new Persoana("Andrei",null);
       persoana1.getVarsta();
   }


}
