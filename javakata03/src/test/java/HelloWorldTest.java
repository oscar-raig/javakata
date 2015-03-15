import org.junit.*;
import static org.junit.Assert.*;

public class HelloWorldTest {

	@Test
	public void testFail(){
	
		assertEquals(2, 2);	
	}


    @Test
    public void testAddEmpty(){
        int result = new calculator().Add("");
        assertEquals(0,result);
    }

    @Test
    public void testAddOne(){
        int result = new calculator().Add("1");
        assertEquals(1,result);
    }
}

