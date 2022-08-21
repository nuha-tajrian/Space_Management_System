/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import model.SpaceFlightDirectory;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author USER
 */
public class FlightDirectoryTest {
    
    SpaceFlightDirectory f1;
   @Before
   public void setUp()throws Exception{
       f1 = new SpaceFlightDirectory();
   }
    @Test
    public void testgetFlights(){
      
        assertEquals(null,f1.getFlights());
    }
    @Test
    public void testsetFlights(){
        f1.setFlights(null);
        assertEquals(null,f1.getFlights());
    }
    @Test
    public void testgetAirDir(){
       assertEquals(null,f1.getAirDir()); 
    }
    @Test
    public void testsetAirDir(){
        f1.setAirDir(null);
        assertEquals(null,f1.getAirDir());
        
        
    }
}
