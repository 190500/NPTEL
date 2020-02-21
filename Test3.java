package nptel;

import java.util.Scanner;
class QuestionScope {
    int sum(int a, int b){ //non-static method
        return a + b;
    }
    static int multiply(int a, int b){ //static method
        return a * b;
    }
}
public class Test3{
   public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		QuestionScope q = new QuestionScope();
		//Called the method sum() to find the sum of two numbers.
		int add,mult;
		add= q.sum(x,y);
		//Called the method multiply() to find the product of two numbers.
		mult= q.multiply(x,y);

		System.out.println(add);
		System.out.print(mult);


}
}
