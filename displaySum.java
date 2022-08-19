
public class displaySum {
    public static void main(String[] args) {
        int nums[] = {1,2,3,-5,7};

        int sum = 0;
        int product = 1;
        double average;

        for (int i = 0; i < nums.length; i ++) {
            sum += nums[i];
            product *= nums[i];
        }

        average = (double) sum / nums.length;

        System.out.println("the sum = " + sum);
        System.out.println("the product = " + product);
        System.out.println("the avg = " + average);
    }


}
