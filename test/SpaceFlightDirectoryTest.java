
import model.SpaceFlightDirectory;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SpaceFlightDirectoryTest {
    
    SpaceFlightDirectory f1;
   @Before
   public void setUp()throws Exception{
       f1 = new SpaceFlightDirectory();
   }
    @Test
    public void testgetSpaceFlights(){
      
        assertEquals(null,f1.getSpaceFlights());
    }
    @Test
    public void testsetSpaceFlights(){
        f1.setSpaceFlights(null);
        assertEquals(null,f1.getSpaceFlights());
    }
    @Test
    public void testgetSpaceDir(){
       assertEquals(null,f1.getSpaceDir()); 
    }
    @Test
    public void testsetSpaceDir(){
        f1.setSpaceDir(null);
        assertEquals(null,f1.getSpaceDir());
        
        
    }
}
