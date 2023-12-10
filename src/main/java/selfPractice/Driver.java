package selfPractice;

public class Driver {

	public static void main(String[] args) {
		Parent up1 = new Parent();
		up1.print();
		
		Child uc1 = new Child();
		uc1.print();
		
		Parent upCast = new Child();
		upCast.upP();	//If we upcast then we can use members of super class
//		upCast.upC();	//If we upcast then we can't use members of sub class
		
		Child downCast = (Child) new Parent();
		
//		Child c3 = new Child2();
		
		Parent classCastExc = new Child();
		Child2 classCastExc2 = (Child2) classCastExc;
		
	}

}
