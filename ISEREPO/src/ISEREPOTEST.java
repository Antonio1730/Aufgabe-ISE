import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ISEREPOTEST {

	@Test
	void testAddiere() 
	{
		Grundschüler Tobi = new Grundschüler();
		
		int expected= 28;
		int actual = Tobi.addiere();
		assertEquals(expected, actual);
	}
}

