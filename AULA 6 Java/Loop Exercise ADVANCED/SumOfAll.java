public class SumOfAll{
	public static void main(String[] args){
		// Calculate the sum of all numbers 1-10
        int total = 0;

		for(int i = 0; i <=10; i = i + 1){
            total = total + i;
			System.out.println(total);
		}
        System.out.println("the sum of all numbers 1-10 is: " + total);
	}
}