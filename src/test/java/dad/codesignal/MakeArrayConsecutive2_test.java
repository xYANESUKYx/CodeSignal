package dad.codesignal;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class MakeArrayConsecutive2_test {
	private MakeArrayConsecutive2 makeArrayConsecutive2;
	
	@Before
	public void setup() {
		makeArrayConsecutive2 = new MakeArrayConsecutive2();
	}
	
	@Test
	public void test1(){
		int[] statues = {6, 2, 3, 8};
		assertEquals(3, makeArrayConsecutive2.solution(statues));
	}
	
	@Test
	public void test2(){
		int[] statues = {0, 3};
		assertEquals(2, makeArrayConsecutive2.solution(statues));
	}
	
	@Test
	public void test3(){
		int[] statues = {5, 4, 6};
		assertEquals(0, makeArrayConsecutive2.solution(statues));
	}
	
	@Test
	public void test4(){
		int[] statues = {6, 3};
		assertEquals(2, makeArrayConsecutive2.solution(statues));
	}
	
	@Test
	public void test5(){
		int[] statues = {1};
		assertEquals(0, makeArrayConsecutive2.solution(statues));
	}

}
