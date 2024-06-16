public class BitManipulation {

    public static void evenOrOdd(int n){
        int bitMask = 1;
        if((n & bitMask) == 0 ){
            System.out.println("No. is even");
        }else{
            System.out.println("No. is Odd"); 
        }
    }

    // get bit
    public static int getIthBit(int n, int i){
        int bitMask = 1 << i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    // set bit
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return bitMask | n;
    }


    // clear bit
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    // update bit
    public static int updateIthBit(int n, int i, int newBit) {
        // if(newBit == 0){
        //     return clearIthBit(n, i);
        // }else {
        //     return setIthBit(n, i);
        // }

        n = clearIthBit(n, i);
        int bitMask =  newBit<<i;
        return n | bitMask;
    }

    public static int clearIBit(int n, int i) {
        int bitMask = ((~0)<<i);
        return n & bitMask;
    }

    public static int clearRangeOfBits(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i) - 1;
        int bitMask = a|b;
        return n & bitMask;
    }

    // to check number is power of two or not
    public static boolean powerOfTwo(int n) {
        return (n & (n-1)) == 0;
    }

    // count set bits in number
    public static int countSetBits(int n){
        int count = 0;
        while(n>0) {
            if((n & 1) != 0){   //check LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    // Fast Exponentiation
    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if( (n & 1) != 0 ) {
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans ;
    }

    public static void main(String args[]){
        // evenOrOdd(5);
        // evenOrOdd(7);
        // evenOrOdd(12);

        // System.out.println(getIthBit(10, 2));
        // System.out.println(getIthBit(12, 3));

        // System.out.println(setIthBit(10, 2));

        // System.out.println(clearIthBit(10, 1));

        // System.out.println(updateIthBit(10, 2, 1));

        // System.out.println(clearIBit(15, 2));

        // System.out.println(clearRangeOfBits(10, 2, 4));

        // System.out.println(powerOfTwo(8));

        // System.out.println(countSetBits(10));

        System.out.println(fastExpo(3, 5));
        
    }
}
