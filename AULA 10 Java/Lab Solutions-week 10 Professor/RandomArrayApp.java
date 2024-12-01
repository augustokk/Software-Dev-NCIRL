import javax.swing.JOptionPane;

public class RandomArrayApp {
    public static void main(String[] args) {
        
        RandomArray ra = new RandomArray();

        // INPUT
        int size = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the size of the array you wish to make:"));
        int smallest = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the smallest number in the array:"));
        int largest = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the largest number in the array:"));
        ra.setSize(size);
        ra.setRandStart(smallest);
        ra.setRandEnd(largest);


        // PROCESS
        ra.computeRandomArray();

        // OUTPUT
        ra.printArray();


        // get the random array and use it with our arrayOps object
        int [] data = ra.getData();

        ArrayOps ao = new ArrayOps();
        
        // this will compute the max and sum from the random array
        ao.computeMaxSum(data);

        // get the max and sum when computation is finished
        int max = ao.getMax();
        int sum = ao.getSum();

        JOptionPane.showMessageDialog(null, "The max is: " + max);
        JOptionPane.showMessageDialog(null, "The sum is: " + sum);


        SubsetArray sa = new SubsetArray();

        int [] odds = sa.oddEvenSplit(data, 1); // return only the odd values
        for(int o : odds){
            System.out.print(o + ",");
        }

        System.out.println();

        int [] evens = sa.oddEvenSplit(data, 0); // return only the odd values
        for(int e : evens){
            System.out.print(e + ",");
        }
    }
}
