import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class Problem1Test {
	private Problem1 prob1;
	
	@Before
	public void setUp () throws Exception {
		prob1 = new Problem1();
	}
	@SuppressWarnings("unused")
	private static final Object[] parametersProblem1Test () {
		return $(
//				Parameters are: (1)
//								1=balance, 2=expBal
//				Test case 1
				$(-0.01, -500.01),
//				Test case 2
				$(0.00,-150.00),
//				Test case 3
				$(799.99, 812.38),
//				Test case 4
				$(3_499.99, 3_589.23),
//				Test case 5
				$(249_999.99, 257_887.48),
//				Test case 6
				$(2_50_000.00, 258_225.00),
//				Test case 7
				$(-1_000.00, -1_500.00),
//				Test case 8
				$(0.01, 0.01),
//				Test case 9
				$(800.00, 820.40),
//				Test case 10
				$(3_500.00, 3_610.42),
//				Test case 11
				$(3_00_000.00, 309_850.00)
		);
	}
	@Test
	@Parameters(method="parametersProblem1Test")
	public void test(double balance, double expBal) {
		
		assertEquals(expBal, prob1.calcBalance(balance),0.01);
	
	}
}

