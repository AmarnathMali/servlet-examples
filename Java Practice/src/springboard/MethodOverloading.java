package springboard;

public class MethodOverloading {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		hello();
//		hello(1);

		for(String str: args){
			System.out.println(str);
		}
		
	}
	public static void hello(){
		System.out.println("ram");
	}
	public static int hello(int i){
		return 1;
	}

}
