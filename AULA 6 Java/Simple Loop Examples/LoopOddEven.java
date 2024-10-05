public class LoopOddEven{
	public static void main(String[] args){
		//Print number from 0 to 100
        //Tell if is odd or even
		for(int i = 0; i <=100; i = i +1){
            if(i % 2 == 0){
                System.out.println("# " + i + " is Even");
            } 
        else{
            System.out.println("# " + i + " is Odd");
        }
		}
	}
}