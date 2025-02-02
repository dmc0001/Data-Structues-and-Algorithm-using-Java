package DS_03_Number_System.Bit_Manipulation.Part_2;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwoOrNot(31));
    }

    static boolean isPowerOfTwoOrNot(int n) {
        if(n == 0) return false;
        return (n & (n - 1)) == 0;
    }
}
