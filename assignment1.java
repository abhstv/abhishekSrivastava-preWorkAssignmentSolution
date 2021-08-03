import java.util.Scanner;

public class assignment1 {

Scanner sc = new Scanner(System.in);
           //function to checkPalindrome
       public void checkPalindrome()  {

        String original, reverse = "";      
        System.out.print("Enter a number to check if it is a palindrome :");  
        original = sc.nextLine();   
        int length = original.length();   
        for ( int i = length - 1; i >= 0; i-- )  
           reverse = reverse + original.charAt(i);  
        if (original.equals(reverse))  
           System.out.println("Entered number is a palindrome.\n");  
        else  
           System.out.println("Entered number isn't a palindrome.\n"); 
      }
            //function to printPattern
       public void printPattern() {
        System.out.print("Enter a number to print star pattern :");
        int a = sc.nextInt();
        for (int i = a; i>0; i--){
          for (int j = 0; j<i; j++)
            System.out.print("*");
          System.out.println("");
        }
        System.out.println("\n");
      }
          //function to check no is prime or not
        public void checkPrimeNumber() {
        System.out.print("Enter a number to check :");
        int n = sc.nextInt(); 
         int m=0,flag=0;      
          m=n/2;      
          if(n==0||n==1){  
            System.out.println("Entered number is not prime number.\n");      
          }else{  
            for(int i=2;i<=m;i++){      
             if(n%i==0){      
              System.out.println("Entered number is not prime number.\n");      
              flag=1;      
              break;      
              }      
            }      
             if(flag==0)  {
               System.out.println("Entered number is prime number.\n"); }  
              }   
         }
          // function to print Fibonacci Series
          public void printFibonacciSeries() {
            System.out.print("Enter a number to generate fibonacci Series :");
            int n = sc.nextInt();
            int first = 0, second = 1;
            System.out.print(first+", ");
            System.out.print(second+", ");
            for (int i = 1; i<n; i++){
             int next = first + second;
             System.out.print(next);
             first = second;
             second = next;
             if (i<n-1)
              System.out.print(", ");
            }
            System.out.print("\n");
          }

 

//main method which contains switch and do while loop

      public static void main(String[] args) {

                assignment1 obj = new assignment1();

                int choice;

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

 

choice = sc.nextInt();

switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {

obj.checkPalindrome();

}

break;

 

case 2: {

 

obj.printPattern();

}

break;

 

case 3: {

obj.checkPrimeNumber();

}

break;

 

case 4: {

 

obj.printFibonacciSeries();

}

break;

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

 

}