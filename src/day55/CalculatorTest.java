package day55;

public class CalculatorTest {
    public static void main(String[] args) {
        SimplyCalculator c1 = new SimplyCalculator();
//        c1.addNum(100);
        c1.addNum(100).addNum(200).addNum(100);
        c1.addNum(100)
                .addNum(200)
                .addNum(100)
                .minusNum(50)
                .displayFinalResult();

        ;
//        System.out.println(c1.result);
//        c1 = c1.addNum(100);
//        c1 = c1.addNum(200);
//        c1 = c1.addNum(100);
    }

}

