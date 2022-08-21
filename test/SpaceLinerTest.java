
import controller.SpaceLiner;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class SpaceLinerTest {
    SpaceLiner a;
    
   @Before
   public void setUp()throws Exception{
       a = new SpaceLiner();
   }
       
   @Test
   public void testgetPlanetsOperated(){
       assertEquals(0,a.getPlanetsOperated());
       
   }
   @Test
   public void testsetPlanetsOperated(){
       a.setPlanetsOperated(5);
       assertEquals(5,a.getPlanetsOperated());
   }
    @Test
    public void testgetOriginSpace(){
        assertEquals(null,a.getOriginSpace());
        
    }
    @Test
    public void testsetOriginSpace(){
        a.setOriginSpace(null);
        assertEquals(null,a.getOriginSpace());
    }
    @Test
    public void testgetName(){
        assertEquals(null,a.getName());
    }
    @Test
    public void testsetName(){
        a.setName("Nayem");
        assertEquals("Nayem",a.getName());
        
    }
    @Test
    public void testgetSpaceLineCode(){
        assertEquals(null,a.getSpaceLineCode());
    }
    @Test
    public void testsetSpaceLineCode(){
        a.setSpaceLineCode("A01");
        assertEquals("A01",a.getSpaceLineCode());
    }
    @Test
    public void testgetNumOfSpaceFlights(){
        assertEquals(null,a.getSpaceLineCode());
        
    }
    @Test
    public void testsetNumOfSpaceFlights(){
        a.setNumOfSpaceFlights(50);
        assertEquals(null,a.getSpaceLineCode());
        
    }
    @Test
    public void testtoString(){
        a.toString();
        assertEquals(null,a.getName());
        
    }
}
