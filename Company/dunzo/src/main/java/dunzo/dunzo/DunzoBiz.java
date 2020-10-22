package dunzo.dunzo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DunzoBiz {
	
	Map<StringBuilder, Integer> map = new HashMap();
	StringBuilder state = new StringBuilder();

	public int getRich(long initialEnergy, List<Integer> energy, List<Integer> coins) {
		    // Write your code here
		 // printTestCase(initialEnergy, energy, coins);
		  if(energy.size() == 0) return 0;
		  int maxCoins = getMaxCoins(energy, coins, initialEnergy, 0, 0);
		  return maxCoins;
		  

		}
	
	private int getMaxCoins(List<Integer> energyList, List<Integer> coinsList,
								long currEnergy, int currCoin,
								int index) {
		
		if(index == coinsList.size() || index == energyList.size() || currEnergy == -1) return currCoin;
		
		state.append("-");
		state.append(Long.toString(index));
		state.append("-");
		state.append(Long.toString(coinsList.get(index)));
		state.append("-");
		state.append(Long.toString(energyList.get(index)));
		//String state = "-" + Long.toString(index) + "-" + Long.toString(currEnergy) + "-" + Long.toString(currCoin); 
		
		
		if(map.containsKey(state)) {
			int maxCoins = map.get(state);
			System.out.println("map contains state - " + state + " value - " + maxCoins);
			state.setLength(0);
			return maxCoins;
		}
		
		int coin1 = getMaxCoins(energyList, coinsList, currEnergy + energyList.get(index) - 1, currCoin, index+1);
		int coin2 = getMaxCoins(energyList, coinsList, currEnergy - 1, currCoin + coinsList.get(index), index+1);
		
		int maxCoins = Math.max(coin1, coin2);
		
		map.put(state, maxCoins);
		state.setLength(0);
		System.out.println("index - " + index + " maxCoins -  " + maxCoins);
		return maxCoins;
	}
	
	private void printTestCase(long initialEnergy, List<Integer> energy, List<Integer> coins) {
		System.out.println("initialEnergy - " + initialEnergy + 
						" size of energy Array - " + energy.size()
						+ " size of coins array - " + coins.size());
		
		System.out.println("Start energy");
		
		for(Integer energyElem : energy) {
            System.out.print(energyElem + ",");
        }
		
		System.out.println();
		System.out.println("Start coins");
		
		for(Integer coinsElem : coins) {
            System.out.print(coinsElem + "\t");
        }
		
	}

}
