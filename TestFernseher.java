

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestFernseher
{
    @Test
    // Zoll = 15 | false
    public void testFernseher_zoll_klein()
    {
        Fernseher f;
        f = new Fernseher("LG", 15, false);
        
        f.printFernseher();
        assertEquals(20, f.getZoll());
    }
    
    // Zoll = 50 | true
    @Test
    public void testFernseher_zoll_OK()
    {
        Fernseher f;
        f = new Fernseher("Samsung", 50, true);
        
        f.printFernseher();
        assertEquals(50, f.getZoll());
    }
    
    // Zoll = 150 | false
    @Test
    public void testFernseher_zoll_groß()
    {
        Fernseher f;
        f = new Fernseher("LG", 150, true);
        
        f.printFernseher();
        assertEquals(20, f.getZoll());
    }
}
