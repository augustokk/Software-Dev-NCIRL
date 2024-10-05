public class SumOfOddEven{
	public static void main(String[] args){
		// Calculate the sum of all even numbers 1-100 and all odd numbers 1-100 (1+3+5 etc and 2+4+6 etc)
        int totalOdd = 0;
        int totalEven = 0;

		for(int i = 0; i <=100; i = i + 1){
            if(i % 2 == 0){
                totalEven = totalEven + i;
            } 
            else{
                totalOdd = totalOdd + i;
            }

		}
        System.out.println("The sum of all even numbers 1-100 is: " + totalEven);
        System.out.println("The sum of all odd numbers 1-100 is: " + totalOdd);
	}
}