package Uebung;




import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;



class ISE {
	
	
	@Test
	void testAddiere() 
	{
		Grundsch�ler Tobi = new Grundsch�ler();
		
		int expected= 28;
		int actual = Tobi.addiere();
		assertEquals(expected, actual);
	
				
		
	}

	


}
