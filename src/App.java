public class App {
    private static int computeSum(int num1, int num2){//adds 2 integers
        return num1 + num2;//returns sum
    }
    private static int computeSum(int num1, int num2, int num3){//adds 3 integers
        return num1 + num2 + num3;//returns sum
    }

    private static int greaterValue(int num1, int num2){//compares 2 integers
        if (num1>num2){//checks if the the first integer is greater
            return num1;//returns the first integer
        }
        else{
            return num2;//returns the second integer
        }
    }

    private static double greaterValue(double num1, double num2){//compares 2 doubles
        if (num1>num2){//checks if the first double is greater
            return num1;//returns the first double
        }
        else{
            return num2;//returns the second double
        }
    }
    public static void main(String[] args) throws Exception {
        
        System.out.println("The sum of 1 and 2 is "+computeSum(1, 2));//prints the sum of 1+2
        System.out.println("The sum of 3, 4 and 5 is "+computeSum(3,4,5));//prints the sum of 3+4+5
        
        System.out.println("The greater value between 45 and 100 is " + greaterValue(45,100));//finds the greater value between 45 and 100
        System.out.println("The greater value between 3.14 and 9.8 is " + greaterValue(3.14,9.8));//finds the greater value between 3.14 and 9.8

    }
}