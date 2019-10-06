
public class Problem1 {
	public double calcBalance(double balance) {
		int index; 
		double rate[]= {0.0,0.0,0.0155,0.0255,0.03155,0.0325};
		double fee[]= {500.0,150.0,0.0,0.0,0.0,0.0};
		double credit [] = {0.0,0.0,0.0,0.0,0.0,100.0};
		if(balance<0.0)
			index=0;
		else
			if(Math.abs(balance-0.0)<0.005)
				index=1;
			else 
				if(balance<800.0)
					index=2;
				else 
					if(balance<3_500.0)
						index=3;
					else 
						if(balance<250_000.0)
							index=4;
						else
							index=5;
		return  balance * (1.0 + rate[index])-fee[index]+ credit[index];
	}

}
