package aug30;

public class Result extends Test implements Sports {

	//calculate the total result
	private int calucateResult() {
		return getSubject1Marks()+getSubject2Marks()+getSubject3Marks()+(SPORTSMARKS*3);
	}
	//display result of student
	void showResults() {
		System.out.println("Total Reslut is "+calucateResult());
	}

	@Override
	public void show_sportswt() {
		System.out.println("Sports weightage is:"+SPORTSMARKS);
		
	}

}
