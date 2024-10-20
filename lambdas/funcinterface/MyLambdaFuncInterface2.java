package lambdas.funcinterface;


@FunctionalInterface
interface JumpOn {
    void jumpJump(int howManyTimes);
}


public class MyLambdaFuncInterface2 {
    public static void main(String[] args) {
	JumpOn jumpOn = (n) -> {
	    for (int i = 1; i <= n; i++) {
		System.out.println("Jump # " + i);
	    }
	};
	
	jumpOn.jumpJump(3);
	
    }

}
