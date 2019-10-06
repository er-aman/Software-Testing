
public class Problem2Class {
	public void calcLights (double fuel_level,Problem2AlarmClass alarm) {
		boolean red [] = {false, false, false, false, true, true};
		boolean yellow [] = {false, false, false, true, true, true};
		boolean green [] = {false, false, true, true, true, true};
		boolean buzzer [] = {false, false, false, false, true, false};
		boolean chime [] = {true, true, true, true, false, true};
		int index;

		if (fuel_level >= 100.0)
			index = 0; 
		else
			if (fuel_level > 75.0)
				index = 1;
			else
				if (fuel_level >= 50.0)
					index = 2;
				else
					if (fuel_level > 25.0)
						index = 3;
					else
						if (fuel_level < 0.1)
							index = 4;
						else
							index = 5;

		alarm.setRedLight(red[index]);
		alarm.setYellowLight(yellow[index]);
		alarm.setGreenLight(green[index]);
		alarm.setBuzzer(buzzer[index]);
		alarm.setChime(chime[index]);
	}	
}
