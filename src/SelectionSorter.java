import java.util.ArrayList;


public class SelectionSorter {

	private Coin[] coins;
	
	public SelectionSorter(Coin[] c){
		coins = c;
	}
	
	public void sort(){
		ArrayList<Double> values = new ArrayList<Double>();
		
		for(int i= 0; i<coins.length; i++){
			for(int k= 1+i; k<coins.length; k++){
				if(coins[i].getValue()>coins[k].getValue()){
					Coin temp = new Coin(coins[i].getValue(), coins[i].getName());
					coins[i] = new Coin(coins[k].getValue(), coins[k].getName());
					coins[k] = temp;
				}//close if 
			}//close 2nd for
		}//close 1st for
	}//close sort()
}
