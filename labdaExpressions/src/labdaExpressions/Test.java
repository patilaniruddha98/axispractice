package labdaExpressions;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaCheck r=(a,b)->a+b;
		LambdaCheck s=(a,b)->a-b;
		
		System.out.println(r.operate(2, 4));
		System.out.println(s.operate(6, 4));
	}

}
