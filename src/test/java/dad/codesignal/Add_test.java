package dad.codesignal;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class Add_test {
	private Add add;
	
	@Before
	public void setup() {
		add = new Add();
	}
	
	@Test
	public void test1_Ejercicio_1(){
		assertEquals(3, add.Ejercicio_1(1, 2));
	}
	
	@Test
	public void test2_Ejercicio_1(){
		assertEquals(1000, add.Ejercicio_1(0, 1000));
	}
	
	@Test
	public void test3_Ejercicio_1(){
		assertEquals(-37, add.Ejercicio_1(2, -39));
	}
	
	@Test
	public void test4_Ejercicio_1(){
		assertEquals(199, add.Ejercicio_1(99, 100));
	}
	
	@Test
	public void test5_Ejercicio_1(){
		assertEquals(0, add.Ejercicio_1(-100, 100));
	}
	
	@Test
	public void test6_Ejercicio_1(){
		assertEquals(-2000, add.Ejercicio_1(-1000, -1000));
	}
}