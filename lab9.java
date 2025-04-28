public class Comp1111L9 { 
    
    public static void main(String[] args) { 
    //System.out.println(power(5,21)); 
    // //displayDigits(12341); 
    // //System.out.println(sumOfSquares(3)); 
    // //System.out.println(countEvenDigits(2146)); 
    // // Output: 3 
    // //System.out.println(5*5+4*4+3*3+2*2+1); 
//System.out.println(5*5+4*4+3*3+2*2+1); 
     System.out.println(sumToN(5));
  //   System.out.println(sumToNum(5));
    } 



//example with for loop
    public static int sumToN(int n){ // e.g. n=5

       int sum = 0;
      
       for (int i = 1; i <= n; i++) {
        sum += i;
       }
       return sum; // output: 15
    }






//example with recursion
    public static int sumToNum(int n) { // n=1
        if (n == 1) { // Base case
            return 1; 
        } else { // Recursive call
            return n + sumToNum(n - 1);
        }
    }



    
    public static double sumOfSquares(int n){ 
        if (n>1){ 
            return n*n+sumOfSquares(n-1);
        } else{
            return 1;
            } 
        } 
                


    public static int power(int x, int y){ 
        if (y==0){
             return 1;
        } 
        return x*power(x,y-1); 
    } 
              



    public static void displayDigits(int N){
         if (N>0){
             System.out.print(N%10+" ");
             displayDigits(N/10);
             } 
    } 
    

    public static int countEvenDigits(int n) {
        if (n == 0) {
             return 0;
         } 
         int lastDigit = n % 10; 
         if (lastDigit % sumToN2=)
         }
    }