class SumOfNumbersDivisibleBy3And5{

   private int sumOfNumbersDivisibleBy3And5 = 0;
   private int sumOfNumbersDivisibleBy3 = 0;
   private int sumOfNumbersDivisibleBy5 = 0;
   private int sumOfNumbersDivisibleBy15 = 0;
   private static final int MAXIMUM_NUMBER = 1000;
   
   public int getSumOfNumbersDivisibleBy3And5(){
       computeSumOfNumbersDivisibleBy3And5();
       return sumOfNumbersDivisibleBy3And5;
   }
   
   public void computeSumOfNumbersDivisibleBy3And5(){
       computeSumOfNumbersDivisibleBy3();
       computeSumOfNumbersDivisibleBy5();
       computeSumOfNumbersDivisibleBy15();
       sumOfNumbersDivisibleBy3And5 = sumOfNumbersDivisibleBy3 + sumOfNumbersDivisibleBy5 - sumOfNumbersDivisibleBy15;
   }
   
   public void computeSumOfNumbersDivisibleBy3(){
       for(int i=0; i<=MAXIMUM_NUMBER; i++){
           if((i % 3) == 0){
	       sumOfNumbersDivisibleBy3 += i;
	   }
       } 
   }

   public void computeSumOfNumbersDivisibleBy5(){
       for(int i=0; i<=MAXIMUM_NUMBER; i++){
           if((i % 5) == 0){
	       sumOfNumbersDivisibleBy5 += i;
	   }
       }
   }

   public void computeSumOfNumbersDivisibleBy15() {
       for(int i=0; i<= MAXIMUM_NUMBER; i++){
           if((i % 15) == 0){
	       sumOfNumbersDivisibleBy15 += i;
	   }    
       }
   }  
    
}

public class EulerProjectProblem0{
   public static void main(String[] args){
       SumOfNumbersDivisibleBy3And5 sum = new SumOfNumbersDivisibleBy3And5(); 
       System.out.println(sum.getSumOfNumbersDivisibleBy3And5());     
   }   
}
