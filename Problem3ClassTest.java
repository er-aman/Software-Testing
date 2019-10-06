import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem3ClassTest {
	
	Problem3Class prob3;
	
	@Before
	public void setUp () {
		prob3 = new Problem3Class();
	}
	
	@Test
	@FileParameters("src/files/TestCaseTable.csv")	
	public void test(int TestCaseNumber, boolean gearUp, double altfeet, boolean expGndCollCaut, boolean expGndCollWarn, boolean expGndCollAlert, boolean expEmerGD, String BasisPathtested) {
		prob3.setGndCollCaut(!expGndCollCaut);
		prob3.setGndCollWarn(!expGndCollWarn);
		prob3.setGndCollAlert(!expGndCollAlert);
		prob3.setEmerGD(!expEmerGD);
		prob3.gndCollWarning(gearUp,altfeet );
		assertEquals(expGndCollCaut, prob3.isGndCollCaut());
		assertEquals(expGndCollWarn, prob3.isGndCollWarn());
		assertEquals(expGndCollAlert, prob3.isGndCollAlert());
		assertEquals(expEmerGD, prob3.isEmerGD());
	}
}