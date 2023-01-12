package springboard;

public class MultilpleArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		adder(2,3,4,5,6,7,8,9,0,23,55,67,89);
	}

	public static void adder(int... number) {
		// TODO Auto-generated method stub
		if(number.length == 0){
			System.out.println("Please enter a number");
			return;
		}
		int total = 0;
		for(int num:number){
			total += num;
		}
		System.out.println(total);
		
	}

}
