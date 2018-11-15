package Uebung;




import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;



class ISE {
	
	
	@Test
	void testAddiere() 
	{
		Grundschüler Tobi = new Grundschüler();
		
		int expected= 28;
		int actual = Tobi.addiere();
		assertEquals(expected, actual);
	
				
		
	}

	


}
