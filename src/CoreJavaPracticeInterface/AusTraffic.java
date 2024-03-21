package CoreJavaPracticeInterface;

public class AusTraffic implements CentralTraffic, ContinentalTraffic{

	public static void main(String[] args) {
		AusTraffic rules = new AusTraffic();
		rules.green();
		rules.TrainSymbol();

	}

	@Override
	public void green() {
		System.out.println(" Rules for green signal ");
	}

	@Override
	public void red() {
		System.out.println(" Rules for red signal ");
		
	}

	@Override
	public void yellow() {
		System.out.println(" Rules for yellow signal ");
		
	}

	@Override
	public void TrainSymbol() {
		System.out.println("Rules for Train Signal");
		
	}

}
