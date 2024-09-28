public class Operators {
    public static void main(String args[])
    {
        // Declare variables (when dealing with numbers and operators, pay attention to define the variable as int or double, because the result of the operation will be based on that, you can mix them and double will be the main result)

        int num1= 20;
        double num2= 3.0;

        //output
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
    
        // to be able to add text on your math operators you need add + sign after your string and set the maths inside of a parentheses
        System.out.println("the result of sum is " +  (num1 + num2));

    }
}