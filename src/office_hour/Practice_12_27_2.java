package office_hour;

public class Practice_12_27_2 {
       /*
@@ -8,12 +10,14 @@
	 	2. write a method that can convert gallons to litters
	 			   Hint: 1 G = 3.75 L
	 	3. write a method that can print out the array in Descending order
	 	3. write a method that can print out the int array in Descending order
	 	4. write a method that accepts 3 parameters: 2 numbers and one operator,
	 	and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
			Ex: calculate(10, 2, "*") ==> 20;
				calculate(20, 2, "~") ==> invalid operator
		5. write a method that can calculate grade
					if score is 100 ~ 90 ==> A
					if score is 89 ~ 80 ==> B
@@ -30,6 +34,16 @@ public static void main(String[] args) {

        System.out.println(ConvertGallonToLitters(100));

        int[] array = {2, 3, 1, 5, 10, 18, 19, 20};

        DescOrder(array);
        System.out.println();


        claculate(10, 5, "@");

        calculate2(10, 5, '*');

    }


@@ -61,5 +75,66 @@ public static double ConvertGallonToLitters(double galons) {
        return litters;
    }

    // Task03:  write a method that can print out the int array in Descending order
    public static void DescOrder(int[] array) {
        //[2,3,1,5]
        Arrays.sort(array); //[1,2,3,5]
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }


    }

    //Task04:

    public static void claculate(int a, int b, String operators) {
        if (operators.equals("-")) {
            System.out.println(a - b);
        } else if (operators.equals("+"))
            System.out.println(a + b);
        else if (operators.equals("*"))
            System.out.println(a * b);
        else if (operators.equals("/"))
            System.out.println(a / b);
        else if (operators.equals("%"))
            System.out.println(a % b);
        else
            System.out.println("Invalid operator");

    }

    public static void calculate2(int a, int b, char operator) {

        switch (operator) {
            case '-':
                System.out.println(a - b);
                break;
            case '+':
                System.out.println(a + b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Invalid operator");
        }

    }


    //Task05:
    public static void GradeCalculator(double score) {

    }*/




}
