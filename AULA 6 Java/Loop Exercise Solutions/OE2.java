public class OE2{
	public static void main(String[] args){
		//Calculate the sum of all even numbers 1-100 and all odd numbers 1-100 (1+3+5 etc and 2+4+6 etc)
		int sumEven=0;
		int sumOdd=0;

		for(int i=1;i<=100;i++){
			//Check if even
			if(i%2==0){
				sumEven=sumEven+i;
			}
			//if odd
			else{
				sumOdd=sumOdd+i;
			}
		}
		//after loop ends print the sum
		System.out.println("Sum of even nums: "+sumEven);
		System.out.println("Sum of odd nums: "+sumOdd);

	}
}