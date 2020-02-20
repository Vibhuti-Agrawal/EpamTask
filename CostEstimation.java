public class CostEstimation
{
	public double houseConstructionCost(String materialStandard, double areaOfHouse, boolean fullyAutomated)
	{
		if(materialStandard.equals("standard")){
			return 1200 * areaOfHouse;
		}	
    if(materialStandard.equals("abovestandard")){
			 return 1500 * areaOfHouse;
		}
    else if(materialStandard.equals("highstandard")){
      if(fullyautomated)
         return 2500 * areaOfHouse;
			else
				return 1800 * areaOfHouse;
		}
		return 0;
	}
}
