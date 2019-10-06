import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Problem2ClassTest {

Problem2Class prob2;
Problem2AlarmClass prob2Alarm;
double fuel_level;
boolean expRedLight,expYellowLight,expGreenLight,expBuzzer,expChime ;

@Before
public void setUp() throws Exception {
prob2 = new Problem2Class();
prob2Alarm= new Problem2AlarmClass();
}

   @Parameters
   public static Collection<Object[]> data() {
       return Arrays.asList(new Object[][] {     
//	Parameters are: (1,2,3,4)
// 1=fuel_level,2=expRedLight,3=expYellowLight,4=expGreenLight,5=expBuzzer,6=expChime
//	Test case 1
{100.0, false, false, false, false, true},
//	Test case 2
{75.1,false, false, false, false, true},
//	Test case 3
{50.0,false,	false, true, false, true},
//	Test case 4
{25.1,	false,	true, true, false, true},
//	Test case 5
{0.0,	true, true, true, true, false},
//	Test case 6
{0.1,	true, true, true, false, true},
//	Test case 7 
{99.9,	false,	false, false, false, true},
//	Test case 8 
{75.0,	false,	false, true, false, true},
//	Test case 9 
{49.9,	false,	true, true, false, true},
//	Test case 10 
{25.0,	true,	true, true, false, true},
//	Test case 11 
{200.0,	false,	false, false, false, true}
       });	
}

   public Problem2ClassTest (double fuel_level, boolean expRedLight,boolean expYellowLight,boolean expGreenLight, boolean expBuzzer, boolean expChime) {
   	this.fuel_level=fuel_level;
   	this.expRedLight = expRedLight;
   	this.expYellowLight=expYellowLight;
   	this.expGreenLight=expGreenLight;
   	this.expBuzzer=expBuzzer;
   	this.expChime=expChime;
   }

   @Test
public void test() {
	   prob2.calcLights(fuel_level,prob2Alarm);
	   assertEquals(expRedLight,prob2Alarm.isRedLight());
	   assertEquals(expYellowLight,prob2Alarm.isYellowLight());
	   assertEquals(expGreenLight,prob2Alarm.isGreenLight());
	   assertEquals(expBuzzer,prob2Alarm.isBuzzer());
	   assertEquals(expChime,prob2Alarm.isChime());
   }
}